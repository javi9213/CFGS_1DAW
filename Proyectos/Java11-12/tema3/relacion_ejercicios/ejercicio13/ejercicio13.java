package ejercicio13;

public class ejercicio13 {

	public void par(int num){
		if(num%2==0){
			System.out.println("El número "+num+" es par");
		}else{
			System.out.println("El número "+num+" no es par");
		}
	}
	
	public void multiplo(int num){
		if(num%5==0){
			System.out.println("El número "+num+" es múltiplo de 5");
		}else{
			System.out.println("El número "+num+" no es múltiplo de 5");
		}
	}
	
	public void tabla(int num){
		System.out.println("Tabla del "+num);
		System.out.println("************");
		for(int i=1;i<=10;i++){
			int num3=num;
			int num4=num3*i;
			System.out.println(num3+" * "+i+" = "+num4);
		}
	}
	
	public void menu() throws InterruptedException{
		System.out.println("Programa para comprobar si un número es par,");
		System.out.println("si es múltiplo de 5 o imprimir su tabla de multiplicar");
		System.out.println("********************************************************");
		System.out.println("¿Qué desea realizar?");
		System.out.println("Opción 1: Comprobar si un número es par");
		System.out.println("Opción 2: Comprobar si es múltiplo de 5");
		System.out.println("Opción 3: Imprimir su tabla de multiplicar");
		System.out.println("Opción 4: Salir del programa");
		System.out.print("Introduzca opción deseada: ");
	}
}
