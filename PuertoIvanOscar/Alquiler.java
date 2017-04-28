/**
 * Esta es la clase Alquiler, nos permitira alquilar amarres
 * 
 * @author Oscar Fernandez Rodriguez 
 * @version 1.0
 */
public class Alquiler
{
    /**
     * Se usa para la formula del coste de alquiler
     */
    private static final int VALOR_MULTIPLICADOR_ESCALA = 10;       //Se usa para la formula del coste de alquiler
   /**
    * Se usa para la formula del csote de alquiler  
    */
    private static final int VALOR_MULTIPLICADOR_BERNUA = 300;      //Se usa para la formula del csote de alquiler  
    private int diasOcupacion;
    private int posicionAmarre;
   /**
    * Es un objeto barco, que es el que el cliente deja en el puerto
    */
    private Barco barco;

    /**
     * Constructor de la calse Alquiler
     * @param numDias sol los dias que el cliente va a dejar el barco en el puerto
     * @param barco Es un objeto barco, que es el que el cliente deja en el puerto
     * @param posicionAmarre es la posicion del amarre que quiere dejar el cliente
     */
    public Alquiler(int numDias,Barco barco, int posicionAmarre)
    {
        diasOcupacion = numDias;
        this.barco = barco;
        this.posicionAmarre = posicionAmarre;
    }

    /**
     * Devuelve el toString de la clase Alquiler
     * @return cadenaADevolver devuelve la informacion como diasOcupacion, posicion amarre y el barco
    */
    public String toString()
    {
        String cadenaADevolver = "-Numero de dias ocupando el amarre " + diasOcupacion + "\n";
        cadenaADevolver += "-Numero de amarre " + posicionAmarre + "\n";
        cadenaADevolver += "-Barco:\n" + barco + "\n";
        return cadenaADevolver;
    }
    
    /**
     * Calcula el precio del alquiler según una formula:
     * El número de días de ocupación multiplicado por un valor en función del barco (esta valor es el resultante de multiplicar por 10 los metros de eslora). 
     * Al resultado se le suma la cantidad obtenida de sumar un valor ﬁjo (300 euros) multiplicado por el coeficiente de Bernua del barco
     * @return precioAlquiler es la formula que se esplica mas arriba
     */
    public float getPrecioAlquiler()
    {
        float precioAlquiler = diasOcupacion * (10 * (float)barco.getEslora()) + VALOR_MULTIPLICADOR_BERNUA * barco.getCoeficienteBernue();
        return precioAlquiler;
    }
}