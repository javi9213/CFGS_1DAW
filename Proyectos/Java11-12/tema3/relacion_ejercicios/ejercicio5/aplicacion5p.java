package ejercicio5;

public class aplicacion5p {

	public static void main(String []args){
		System.out.print("Introduzca número máximo para imprimir los números primos hasta este número:");
		int num=Leerr.datoInt();
		ejercicio5 ejemplo1=new ejercicio5();
		ejemplo1.primos(num);
	}
}