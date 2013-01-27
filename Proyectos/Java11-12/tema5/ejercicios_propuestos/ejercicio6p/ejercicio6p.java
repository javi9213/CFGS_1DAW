package ejercicio6p;

public class ejercicio6p {

	public static void main (String[]args){
		final String s1 = new String("Hola");
		String s2 = new String(" Mundo");
		//s1 = s1+s2;
		/**No puede haber otro objeto con la misma referencia
		 * de que el objeto con el atributo final lo que hay puesto
		 * s1 = s1 + s2;
		 * Sólo se puede hacer si se quita el atributo final del objeto*/
	}
}