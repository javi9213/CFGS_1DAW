package ejercicio9p;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejercicio9p {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int num , aux;
		InputStreamReader isr=new InputStreamReader (System.in);
		BufferedReader lectura= new BufferedReader(isr);
		System.out.print("Introduzca num:");
		num = Integer.parseInt(lectura.readLine());
		aux = num%10;
		System.out.println(aux);
	}
}