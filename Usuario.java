
/**
 * Clase del usuario que está a dieta.
 */
public class Usuario
{
    // Nombre del usuario.
    private String usuario;
    // Cantidad en gramos del alimento que va a comer
    private float gramos;  
    // Alimento que va a comer el usuario.
    private Alimento alimento;
    // Cantidad del alimento más calorico.
    private float muyCalorico;
   
    /**
     * Constructor al que introducimos un nombre de usuario y 
     */
    public Usuario(String usuario)    
    {
        this.usuario = usuario;
        gramos = 0;
        alimento = null;
        muyCalorico = 0;
    }
    
    /**
     * Da de comer al usuario un alimento concreto con una cantidad concreta.
     */
    public void comer(Alimento alimento, float gramos)
    {
        this.alimento = alimento;
        this.gramos = gramos; 
        masCalorico();        
    }
   
    /**
     * Calcula las proteinas que tiene el alimento en base a los gramos del mismo.
     */
    private float calculaProteinas()
    {
        float proteinas = alimento.saberProteinas();
        proteinas = ((proteinas * gramos) / 100);
        return proteinas;
    }
    
    /**
     * Calcula el porcentaje de las proteinas.
     */
    private float porcentajeProteinas()
    {
        float proteinas;
        proteinas = ((calculaProteinas() / (calculaProteinas() + calculaCarbohidratos() + calculaGrasas())) * 100);
        return proteinas;
    }
    
    /**
     * Calcula los carbohidratos que tiene el alimento en base a los gramos del mismo.
     */
    private float calculaCarbohidratos()
    {
        float carbohidratos = alimento.saberCarbohidratos();
        carbohidratos = ((carbohidratos * gramos) / 100);
        return carbohidratos;
    }
    
    /**
     * Calcula el porcentaje de carbohidratos en el alimento.
     */
    private float porcentajeCarbohidratos()
    {
        float carbohidratos = alimento.saberCarbohidratos();
        carbohidratos = ((calculaCarbohidratos() / (calculaProteinas() + calculaCarbohidratos() + calculaGrasas())) * 100);
        return carbohidratos;
    }
       
    /**
     * Calcula las grasas que tiene el alimento en base a los gramos del mismo.
     */
    private float calculaGrasas()
    {
        float grasas = alimento.saberGrasas();
        grasas = ((grasas * gramos) / 100);
        return grasas;
    }
    
    /**
     * Calcula el porcentaje de grasas en el alimento.
     */
    private float porcentajeGrasas()
    {
        float grasas = alimento.saberGrasas();
        grasas = ((calculaGrasas() / (calculaProteinas() + calculaCarbohidratos() + calculaGrasas())) * 100);
        return grasas;
    }
    
    /**
     * Calcula las calorias del alimento.
     */
    private float calculaCalorias()
    {
        float calorias = ((calculaProteinas() * 4) + (calculaCarbohidratos() * 4) + (calculaGrasas() * 9));
        return calorias;
    }
    
    /**
     * Muestra los datos alimenticios del usuario.
     */
    public void mostrarUsuario()    
    {
        if (calculaCalorias() != 0)
        {
            System.out.println("Nombre: " + usuario);
            System.out.println("Gramos de proteinas ingeridos: " + calculaProteinas() + " (" + porcentajeProteinas() + "%)");
            System.out.println("Gramos de carbohidratos ingeridos: " + calculaCarbohidratos() + " (" + porcentajeCarbohidratos() + "%)");
            System.out.println("Gramos de grasas ingeridos: " + calculaGrasas() + " (" + porcentajeGrasas() + "%)");
            System.out.println("Calorias ingeridas: " + calculaCalorias());
        }
        else
        {
            System.out.println("Nombre: " + usuario);
            System.out.println("Gramos de proteinas ingeridos: 0.0");
            System.out.println("Gramos de carbohidratos ingeridos: 0.0");
            System.out.println("Gramos de grasas ingeridos: 0.0");
            System.out.println("Calorias ingeridas: 0.0");
        }
    }  
    
    /**
     * Compara la ingesta de alimentos entre dos usuarios.
     */
    public void comparar(Usuario nuevoUsuario)
    {        
        if (calculaCalorias() > nuevoUsuario.calculaCalorias())
        {
            System.out.println(usuario + " ha consumido más calorias que " + nuevoUsuario);
        }
        
        else
        {
            System.out.println(nuevoUsuario + " ha consumido más calorias que " + usuario);
        }
    }
   
    /**
     * Muestra el alimento con mayor indice calórico comido por el usuario
     */
    public float masCalorico()// debería ser String ya que es un nombre pero sigo con el error de antes.
    {
        float calorias = calculaCalorias();
        if (calorias > muyCalorico)
        {
            muyCalorico = calorias;
            //alimentoCalorico = alimento;
        }
        return muyCalorico; // Debería devolver el nombre del alimento y no las calorias pero llevo arrastrando un error desde el principio.
        //return alimentoCalorico;
    }
    
}    
