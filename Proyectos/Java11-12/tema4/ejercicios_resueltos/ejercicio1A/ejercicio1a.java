package ejercicio1A;

public class ejercicio1a {

	public static int factorial(int num){
		if(num==0) 
			return 1;
		return num * factorial(num-1);
	}
	
	public void numero(int valor){
		for(int i=0;i<=valor;i++){
			System.out.println("El factorial de "+i+" es: "+factorial(i));
		}
	}
}