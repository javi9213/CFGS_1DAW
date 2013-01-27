package ejercicio6;

public class SerieNumeros
{
	private int primero;
	private int ultimo;
	
	public SerieNumeros(int num1, int num2)
	{
		if (num1 > num2)
		{
			primero = num2;
			ultimo = num1;
		}
		else
		{
			primero = num1;
			ultimo = num2;
		}
	}
	
	public int CalculaSumaIntervalo()
	{
		int aux = primero;
		int suma = 0;
		
		while (aux <= ultimo)
		{
			suma += aux;
			aux++;
		}
		
		return suma;
	}
}
