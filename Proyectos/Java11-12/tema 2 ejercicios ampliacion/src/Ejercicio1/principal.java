package Ejercicio1;

public class principal {
	
	public static void main (String[] ar) throws InterruptedException{
		alumno a1 = new alumno();
		
		int opt;
		
		do{
			
			System.out.println("\nElija las opciones en el menu");
			System.out.println("1 - Introducir alumno");
			System.out.println("2 - Ver información");
			System.out.println("0 - Salir");
			opt = Leer.datoInt();
			
			switch(opt){
				case 1: {
					System.out.println("\n#### MATRICULA ####");
					System.out.println("Introduzca el nombre del alumno");
					String nom = Leer.dato();
					a1.setNombre(nom);
					System.out.println("Introduzca el curso");
					String cur = Leer.dato();
					a1.setCurso(cur);
					System.out.println("Generando numero de matricula");
					a1.setMatricula();
					Thread.sleep(3000);
					System.out.println("Numero de matricula generado con exito");
				}
				break;
				case 2: {
					System.out.println("\n#### Información del alumno ####");
					System.out.println("El sistema esta buscando la información del alumno\nporfavor espere un momento");
					Thread.sleep(5000);
					System.out.println("Información encontrada");
					System.out.println("Escribiendo datos en pantalla");
					System.out.println("\n------------------------------------");
					Thread.sleep(1000);
					a1.ImprimirInfo();
					System.out.println("\n--------------------------------------");
				}
				break;
				
				default: {
					System.err.println("\nError, introduzca una opcion valida");
				}
				break;
				
				case 0: System.out.println("### FIN DE EJECUCIÓN ###\n\tv1.026b");
			}
			
		}while(opt != 0);
	}

}
