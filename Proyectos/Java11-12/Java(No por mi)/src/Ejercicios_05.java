import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicios_05 {
	/* Decida qué tipos de valores necesita para escribir un programa que calcule la suma y la media de cuatro 
	 * número de int. Escriba un programa como ejemplo.*/
	
	public static void main(String[]args)throws IOException {
		BufferedReader ln = new BufferedReader(new InputStreamReader(System.in));
		
		int suma;
		float media;
		int num1;
		int num2;
		int num3;
		int num4;
		
		System.out.println("Introduce un numero: ");
		num1=Integer.parseInt(ln.readLine());
		System.out.println("Introduce un numero: ");
		num2=Integer.parseInt(ln.readLine());
		System.out.println("Introduce un numero: ");
		num3=Integer.parseInt(ln.readLine());
		System.out.println("Introduce un numero: ");
		num4=Integer.parseInt(ln.readLine());
		
		suma=num1+num2+num3+num4;
		media=(float) suma/4.0f;
		
		System.out.println("SUMA: "+suma);
		System.out.println("MEDIA:"+media);
	}
}