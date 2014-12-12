
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

    /**
     * Construcotr al que introducimos un nombre de usuario y 
     */
    public Usuario(String usuario)    
    {
        this.usuario = usuario;
    }
    
    /**
     * Da de comer al usuario un alimento concreto con una cantidad concreta.
     */
    public void comer(Alimento alimento, float gramos)
    {
        this.alimento = alimento;
        this.gramos = gramos;
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
     * Calcula los carbohidratos que tiene el alimento en base a los gramos del mismo.
     */
    private float calculaCarbohidratos()
    {
        float carbohidratos = alimento.saberCarbohidratos();
        carbohidratos = ((carbohidratos * gramos) / 100);
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
        System.out.println("Nombre: " + usuario);
        System.out.println("Gramos de proteinas ingeridos: " + calculaProteinas());
        System.out.println("Gramos de carbohidratos ingeridos: " + calculaCarbohidratos());
        System.out.println("Gramos de grasas ingeridos: " + calculaGrasas());
        System.out.println("Calorias ingeridas: " + calculaCalorias());
    }
}
