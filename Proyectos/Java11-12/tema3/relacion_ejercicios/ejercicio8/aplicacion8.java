package ejercicio8;

public class aplicacion8 {

	public static void main(String[] args) {
		System.out.print("Introduzca altura para realizar el triángulo:");
		int num=Leerr.datoInt();
		System.out.println();
		ejercicio8 altura=new ejercicio8();
		altura.triangulo(num);
	}
}