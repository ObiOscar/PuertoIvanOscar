
/**
 * Write a description of class Alquiler here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alquiler
{
    private static final int VALOR_MULTIPLICADOR_ESCALA = 10;
    private static final int VALOR_MULTIPLICADOR_BERNUA = 300;
    private int diasOcupacion;
    private int posicionAmarre;
    private Barco barco;

    /**
     * Constructor for objects of class Alquiler
     */
    public Alquiler(int numDias,Barco barco, int posicionAmarre)
    {
        diasOcupacion = numDias;
        this.barco = barco;
        this.posicionAmarre = posicionAmarre;
    }

    /**
     * Devuelve el toString de la clase Alquiler
    */
    public String toString()
    {
        String cadenaADevolver = "Numero de dias ocupando el amarre" + diasOcupacion + "\n";
        cadenaADevolver += "Numero de amarre" + posicionAmarre + "\n";
        cadenaADevolver += "Barco:" + barco + "\n";
        return cadenaADevolver;
    }
    
    /**
     * Calcula el precio del alquiler según una formula:
     * El número de días de ocupación multiplicado por un valor en función del barco (esta valor es el resultante de multiplicar por 10 los metros de eslora). 
     * Al resultado se le suma la cantidad obtenida de sumar un valor ﬁjo (300 euros) multiplicado por el coeficiente de Bernua del barco
    */
    public float getPrecioAlquiler()
    {
        float precioAlquiler = diasOcupacion * (10 * (float)barco.getEslora()) + VALOR_MULTIPLICADOR_BERNUA * barco.getCoeficienteBernue();
        return precioAlquiler;
    }
}
