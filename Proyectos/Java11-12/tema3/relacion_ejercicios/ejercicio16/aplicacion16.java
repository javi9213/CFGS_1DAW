package ejercicio16;

public class aplicacion16 {

	public static void main(String[] args) throws InterruptedException {
		ejercicio16 nones = new ejercicio16();
		int opc;
		do{
			nones.menu();
			opc=Leer.datoInt();
		}while((opc>2)||(opc<0));
			switch(opc){
			case 1:
				System.out.print("Introduzca si juega con pares o nones: ");
				String parnon=Leer.dato();
				System.out.print("Introduzca número a jugar:");
				int num=Leer.datoInt();
				nones.paresjugador(num,parnon);
				nones.paresordenador();
				System.out.println();
				Thread.sleep(3000);
				main(null);
				break;
			case 2:
				System.out.println("Fin del programa");
				break;
			}
	}
}