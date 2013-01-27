import java.util.Scanner;

public class Agenda {
	
	//Metodo estatico menu()
	public static void menu(){
		System.out.println("Agenda Telefonica");
		System.out.println("/////////////////");
		System.out.println("1. Anadir Contacto");
		System.out.println("2. Eliminar Contacto");
		System.out.println("3. Mostrar todos los contactos");
		System.out.println("4. Obtener contacto");
		System.out.println("5. Salir");
	}

	public static void main(String[] args){
		
		//lista de los contactos
		listaAE lista = new listaAE();
		
		//Clase Scanner para leer de consola los datos
		Scanner lector = new Scanner(System.in);
		int opc = 1;
		String nom = "";
		int edad = 0;
		long numtelf = 0;
		
		//Menu de los contactos
		do{
			menu();
			opc = lector.nextInt();
			switch (opc){
			case 1:{
				System.out.print("Inserte nombre: ");
				nom=lector.next();
				System.out.print("Inserte edad: ");
				edad=lector.nextInt();
				System.out.print("Inserte numero de telefono: ");
				numtelf=lector.nextLong();
				CPersona p1 = new CPersona(nom, edad, numtelf);
				lista.anadir(p1);
				System.out.println();
				break;
			}
			
			case 2:{
				System.out.print("Inserte el numero de telefono del contacto a borrar: ");
				numtelf=lector.nextLong();
				lista.borrar(numtelf);
				System.out.println();
				break;
			}
			
			case 3:{
				System.out.println(lista.toString());
				System.out.println();
				break;
			}
			
			case 4:{
				System.out.print("Inserte el nombre del contacto a buscar: ");
				nom=lector.next();
				System.out.print(lista.obtener(nom));
				System.out.println();
				break;
			}
			
			case 5:{
				System.out.println("SALIR");
				opc++;
				break;
			}
			
			}
			
		}while((opc<6)&&(opc>0));
		
	}
}