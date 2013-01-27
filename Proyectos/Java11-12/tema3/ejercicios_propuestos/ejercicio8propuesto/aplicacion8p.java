package ejercicio8propuesto;

public class aplicacion8p {
	
	public static void main(String[] args) {
		System.out.println("Conversión de números de decimales a romanos (1-3999)");
		System.out.println();
		System.out.print("Introduzca número decimal:");
		int num=Leer.datoInt();
		System.out.print("El valor en romano es: ");
		ejercicio8p decimal=new ejercicio8p();
		decimal.decimalToRomano(num);
	}
}