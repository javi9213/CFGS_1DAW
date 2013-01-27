/////////////////////////////////////////////////////////////////
// Aplicación para trabajar con números racionales

package ejercicios;
class Ejercicio3{
	public static void main(String[] args){
		CRacional r1 = new CRacional(24,16);
		r1.Simplificar();
		CRacional r2 = new CRacional(1);
		r2.Simplificar();
		CRacional r3;
		r3 = r1.Sumar(r2);
		r3.Simplificar();
		System.out.println(r1.ToString() + " + " + r2.ToString() + " = " + r3.ToString());
		
		r3 = (r1.Restar(r2));
		r3.Simplificar();
		System.out.println(r1.ToString() + " - " + r2.ToString() + " = " + r3.ToString());
		
		r3 = r1.Multiplicar(r2);
		r3.Simplificar();
		System.out.println(r1.ToString() + " * " + r2.ToString() + " = " + r3.ToString());
		
		long n = 2;
		r3 = new CRacional(n).Sumar(r2);
		r3.Simplificar();
		System.out.println(n + "/1 + " + r2.ToString() + " = " + r3.ToString());
	}
}