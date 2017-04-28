/**
 * Es la clase Yate, sera una hija clase de la clase barco
 * 
 *@author Oscar Fernandez Rodriguez
 *@version 1.0
 */
public class Yate extends EmbarcacionAMotor
{
    // instance variables - replace the example below with your own
    private int numCamarotes;
    
    /**
     * Constructor de la calse Yate
     * los otros parametros son de la clase padre
     * @param numCamarote sera el numero de camarote que tiene el yate
     */
    public Yate(String matricula , double eslora , int anofabricacion , Persona propietario , int potencia, int numCamarotes )
    {
       super(matricula,eslora,anofabricacion,propietario,potencia);
       this.numCamarotes = numCamarotes;
    }
    
    /**
     * sobrescribe el metodo abstracto de la clase barco
     * @return super.getCoeficienteBernue() + numCamarote  nod devuelve el resultado del metodo getCoeficienteBernue de la clase embarcacionAMotor
     * y sumando el numero de camarote
     */
    public int getCoeficienteBernue()
    {
        int coefBernua = numCamarotes + super.getCoeficienteBernue();
        return coefBernua;
    }
    
    
    /**
     * Devuelve el toString de la clase Yate
     * @return cadenaADevolver nos devuelve el toString de la clase padre (embarcacionAMotor) 
     * esta a su vez nos da el toString de la clase barco y nos devuelve los numero de camarote de esta clase
    */
    public String toString()
    {
        String textoADevolver = " ";
        textoADevolver += super.toString();
        textoADevolver += "    Número de camarotes : " + numCamarotes + "\n";
        return textoADevolver;
        
       
    }
    
}
