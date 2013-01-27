package ejercicio3;

public class PolinomioEj3
{

	private double x;
	
	public PolinomioEj3()
	{
		x = 0;
	}
	
	public void setX(double numero)
	{
		x = numero;
	}
	
	public double devolverResultado()
	{
		double res = 0;
		
		res = 3*Math.pow(x,5) - 5*Math.pow(x,3) + 2*x -7;
		
		return res;
	}
	
}
