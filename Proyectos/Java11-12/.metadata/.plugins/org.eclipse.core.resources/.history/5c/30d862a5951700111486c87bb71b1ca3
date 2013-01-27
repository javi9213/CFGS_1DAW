package ejercicios_resueltos;

public class ejercicio4 {
	
	public static int potencia(int base,int exponente){
		int resultado=base;
		for(int i=0;i<exponente-1;i++){
			resultado=resultado*base;
		}
		return resultado;
	}
	
	public static int armstrong(int num){
		int num1=num/100;
		int num2=(num-100*num1)/10;
		int num3=num-100*num1-10*num2;
		int dato=potencia(num1,3)+potencia(num2,3)+potencia(num3,3);
		if(dato==num){
			return 1;
		}else{
			return 0;
		}
	}
	
	public static void main(String[] args) {
		if(armstrong(874)==1){
			System.out.println("El número 874 es un número Armstrong.");
		}else{
			System.out.println("EL número 874 no es un número Armstrong.");
		}
		
		if(armstrong(153)==1){
			System.out.println("El número 153 es un número Armstrong.");
		}else{
			System.out.println("El número 153 no es un número Armstrong.");
		}
	}
}