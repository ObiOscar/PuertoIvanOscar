
/**
	En el puerto naútico recién construido en Santander alquilan amarres para que atraquen barcos de distinto tipo. En la actualidad hay construidos 4 amarres.
	Para cada alquiler de un amarre se guarda el cliente que lo va a usar, el numero de días de alquiler, la posición del amarre (0, 1, 2 o 3) y el barco que lo ocupará.
	De un cliente solo nos interesa guardar su nombre y su DNI.
	Un barco se caracteriza por su matrícula, su eslora (la longitud de la embarcación) en metros y su año de fabricación.
	El precio del alquiler a pagar se calcula a partir del número de días de ocupación multiplicado por un valor en función del barco (esta valor es el resultante de multiplicar por 10 los metros de eslora). Al resultado se le suma la cantidad obtenida de sumar un valor ﬁjo (300 euros) multiplicado por el coeficiente de Bernua del barco.
	El coeficiente de Bernua se calcula en función del tipo de barco:
	El número de mástiles para veleros.
	La potencia en CV para embarcaciones deportivas a motor.
	La potencia en CV más número de camarotes para embarcaciones deportivas a motor de lujo (yates).
	Se pide que crees un proyecto en BlueJ que permita al empleado del puerto gestionar los alquileres de los amarres, pudiendo introducir nuevos alquileres en el momento en que llega un nuevo cliente (a los que el amarre se le asigna automáticamente controlando si hay amarres disponibles), pudiendo ver el estado actual de los amarres y pudiendo liquidar el alquiler de un amarre liberando la ocupación del mismo.
 */
public class Puerto
{
    private static final int CANTIDAD_AMARRES = 4;
    private Alquiler[] amarre;

    /**
     * Constructor for objects of class Puerto
     */
    public Puerto()
    {
        // initialise instance variables
        amarre = new Alquiler[CANTIDAD_AMARRES];
    }

    /**
     * Mira a ver si hay amarres libres. Si no los hay devuelve -1; en caso contrario, ubica un objeto "Alquiler" en el primer amarre libre y devuelve el coste de este alquiler.
     */
    public float alquilarAmarre (int numDias, Barco barco)
    {
        float precioOError = -1;
        
        if(hayAmarresLibres()){             //Si hay amarres libres
            int numeroAmarreLibre = posicionPrimerAmarre();
            amarre[numeroAmarreLibre] = new Alquiler (numDias,barco,posicionPrimerAmarre());
            precioOError = amarre[numeroAmarreLibre].getPrecioAlquiler();
        }
        return precioOError;
    }
    
    /**
     * Mira si el amarre indicado se corresponde con uno alquilado y elimina el objeto "Alquiler" ubicado en ese amarre, devolviendo también el coste del alquiler. Si la transacción no se puede completar, devuelve -1.
     */
    public float liquidarAlquilerAmarre (int posicionAmarre)
    {
        float precio = -1;
		boolean sePuedeLiberar = false;		//En el caso que ningun amarre se pueda liberar, false, sino true

        //posicionAmarre = posicionAmarre -1;       //Si el operario no cuenta los amarres de 0 a 3, sino de 1 a 4
        
        if(posicionAmarre >= 0 && posicionAmarre <= amarre.length && amarre[posicionAmarre] != null ) {           //Compruebo si es un valor correcto, que esté entre 1 y 4 ( para el usuario)
            precio = amarre[posicionAmarre].getPrecioAlquiler();
            amarre[posicionAmarre] = null;
        } 
        else{
            System.out.println("Error. El amarre " + posicionAmarre + " no puede ser liberado\n  "); 
            for(int numeroAmarre=0; numeroAmarre<amarre.length; numeroAmarre++){
         	   if(amarre[numeroAmarre] != null){
           	      System.out.println("El Amarre " + (numeroAmarre) + " puede ser Liberado");
				  sePuedeLiberar = true;
          	   }
       		}
			if(!sePuedeLiberar){
           	    System.out.println("Todos nuestros amarres están libres\n");
		    }
        }  
        return precio;
    }
    
    /**
     *Nos muestra por pantalla el estado de los amarres, si estan ocupados o libres.
     */
    public void verEstadoAmarres ()
    {
        for(int numeroAmarre=0; numeroAmarre<amarre.length; numeroAmarre++){
            if(amarre[numeroAmarre] == null){
                 System.out.println("Amarre " + (numeroAmarre) + " Libre");
            }
            else{
                 System.out.println("Amarre " + (numeroAmarre)  + " Ocupado");
            }
        }  
    }
    
    /**
     * Devuelve la posicion del primer amarre libre o -1 sino hay amarre libre
     */
    public int posicionPrimerAmarre ()
    {
        int primerAmarreLibre = -1;
        boolean buscador = true;       

        for(int i=0; i<amarre.length; i++){
              while(buscador && amarre[i] == null){ 
                  primerAmarreLibre = i;
                  buscador = false;
              }  
        } 
        return primerAmarreLibre;
    }

    /**
     * Devuelve la posicion del primer amarre libre o -1 sino hay amarre libre
     */
    public int borrar ()
    {
        int primerAmarreLibre = -1;
        boolean buscador = true;       

	    for(int i=0; i<amarre.length; i++){
            while(buscador && amarre[i] == null){ 
                primerAmarreLibre = i;
                buscador = false;
            }  
		}
        return primerAmarreLibre;
    }
    
    /**
     * Devuelve true si hay amarres libres y false sino lo hay.
     */
    public boolean hayAmarresLibres ()
    {
        boolean amarreLibre = false;
        int i = 0;
        do{
            if(amarre[i] == null){
                amarreLibre = true;
               }
             i++;
        }while(i<amarre.length);
        return amarreLibre;
    }
}
