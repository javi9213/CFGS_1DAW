import java.util.*;
public class AppProceso {

	public static void menu(){
		System.out.println("MENU");
		System.out.println("//////");
		System.out.println("1. Introducir un proceso");
		System.out.println("2. Eliminar un proceso por el nombre");
		System.out.println("3. Arrancar el procesador con el algoritmo FIFO");
		System.out.println("4. Arrancar el procesador con el algoritmo EDF");
		System.out.println("5. Salir");
	}
	
	public static void main(String[] args) throws InterruptedException {
		int opc = 1;
		Scanner lector = new Scanner(System.in);
		CCola col = new CCola();
		CLista lista = new CLista();
		CProceso proc = null;
		do{
			menu();
			opc = lector.nextInt();
			
			switch(opc){
			
				case 1:{
					System.out.print("Introduzca el codigo identificador:");
					int cod = lector.nextInt();
					System.out.print("Introduzca nombre del proceso:");
					String nom = lector.next();
					System.out.print("Introduzca el tiempo de ejecucion:");
					long tiem = lector.nextLong();
					proc = new CProceso(cod, nom, tiem);
					lista.insertarPrincipio(proc);
					col.push(proc);
					break;
				}
				
				case 2:{
					System.out.print("Introduzca nombre a eliminar:");
					String nom = lector.next();
					break;
				}
				
				case 3:{
					//lista.toString();
					System.out.println(col.pop());
					Thread.sleep(proc.getTiempo()*1000);
					break;
				}
				
				case 4:{
					Thread.sleep(proc.getTiempo());
					lista.toString();
					break;
				}
				
				case 5:{
					System.out.println("SALIR");
					opc = 6;
					break;
				}
			}
		}while((opc>0)&&(opc<5));
	}
}