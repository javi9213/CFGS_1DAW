package ejercicio4;

public class Ejercicio4r
{
	public static void main(String[] arg)
	{
		double  valorx, a, b, c;
		double res;
    
		System.out.print("Introduzca el valor del coeficiente a: ");
		a = Leerr.datoDouble();
		System.out.print("Introduzca el valor del coeficiente b: ");
		b = Leerr.datoDouble();
		System.out.print("Introduzca el valor del coeficiente c: ");
		c = Leerr.datoDouble();
		System.out.print("Introduzca el valor de x: ");
		valorx = Leerr.datoDouble();
		
		PolinomioEj4 polinomio = new PolinomioEj4();
		polinomio.setX(valorx);
		polinomio.setA(a);
		polinomio.setB(b);
		polinomio.setC(c);
		
		res = polinomio.devolverResultado();
		System.out.println("Para x = " + valorx + " - " + a +"x^5 - " + b + "x^3 + " + c + "x - 7 = " + res);
	}
}