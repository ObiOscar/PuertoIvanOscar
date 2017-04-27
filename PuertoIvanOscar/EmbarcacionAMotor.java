
public class EmbarcacionAMotor extends Barco
{
    // instance variables - replace the example below with your own
    private int potencia;

    /**
     * Constructor for objects of class EmbarcacionAMotor
     */
    public EmbarcacionAMotor(String matricula , double eslora , int anofabricacion , Persona propietario , int potencia)
    {
       super(matricula, eslora , anofabricacion , propietario);
       this.potencia = potencia;
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
        textoADevolver += "Potencia : " + potencia + "\n";
        return textoADevolver;
        
    }
    public int getCoeficienteBernue()
    {
        int coefBernua = potencia;
        return coefBernua;
    }
}
