import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicios_06 {

	/* Escriba un programa que incluya un método denominado calcular que devuelva como resultado el valor de la 
	 * expresión:
	 * b^2-4a
	 * ------
	 *   2a 
	 *   El método main invocará a calcular pasando los valores a = 1, b = 5, c = 2 y mostrará el resultado obtenido.*/
	
	public static void calcular(int a,int b,int c){
		/*
		 * int a=1;
		 * int b=5;
		 * int c=2;
		*/
		int calcular;
		calcular=((b*b)-4*a)/2*a;
		System.out.println("Resultado: "+calcular);
	}
	
	public static void main(String[]args)throws IOException {
		BufferedReader ln = new BufferedReader(new InputStreamReader(System.in));

		int num1,num2,num3;
		
		System.out.println("Introduce un numero: ");
		num1=Integer.parseInt(ln.readLine());
		System.out.println("Introduce un numero: ");
		num2=Integer.parseInt(ln.readLine());
		System.out.println("Introduce un numero: ");
		num3=Integer.parseInt(ln.readLine());
		calcular(num1,num2,num3);
	}
}