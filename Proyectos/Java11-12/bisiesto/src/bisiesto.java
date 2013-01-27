import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*Importamos de la biblioteca java.io, los elementos necesarios para construir las excepciones
  necesarias y leer de consola los datos necesarios*/

public class bisiesto {
	
	    /*Hacemos un método (calcular()) que nos dira si el año leido de consola es bisiesto o no
	      o segun el caso de error por un valor inadecuado, por ejemplo: año en negativo*/
	
	    public static int calcular(int año) throws NumberFormatException, IOException{
	    	InputStreamReader isr = new InputStreamReader(System.in);
	        BufferedReader flujoE = new BufferedReader(isr);
	    	System.out.print("Introduce año (Ej: 1999): ");
	    	año=Integer.parseInt(flujoE.readLine());
	    	if(año<0)
	    		System.out.print("Error año introducido negativo o incorrecto");
	    	else if (((año % 4 == 0)&&(año % 100 != 0))||(año % 400 == 0))
	             System.out.println("El año "+año+" es bisiesto.");
	         else 
	             System.out.println("El año "+año+" no es bisiesto.");
			return 0;
	    }
	    public static void main (String[]args) throws NumberFormatException, IOException{
	    	bisiesto.calcular(1999);
	    }
}


