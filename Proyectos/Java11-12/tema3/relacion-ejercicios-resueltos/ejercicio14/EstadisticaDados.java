package ejercicio14;


public class EstadisticaDados
{
	private Dado dado;
	private int numerotiradas;
	
	public EstadisticaDados()
	{
		dado = new Dado();
	}
	
	public void indicarNumeroTiradas(int numtiradas)
	{
		if (numtiradas > 1)
			numerotiradas = numtiradas;
		else
			numerotiradas = 1;
	}
	
	public void calcularEstadistica()
	{
		int cara1 = 0, cara2 = 0, cara3 = 0, cara4 = 0, cara5 = 0, cara6 = 0;
		int resultadotirada;
		
		for (int contador = 1; contador <= numerotiradas; contador++)
		{
			resultadotirada = dado.tirar();
			System.out.printf("Tirada %d: %d\n", contador, resultadotirada);
			switch (resultadotirada)
			{
				case 1: cara1++; break;
				case 2: cara2++; break;
				case 3: cara3++; break;
				case 4: cara4++; break;
				case 5: cara5++; break;
				case 6: cara6++; break;
			}
		}
		
		System.out.printf("\nHa aparecido el numero 1 en un %.2f de ocasiones", ((double)cara1/(double)numerotiradas)*100.0);
		System.out.printf("\nHa aparecido el numero 2 en un %.2f de ocasiones", ((double)cara2/(double)numerotiradas)*100.0);
		System.out.printf("\nHa aparecido el numero 3 en un %.2f de ocasiones", ((double)cara3/(double)numerotiradas)*100.0);
		System.out.printf("\nHa aparecido el numero 4 en un %.2f de ocasiones", ((double)cara4/(double)numerotiradas)*100.0);
		System.out.printf("\nHa aparecido el numero 5 en un %.2f de ocasiones", ((double)cara5/(double)numerotiradas)*100.0);
		System.out.printf("\nHa aparecido el numero 6 en un %.2f de ocasiones", ((double)cara6/(double)numerotiradas)*100.0);
	}
}
