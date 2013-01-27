
/*Importamos de la bibilioteca org.junit.Test, los elementos para realizar una clase JUnit y a la
 * biblioteca java.io.IOException para llamar a la excepción*/

import java.io.IOException;
import org.junit.Test;

public class pruebaJUnit1 {

	/*Hacemos un test para cada uno de los distintos caminos que puede tener nuestro método*/
	
	@Test
	public void testcalcular() throws NumberFormatException, IOException {
		bisiesto.calcular(1999);
	}

	@Test
	public void testcalcular1() throws NumberFormatException, IOException {
		bisiesto.calcular(2004);
	}
	
	@Test
	public void testcalcular2() throws NumberFormatException, IOException {
		bisiesto.calcular(-1999);
	}
	
	/*Ponemos el main porque sino la clase nos daría un error aunque solo se va a testear los test*/
	
	public static void main (String[]args) throws NumberFormatException, IOException{
		bisiesto.calcular(1999);
		bisiesto.calcular(2004);
		bisiesto.calcular(-1999);
	}
}


