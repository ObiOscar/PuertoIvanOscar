
/**
 * Es la clase Velero, sera una hija clase de la clase barco
 * 
 *@author ivan
 *@version 1.0
 */
public class Velero extends Barco
{
    private int numMastiles;

    /**
     * Constructor de la calse Velero
     * los otros parametros son de la clase padre
     * @param numCamarote sera el numero de camarote que tiene el yate
     */
    public Velero(String matricula , double eslora , int anofabricacion , Persona propietario , int numMastiles)
    {
        super(matricula, eslora , anofabricacion , propietario);
        this.numMastiles = numMastiles;
    }
    
    /**
     * Devuelve el toString de la clase Velero
     * @return cadenaADevolver nos devuelve el toString de la clase padre (Barco) y tambien el numero de mastiles
    */
    public String toString()
    {
        String textoADevolver = " ";
        textoADevolver += super.toString();
        textoADevolver += "    Num. Mástiles : " + numMastiles + "\n";
       return textoADevolver;
    }
    
    /**
     * sobrescribe el metodo abstracto de la clase barco
     * @return numeroMastiles es el atributo numeroMastiles
     */
    public int getCoeficienteBernue()
    {
        int coefBernua = numMastiles;
        return coefBernua;
    }
}
