package ejercicio3;

public class Ejercicio3r
{
	public static void main(String[] arg)
	{
		double  valorx;
		double res;
    
    
		System.out.print("Introduzca el valor de x: ");
		valorx = Leerr.datoDouble();
		
		PolinomioEj3 polinomio = new PolinomioEj3();
		polinomio.setX(valorx);
		res = polinomio.devolverResultado();
		System.out.println("Para x = " + valorx + " 3x^5-5x^3+2x-7 = "+res);
	}
}