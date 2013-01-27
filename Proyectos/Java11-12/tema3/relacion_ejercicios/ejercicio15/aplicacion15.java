package ejercicio15;

import ejercicio16.Leer;

public class aplicacion15 {

	public static void main(String[] args) throws InterruptedException {
		int opc, fil, col;
		ejercicio15 quiniela = new ejercicio15();
		
		do{
			quiniela.menu();
			opc=Leer.datoInt();
		}while((opc>2)||(opc<0));
			switch(opc){
			case 1:
				System.out.print("Introduzca número de filas:");
				fil=Leer.datoInt();
				System.out.print("Introduzca número de columnas:");
				col=Leer.datoInt();
				quiniela.columnas(fil, col);
				System.out.println();
				Thread.sleep(5000);
				main(null);
				break;
			case 2:
				System.out.println("Fin del programa");
				break;
			}
	}
}