package mis_clases;

public class pruebas {

	public static void main(String[] args) {
		int a=1;
		double b;
		double num1=6, num2=8, num3=2;
		
		double ecuacion1= ((-num2)+Math.sqrt(Math.pow(num2,2)-(4*num1*num3)))/(2*num1);//ecuacion de 2º grado +
		System.out.println(ecuacion1);

		double ecuacion2= ((-num2)-Math.sqrt(Math.pow(num2,2)-(4*num1*num3)))/(2*num1);//ecuacion de 2º grado -
		System.out.println(ecuacion2);
		
		b=Math.sin(a);//seno
		System.out.println(b);
		
		b=Math.cos(a);//coseno
		System.out.println(b);
		
		b=Math.tan(a);//tangente
		System.out.println(b);
		
		b=Math.pow(a,2);//potencia
		System.out.println(b);
		
		b=Math.sinh(a);//secante
		System.out.println(b);
		
		b=Math.cosh(a);//cosecante
		System.out.println(b);
		
		b=Math.tanh(a);//cotangente
		System.out.println(b);
		
		b=Math.exp(a);//numero e elevado a un numero
		System.out.println(b);
		
		b=Math.log(a);//logaritmo neperiano
		System.out.println(b);
		
		b=Math.log10(a);//logaritmo de base 10
		System.out.println(b);
		
		b=Math.PI;//numero pi
		System.out.println(b);
		
		b=Math.E;//numero e
		System.out.println(b);
		
		b=Math.acos(a);//arcocoseno
		System.out.println(b);
		
		b=Math.asin(a);//arcoseno
		System.out.println(b);
		
		b=Math.atan(a);//arcotangente
		System.out.println(b);
		
		b=Math.toDegrees(a);//pasar radianes a grados
		System.out.println(a);
		
		b=Math.toRadians(a);
		System.out.println(a);//pasar grados a radianes
	}
}