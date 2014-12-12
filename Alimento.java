
/**
 * Clase alimento con datos acerca de las proteinas carbohidratos 
 * grasas y el nombre del alimento.
 */
public class Alimento
{
    // Nombre del alimento
    private String nombre;
    // Cantidad en gramos de proteinas por cada 100 gramos del alimento.
    private float proteinas;
    // Cantidad en gramos de carbohidratos por cada 100 gramos del alimento.
    private float carbohidratos;
    // Cantidad en gramos de grasas por cada 100 gramos del alimento.
    private float grasas;

    /**
     * Crea un alimento con su nombre y los gramos de proteinas, 
     * carbohidratos y grasas por cada 100 gramos de alimento
     */
    public Alimento(String nombre, float proteinas, float carbohidratos, float grasas)
    {
       this.nombre = nombre;
       this.proteinas = proteinas;
       this.carbohidratos = carbohidratos;
       this.grasas = grasas;
    }
    
    /**
     * Imprime los datos del alimento
     */   
    public void muestraDatos()
    {
        String mayoritario;
        float calorias = ((proteinas * 4) + (carbohidratos * 4) + (grasas * 9));
        
        if (proteinas > carbohidratos) // carbohidratos descartado
        {
            if (proteinas > grasas) // el mayor es proteinas
            {
                mayoritario = "proteinas";
            }
            
            else // grasas es el mayor
            {
                mayoritario = "grasas";
            }  
        }
        
        else // proteinas descartado
        {
            if (carbohidratos > grasas) // el mayor es carbohidratos
            {
                mayoritario = "carbohidratos";
            }
            
            else // el mayor es grasas
            {
                mayoritario = "grasas";
            }            
        }
        
        System.out.println("Nombre: " + nombre);
        System.out.println("Proteinas por cada 100 gramos: " + proteinas);
        System.out.println("Carbohidratos por cada 100 gramos: " + carbohidratos);
        System.out.println("Grasas por cada 100 gramos: " + grasas);
        System.out.println("Calorias: " + calorias);
        System.out.println("Componente/s mayoritario/s: " + mayoritario);
    }
    
    
}
