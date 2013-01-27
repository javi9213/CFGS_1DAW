import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*Escriba un programa que calcule la ecuación del espacio recorrido por un objeto que se mueve a velocidad 
 * constante. Había recorrido un espacio inicial de 5,5 m, se mueve a una velocidad constante de 3,2 m/s 
 * durante 20 segundos.
 * FORMULA: espacio=espacio_inicial+(velocidad*tiempo)*/

public class Ejercicios_10 {
	public static void main(String[]args)throws IOException {
		BufferedReader ln = new BufferedReader(new InputStreamReader(System.in));
		
		double espacio;
		double espacio_inicial;
		double velocidad_cte;
		double tiempo;
		
		System.out.println("Espacion inicial: ");
		espacio_inicial=Double.parseDouble(ln.readLine());
		
		System.out.println("Velocidad Constante: ");
		velocidad_cte=Double.parseDouble(ln.readLine());
		
		System.out.println("Tiempo: ");
		tiempo=Double.parseDouble(ln.readLine());
		
		espacio=espacio_inicial+(velocidad_cte*tiempo);
		System.out.println("Recorre: "+espacio+"metros");
	}
}