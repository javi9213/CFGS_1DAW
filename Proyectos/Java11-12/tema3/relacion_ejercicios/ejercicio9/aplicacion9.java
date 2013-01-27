package ejercicio9;

public class aplicacion9 {

	public static void main(String[] args) {
		System.out.print("Introduzca número para contar sus dígitos:");
		int num=Leer.datoInt();
		ejercicio9 digitos=new ejercicio9();
		digitos.decimal(num);
		digitos.mostrar(num);
	}
}