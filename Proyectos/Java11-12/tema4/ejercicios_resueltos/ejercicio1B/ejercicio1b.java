package ejercicio1B;

public class ejercicio1b {

	public static int factorial(int num){
		int factorial=1;
		while(num>0){
			factorial*=num;
			num--;
		}
		return factorial;
	}
	
	public void numero(int valor){
		for(int i=0;i<=valor;i++){
			System.out.println("El factorial de "+i+" es: "+factorial(i));
		}
	}
}