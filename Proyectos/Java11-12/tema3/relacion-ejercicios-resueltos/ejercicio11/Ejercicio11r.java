package ejercicio11;

public class Ejercicio11r{
	
	public static void main(String[] args){
		double nota = 0.0;
		NotasClase notasclase = new NotasClase();

		System.out.print("Introduzca la siguiente nota: ");
		nota = Leerr.datoDouble();
		while (nota >= 0)	{
			notasclase.insertarNota(nota);
			
			System.out.print("Introduzca la siguiente nota: ");
			nota = Leerr.datoDouble();
		}
		System.out.printf("\nLa nota mas alta introducida ha sido: %.2f", notasclase.getNotaMasAlta());
		System.out.printf("\nLa nota mas baja introducida ha sido: %.2f", notasclase.getNotaMasBaja());
		System.out.printf("\nSe han introducido %d notas", notasclase.getNumeroNotas());
		System.out.printf("\nLa nota media de la clase es %.2f", notasclase.calcularNotaMedia());	
	}
}