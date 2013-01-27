package ejercicio5;

public class Ejercicio5r
{		
	public static void main(String[] args)
	{
		int fin;
		do
		{
			System.out.print("Introduce el numero de numeros primos que quieres mostrar: ");
			fin = Leerr.datoInt();
		}while (fin <= 0);
		
		PrimerosPrimos obj = new PrimerosPrimos(fin);
		obj.mostrarPrimos();
	}
}
