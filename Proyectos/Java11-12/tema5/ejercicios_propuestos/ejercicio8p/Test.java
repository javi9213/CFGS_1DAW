package ejercicio8p;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {

	public static void main(String[] args) throws NumberFormatException, IOException {
		double numero1, numero2, suma, multiplicacion, division, modulo;
		InputStreamReader isr=new InputStreamReader (System.in);
		BufferedReader lectura= new BufferedReader(isr);
		numero1 = Double.parseDouble(lectura.readLine());
		numero2 = Double.parseDouble(lectura.readLine());
		suma = numero1 + numero2;
		multiplicacion = numero1 + numero2;
		if(numero2 == 0){
			System.out.println("Error división infinita");
		}else{
			division = numero1/numero2;
		}
		if(numero2 == 0){
			System.out.println("Error división infinita");
		}else{
			modulo = numero1%numero2;
		}
	}
}