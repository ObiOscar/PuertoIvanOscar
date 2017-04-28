/**
 * Es la clase barco, sera una clase abstracta, y sobre ella se basara el resto de barcos
 * 
 *@author ivan
 *@version 1.0
 */
public abstract class Barco
{
    // instance variables - replace the example below with your own
    Persona propietario;
    String matricula;
    double eslora;
    int anofabricacion;
    
    /**
     * Constructor de la calse Barco
     * @param matricula Es la matricula del barco
     * @param eslora son los metros de eslora del barco
     * @param ano año del barco
     * @param propietario es el propietario del barco
     */
    public Barco(String matricula , double eslora , int anofabricacion , Persona propietario)
    {
       this.matricula = matricula;
       this.eslora = eslora;
       this.anofabricacion = anofabricacion;
       this.propietario = propietario;
    }
    
    /**
     * Devuelve el toString de la clase Persona
     * @return cadenaADevolver nos muestra los atributos de la clase Persona
    */
    public String toString()
    {
        String textoADevolver = " ";
        textoADevolver += "Propietario : \n " + propietario.toString() + "\n";
        textoADevolver += "    Matricula : " + matricula + "\n";
        textoADevolver += "    Eslora : " + eslora + "\n";
        textoADevolver += "    Año de fabricación : " + anofabricacion + "\n";
        return textoADevolver;
    }
    
    /**
     * Nos devuelve los metros de eslora
     * @return eslora nos devuelve el atributo eslora
     */
    public double getEslora()
    {
        return eslora;
    }
    
    /**
     * es una clase abstracta que sera sobrescrita por las clases hijas.
     */
    public abstract int getCoeficienteBernue();          
}
