import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*Escriba un programa que calcule las raíces de la ecuación de segundo grado: 2x^2 + 4x – 6 = 0
 * NOTA: La función que calcula la raíz cuadrada de un número es Math.sqrt(número);*/
public class Ejercicios_11 {
	public static void main(String[] args) throws IOException {
		BufferedReader ln = new BufferedReader(new InputStreamReader(System.in));
		
		double a;
		double b=4;
		double c=-6;
		double resultado1;
		double resultado2;
		//double be;
		//double raiz;
		//be=Math.pow(b,2);
		//raiz=be-4*a*c;
		//System.out.println("BE: "+be+" RAIZ:"+raiz);
		//resultado1=(-b+(Math.sqrt(raiz)))/(2*a);
		//resultado2=(-b-(Math.sqrt(raiz)))/(2*a);
		//resultado1=(int)((-b+(Math.sqrt((b*b)-(4*a*c))))/(2*a));
		//resultado2=(int)((-b-(Math.sqrt((b*b)-(4*a*c))))/(2*a));
		
		System.out.println("Valor de a: ");
		a=Double.parseDouble(ln.readLine());

		System.out.println("Valor de b: ");
		b=Double.parseDouble(ln.readLine());
		
		System.out.println("Valor de c: ");
		c=Double.parseDouble(ln.readLine());
		
		resultado1= (-b+(Math.sqrt(Math.pow(b,2)-4*a*c)))/(a*2);
		resultado2= (-b-(Math.sqrt(Math.pow(b,2)-4*a*c)))/(a*2);
		
		System.out.println("Resultado de x="+resultado1);
		System.out.println("Resultado de x^2="+resultado2);
	}
}