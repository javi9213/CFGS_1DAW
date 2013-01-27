import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
 * Escriba un programa que declare dos variables booleanas con valores true y false y dos enteras con los 
 * valores 4 y 5 y haga con ellas todas las operaciones lógicas posibles.
 */
public class Ejercicios_12 {
	public static void main(String[] args) throws IOException {
		BufferedReader ln = new BufferedReader(new InputStreamReader(System.in));
		
		boolean A=true;
		boolean B=false;
		double a;
		double b;
		
		System.out.println("Valor de a: ");
		a=Double.parseDouble(ln.readLine());

		System.out.println("Valor de b: ");
		b=Double.parseDouble(ln.readLine());
		
		System.out.println(A&B);
		System.out.println(A^B);
		System.out.println(A|B);

		/*System.out.println(a&b);
		System.out.println(a^b);
		System.out.println(a|b);*/
	}
}