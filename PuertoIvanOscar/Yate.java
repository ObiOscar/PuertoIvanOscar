public class Yate extends EmbarcacionAMotor
{
    // instance variables - replace the example below with your own
    private int numCamarotes;

    /**
     * Constructor for objects of class Yate
     */
    public Yate(String matricula , double eslora , int anofabricacion , Persona propietario , int potencia, int numCamarotes )
    {
       super(matricula,eslora,anofabricacion,propietario,potencia);
       this.numCamarotes = numCamarotes;
    }
    public int getCoeficienteBernue()
    {
        int coefBernua = numCamarotes + super.getCoeficienteBernue();
        return coefBernua;
    }
    public String toString()
    {
        String textoADevolver = " ";
        textoADevolver += super.toString();
        textoADevolver += "Número de camarotes : " + numCamarotes;
        System.out.println(textoADevolver);
        return textoADevolver;
        
       
    }
    
}
