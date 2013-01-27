package ejercicio16;

public class ejercicio16 {

	public void paresjugador(int num, String dato){
		if(dato.compareToIgnoreCase("pares")==0){
			if((num>0)&&(num<=10)){
				if(num%2==0){
					System.out.println("Has sacado pares");
					System.out.println("Has ganado. ENHORABUENA");
				}else{
					System.out.println("Has sacado nones");
					System.out.println("Lo siento has perdido");
				}
			}else{
				System.out.println("Error número introducido es incorrecto");
			}
		}
		
		if(dato.compareToIgnoreCase("nones")==0){
			if((num<=10)&&(num>0)){
				if(num%2==0){
					System.out.println("Has sacado pares");
					System.out.println("Lo siento has perdido");
				}else{
					System.out.println("Has sacado nones");
					System.out.println("Has ganado. ENHORABUENA");
				}
			}else{
				System.out.println("Error número introducido es incorrecto");
			}
		}
	}
	
	public void paresordenador(){
		int num=1+(int)(Math.random()*10);
		if(num%2==0){
			System.out.println("El ordenador ha sacado pares");
		}else{
			System.out.println("El ordenador ha sacado nones");
		}
	}
	
	public void menu(){
		System.out.println("Pares o nones");
		System.out.println("**************");
		System.out.println("Opción 1: Jugar");
		System.out.println("Opción 2: Salir");
		System.out.print("Introduzca la opción deseada:");
	}
}