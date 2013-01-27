package ejercicio1propuesto;

public class ejercicio1p {

	public static void main(String[] args) {
		int a=-2,b=5,c=9;
		if((a<b)&&(a<c)){
			System.out.println("El número menor de los tres es "+a);
		}
		if((b<a)&&(b<c)){
			System.out.println("El número menor de los tres es "+b);
		}
		if((c<b)&&(c<a)){
			System.out.println("El número menor de los tres es "+c);
		}	
		
		
		if((a>b)&&(a>c)){
			System.out.println("El número mayor de los tres es "+a);
		}
		if((b>a)&&(b>c)){
			System.out.println("El número mayor de los tres es "+b);
		}
		if((c>a)&&(c>b)){
			System.out.println("El número mayor de los tres es "+c);
		}
	}
}