public class Propuestos_09{									// TABLA ^^

	public static void main(String[] args){
		boolean adivina=((97=='a') && true);
		System.out.println(adivina);								//  TRUE
		
		System.out.println("-----------");							// SALTO DE LINEA ------
		
		int a=1;
		int b=a>>>2;
		System.out.println(b);										// 0

		System.out.println("-----------");							// SALTO DE LINEA ------
		
		/*int a=7 | 4;
		System.out.println(a);										// NO FUNCIONA xq en un int, no se puede declarar 2 valores a la vez.
		int b=3 | 4;
		System.out.println(b);*/

		System.out.println("-----------");							// SALTO DE LINEA ------
		
		/*int a= 7&4;
		System.out.println(a);
		int b=3&4;
		System.out.println(b);*/									// NO FUNCIONA xq en un int, no se puede declarar 2 valores a la vez.

		System.out.println("-----------");							// SALTO DE LINEA ------
		
		int g=~4;
		System.out.println(g);										// Funciona
		
		System.out.println("-----------");							// SALTO DE LINEA ------
		
		int p=(~4*5)&1;
		System.out.println(p);										// Funciona
	}
}