package ejercicio5;

public class Juego {
	
	public void acertarNumero(int numero,int numero_ordenador){
		
		if(numero<numero_ordenador){
			System.out.println("Es mayor");
		}
		else if(numero>numero_ordenador){
			System.out.println("Es menor");
		}else{
			System.out.println("Muy bien, has acertado el número");
		}
	}
}