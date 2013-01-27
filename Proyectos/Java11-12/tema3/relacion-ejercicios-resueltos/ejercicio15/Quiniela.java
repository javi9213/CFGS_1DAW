package ejercicio15;

public class Quiniela
{
	private double peso1;
	private double pesox;
	private double peso2;
	private int numcolumnas;
	
	public Quiniela()
	{
		numcolumnas = 1;
		peso1 = 33.3;
		pesox = 33.3;
		peso2 = 33.3;
	}
	
	public void setNumColumnas(int nc)
	{
		if (nc > 1)
			numcolumnas = nc;
		else
			numcolumnas = 1;
	}
	
	public void setPesos(double p1, double px, double p2)
	{
		if (p1 + px + p2 == 100)
		{
			if (p1 >= 1.0)
				peso1 = p1;
			if (px >= 1.0)
				pesox = px;
			if (p2 >= 1.0)
				peso2 = p2;
		}
	}
	
	public void mostrarQuiniela()
	{
		double numero;
		
		System.out.println("Se ha generado la quiniela con los siguientes pesos\n");
		System.out.printf("Peso del 1 - %.2f\n", peso1);
		System.out.printf("Peso del X - %.2f\n", pesox);
		System.out.printf("Peso del 2 - %.2f\n\n", peso2);
		
		for (int contador = 1; contador <= numcolumnas; contador++)
		{
			numero = (Math.random()*100) + 1;
			if (numero <= peso1)
				System.out.printf("Linea %d: 1\n", contador);
			else if (numero <= peso1 + peso2)
				System.out.printf("Linea %d:  X\n", contador);
			else
				System.out.printf("Linea %d:   2\n", contador);
		}

	}
}
