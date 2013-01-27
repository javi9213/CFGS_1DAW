package ejercicio6;

public class Ejercicio6r
{
	
	public static void main(String[] args)
	{
		int num1, num2;
		
		System.out.print("Introduce el primer entero: ");
		num1 = Leerr.datoInt();
		System.out.print("Introduce el segundo entero: ");
		num2 = Leerr.datoInt();
		
		SerieNumeros serie1 = new SerieNumeros(num1,num2);
		System.out.print("\nLa suma de la serie entre " + num1 + " y " + num2 + " es: " + serie1.CalculaSumaIntervalo());
		
	}
}
