
/**
 * Write a description of class Velero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Velero extends Barco
{
    private int numMastiles;

    /**
     * Constructor for objects of class Velero
     */
    public Velero(String matricula , double eslora , int anofabricacion , Persona propietario , int numMastiles)
    {
        super(matricula, eslora , anofabricacion , propietario);
        this.numMastiles = numMastiles;
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
        textoADevolver += super.toString();
        textoADevolver += "Num. Mástiles : " + numMastiles + "\n";
       return textoADevolver;
    }
    
    public int getCoeficienteBernue()
    {
        int coefBernua = numMastiles;
        return coefBernua;
    }
}
