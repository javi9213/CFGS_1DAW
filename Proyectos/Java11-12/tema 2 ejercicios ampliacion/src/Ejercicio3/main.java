package Ejercicio3;

public class main {
	 
	
	//metodo para mostrar el menu..
	public static int menu(){
		int opc;
		
		System.out.printf("\nElige la opción");
		System.out.printf("\n1.Palabra de 2 vocales.Una oportunidad de adivinar(100 puntos)");
		System.out.printf("\n2.Palabra de 3 vocales.Dos oportunidades de adivinar(80 puntos)");
		System.out.printf("\n3.Palabra de 4 vocales.Tres oportunidad de adivinar(50 puntos)\n");
		
		return opc=Leer.datoInt();
	}

	public static void main(String[] args) {
		//Atributos locales
		boolean salir=false;
		boolean opcCorrect=false;
		int opcMenu1;
		int opcMenu2;
		String opcPreg;
		int numVocal = 0;
		int cmpSalir;
		int puntos = 0;
		
		
		System.out.printf("\nAdivina la palabra\nEl juego consiste en la adivinación de una palabra, \n" +
				"compuesta por vocales y que siempre empieza por 'A' o 'a'.");
		while(salir==false){
			//MENU
			System.out.printf("\n1.Jugar\n2.Salir\n");
			opcMenu1=Leer.datoInt();
			if(opcMenu1==1){
				opcMenu2=menu();
				
				//Control de entrada
				while(opcCorrect==false){
					if(opcMenu2==1 || opcMenu2==2 || opcMenu2==3){
						opcCorrect=true;
					}
					else{
						System.out.printf("\nOpción incorrecta\n ");
						opcMenu2=menu();
					}
				}
				//Fin de control de entrada
				switch(opcMenu2){
					case 1: numVocal=2; break; 
					case 2: numVocal=3; break;
					case 3: numVocal=4; break;
				}
				comprobar cmp=new comprobar(numVocal);
				cmp.comprobar();
				puntos+=cmp.puntos;
	
				System.out.printf("\n¿Quieres salir (s/n)");
				opcPreg=Leer.dato();
				cmpSalir=opcPreg.compareToIgnoreCase("s");
				if(cmpSalir==0){
					salir=true; 
					System.out.printf("\nEn total has ganado %d puntos", puntos);
					}
			}
			else{System.out.printf("\nSe cierra el programa"); System.exit(0);}
		}
		
	}

}
