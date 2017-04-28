
/**
 * Es la clase persona, será nuestro cliente
 * 
 *@author ivan
 *@version 1.0
 */
public class Persona
{

    private String nombre;
    private String dni;
    
    /**
     * Constructor for objects of class Persona
     * @param nombre es el nombre del cliente
     * @param dni el documento nacional de identidad
     */
    public Persona(String nombre , String dni)
    {
        this.nombre = nombre;
        this.dni = dni;
    }

    /**
     * Devuelve el toString de la clase Persona
     * @return cadenaADevolver devuelve los atributos de la clase Persona, el nombre y el dni
     */
    public String toString()
    {
        String textoADevolver = " ";
        textoADevolver += "  Nombre: " + nombre  + "\n";
        textoADevolver += "    DNI: " + dni;
      
        return textoADevolver;
        
    }
    public String getNombre()
    {
        return nombre;
    }
}