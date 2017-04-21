
/**
 * Write a description of class Puerto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Puerto
{
    private static final int CANTIDAD_AMARRES = 3;
    private Alquiler[] amarres;

    /**
     * Constructor for objects of class Puerto
     */
    public Puerto()
    {
        // initialise instance variables
        Alquiler[] amarres = new Alquiler[CANTIDAD_AMARRES];
    }

    /**
     * Este metodo simula la entrada de un nuevo cliente, sino hay amarres disponibles devuelve -1.
     */
   /* public float alquilarAmarre (int numDias, Barco barco)
    {
        float precioOError = -1;
        
        //Contemplar que haya amarres libres
        //
        //FALTAN COSAS
        
        return precioOError;
    }*/
    
    /**
     * El cliente liquida el alquiler de amarre, si el amarre no existe, o sino esta ocupado devuelve -1.
     */
    public float liquidarAmarre (int posiciionAmarre)
    {
        float precio = 0;
        
        //FALTAN COSAS
        
        return precio;
    }
    
    /**
     * Devuelve la posicion del primer amarre libre o -1 sino hay amarre libre
     */
    private int posicionPrimerAmarre ()
    {
        int primerAmarreLibre = -1;
        
        //FALTAN COSAS
        
        return primerAmarreLibre;
    }
    
    /**
     * Devuelve true si hay amarres libres y false sino lo hay.
     */
    private boolean hayAmarresLibres ()
    {
        boolean amarreLibre = false;
        int i = 0;
        do{
    	    if(amarres[i] == null){
    	        amarreLibre = true;
    	       }
    	     i++;
        }while(i<amarres.length);

        return amarreLibre;
    }
}
