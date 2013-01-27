package ejercicio7;

public class Ejercicio7r
{

	public static void main(String[] args)
	{
		int num = 0;
		
		do{
			System.out.print("Introduce un entero positivo: ");
			num = Leerr.datoInt();
		}while (num < 0);
		
		Crapulo numero1 = new Crapulo(num);
		System.out.printf("El crápulo del número %d es %d", num, numero1.calcularCrapulo());
	}
}
