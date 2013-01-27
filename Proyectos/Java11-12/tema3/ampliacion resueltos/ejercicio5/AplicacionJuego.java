package ejercicio5;

public class AplicacionJuego {
	
	public static void main(String[]args){
		Juego game = new Juego();
		int numero=0,cont=1;
		final int numero_ordenador = (int)((Math.random()*100)+1);
		
		do{
			System.out.println("Introduzca un número: ");
			numero = Leerr.datoInt();
			game.acertarNumero(numero, numero_ordenador);
			cont++;
		}while(numero!=numero_ordenador);
		
		System.out.println("Número de intentos: "+cont);
	}
}