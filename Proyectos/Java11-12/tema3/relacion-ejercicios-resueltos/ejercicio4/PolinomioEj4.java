package ejercicio4;

public class PolinomioEj4
{
	private double a;
	private double b;
	private double c;
	private double x;
	
	public PolinomioEj4()
	{
		a = 1;
		b = 1;
		c = 1;
		x = 0;
	}
	
	public void setX(double numero)
	{
		x = numero;
	}
	
	public void setA(double numero)
	{
		a = numero;
	}
	
	public void setB(double numero)
	{
		b = numero;
	}
	
	public void setC(double numero)
	{
		c = numero;
	}
	
	public double devolverResultado()
	{
		double res = 0;
		
		res = a*Math.pow(x,5) - b*Math.pow(x,3) + c*x - 7;
		
		return res;
	}
	
}
