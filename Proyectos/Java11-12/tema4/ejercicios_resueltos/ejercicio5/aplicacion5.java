package ejercicio5;

public class aplicacion5 {

	public static void main(String[] args) {
		System.out.print("Introduzca el número a convertir:");
		int num=Leer.datoInt();
		System.out.print("Introduzca la base del número a convertir:");
		int base=Leer.datoInt();
		ejercicio5.transforma(num,base);
		System.out.println();
	}
}