/*Programa que averigua los números primos en un rango de números leido por consola*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bucles_anidados{
	public static void main(String[] args) throws IOException{
		InputStreamReader isr=new InputStreamReader (System.in);
		BufferedReader lectura=new BufferedReader(isr);
		int j, num, cont_pri=0;
		boolean primo;
		System.out.print("Introduce un número: ");
		num=Integer.parseInt(lectura.readLine());
		
		//vamos procesando todos los números entre 1...num
		for(int i=1;i<=num;i++){
			//para cada número i, calcularemos si es primo
			//veremos si el número i es divisible en el rango 2...i-1
			primo=true;
			j=2;
			while(j<=i-1 && primo==true){
				if(i%j==0)
					primo=false;
			j++;
			}
			if(primo==true){
				cont_pri++; //si es primo aumentaremos el contador de primos
				System.out.println(i+ " es primo");
			}
		}
		System.out.println("En el rango 1.."+num+", hay "+cont_pri+" números primos.");
	}
}


