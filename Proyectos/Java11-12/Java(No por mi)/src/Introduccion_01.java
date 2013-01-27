public class Introduccion_01 {	// INTERCAMBIO CON TEMP

	public static void main(String[] args){
		int a=9;
		int b=2;
		int transmutador=0;
		
		System.out.println("El valor de la variable a es "+a);
		System.out.println("El valor de la variable b es "+b);
		System.out.println("-----------CAMBIO-------------");
		
		transmutador=a;
		a=b;
		b=transmutador;		
			
		System.out.println("El valor de la variable a es "+a);
		System.out.println("El valor de la variable b es "+b);
	}
}