public abstract class Barco
{
    // instance variables - replace the example below with your own
    Persona propietario;
    String matricula;
    double eslora;
    int anofabricacion;
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y    a sample parameter for a method
     * @return        the sum of x and y 
     */
    public Barco(String matricula , double eslora , int anofabricacion , Persona propietario)
    {
       this.matricula = matricula;
       this.eslora = eslora;
       this.anofabricacion = anofabricacion;
       this.propietario = propietario;
    }
    public String toString()
    {
        String textoADevolver = " ";
        textoADevolver += "Propietario : " + propietario.getNombre() + "\n";
        textoADevolver += "Matricula : " + matricula + "\n";
        textoADevolver += "Eslora : " + eslora + "\n";
        textoADevolver += "Año de fabricación : " + anofabricacion + "\n";
        return textoADevolver;
    }
    public double getEslora()
    {
        return eslora;
    }
    public abstract int getCoeficienteBernue();
    
        
    
}
