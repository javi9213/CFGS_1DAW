package ejercicio13;

public class aplicacion13 {

	public static void main(String[] args) throws InterruptedException {
		ejercicio13 comprobar = new ejercicio13();
		int opc;
		do{
			comprobar.menu();
			opc=Leer.datoInt();
		}while ((opc>4)||(opc<0));
			switch(opc){
			case 1:
				System.out.print("Introduzca número:");
				int num=Leer.datoInt();
				comprobar.par(num);
				Thread.sleep(3000);
				main(null);
				break;
			case 2:
				System.out.print("Introduzca número:");
				int num1=Leer.datoInt();
				comprobar.multiplo(num1);
				Thread.sleep(3000);
				main(null);
				break;
			case 3:
				System.out.print("Introduzca número:");
				int num2=Leer.datoInt();
				comprobar.tabla(num2);
				Thread.sleep(10000);
				main(null);
				break;
			case 4:
				System.out.println("Fin del programa");
				break;
			}
	}
}