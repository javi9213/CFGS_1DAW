package ejercicio14;

public class aplicacion14 {

	public static void main(String[] args) throws InterruptedException {
		ejercicio14 dado = new ejercicio14();
		int opc;
		do{
			dado.menu();
			opc=Leerr.datoInt();
		}while((opc>2)||(opc<0));
		switch(opc){
		case 1:
			System.out.print("Introduzca número de tiradas del dado:");
			int num=Leerr.datoInt();
			dado.tirar(num);
			Thread.sleep(8000);
			System.out.println();
			main(null);
			break;
		case 2:
			System.out.println("Fin del programa");
			break;
		}
	}
}