package ejercicio7;


public class Crapulo
{
	private int numero;
	
	public Crapulo(int num)
	{
		if (num > 1)
			numero = num;
		else
			numero = 1;
	}
	
	public int calcularCrapulo()
	{
		int crap = numero;
		int aux;
		int res;
		
		while (crap >= 10)
		{
			aux = crap;
			res = 0;
			while (aux > 0)
			{
				res += aux%10;
				aux = aux/10;
			}
			crap = res;
		}
		
		return crap;
	}
}
