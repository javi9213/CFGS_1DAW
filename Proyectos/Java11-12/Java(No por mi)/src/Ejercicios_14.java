import java.util.Random;

public class Ejercicios_14 {

	/*Crear una aplicación que genere aleatoriamente la cadena de caracteres “cara” o “cruz” y la muestre por 
	 * pantalla. Para generar un entero aleatorio, empleamos las siguientes instrucciones:
	 * Random rand = new Random(); // Creariamos un objeto Random
	 * int enteroaleatorio = rand.nextInt();*/

	public static void main(String[] args) {
		Random rand = new Random(); // Creariamos un objeto Random
		int enteroaleatorio = rand.nextInt();
		
		System.out.println(+enteroaleatorio);
		if(enteroaleatorio>0){
			System.out.println("Es cruz");
		}else{
			System.out.println("Es cara");
		}
	}
}