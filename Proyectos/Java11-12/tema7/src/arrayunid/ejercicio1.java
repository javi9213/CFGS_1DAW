package arrayunid;

import ejercicior.Leer;

public class ejercicio1 {

	private static int POS = 5;
	private static int []numero = new int[POS];

	public static void main (String[]args){
		int num, cont = 0;
		do{
			System.out.print("Introduzca los números:");
			num = Leer.datoInt();
			numero[cont] = num;
			cont++;
		}while(cont<=POS);
		
		for(int i=0;i<POS;i++){
			System.out.println(numero);
			int num0 = numero[i];
			while(num0<numero[i+1]){
				System.out.println(num0);
				num0 = numero[i+2];
			}
		}
	}
}