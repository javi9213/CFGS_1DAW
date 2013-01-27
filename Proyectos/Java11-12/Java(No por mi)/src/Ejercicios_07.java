import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicios_07 {
	/* Escribe un programa que declare la constante PI como 3,1416, que calcule el área de un círculo, cuyo radio 
	 * es 10 y muestre el resultado por pantalla.*/
	final static double PI=3.1416;
	
	public static void main(String[]args)throws IOException {
		BufferedReader ln = new BufferedReader(new InputStreamReader(System.in));
			
		double radio;
		double area_circulo;
		
		System.out.println("Introduce el radio: ");
		radio=Integer.parseInt(ln.readLine());
		//area_circulo=(radio*radio)*PI;
		area_circulo=Math.pow(radio,2)*PI;
		System.out.println("Area del circulo es: "+area_circulo);
	}
}