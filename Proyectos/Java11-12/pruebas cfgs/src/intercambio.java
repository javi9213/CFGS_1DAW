/*Programa para intercambiar dos variables de posición*/

public class intercambio {
	public static void main(String[] args) {
		int a=5, b=3;
		int temp=0;
		temp=a+b;
		a=temp-a;
		b=temp-b;
		System.out.println("El valor de la variable a es"+a);
		System.out.println("El valor de la variable b es"+b);
	}
}
/*Hecho por Javier González*/