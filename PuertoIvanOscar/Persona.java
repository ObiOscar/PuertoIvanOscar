
/**
 * Write a description of class Persona here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Persona
{
    // instance variables - replace the example below with your own
    private String nombre;
    private String dni;

    /**
     * Constructor for objects of class Persona
     */
    public Persona(String nombre , String dni)
    {
        this.nombre = nombre;
        this.dni = dni;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public String toString()
    {
        String textoADevolver = " ";
        textoADevolver += "Nombre: " + nombre  + "\n";
        textoADevolver += "DNI: " + dni +"\n";
      
        return textoADevolver;
        
    }
    public String getNombre()
    {
        return nombre;
    }
}