package ejercicio5;

public class PrimerosPrimos
{
	private int numprimos;
	
	public PrimerosPrimos(int num)
	{
		if (num < 1)
			numprimos = 1;
		else
			numprimos = num;
	}
	
	public static boolean EsPrimo(int num)
	{
		int contador = 2;
		boolean res = true;
		
		while ((res) && (contador<num))
		{
			if (num%contador == 0)
				res = false;
			
			contador++;
		}
		return res;
	}
	
	
	public void mostrarPrimos()
	{
		int contador = 1, incremento = 1;
		
		System.out.print("\nLos números primos son: ");
		while (contador <= numprimos)
		{
			if (EsPrimo(incremento))
			{
				System.out.print(incremento + " ");
				contador++;
			}
			
			incremento++;
		}
	}
}
