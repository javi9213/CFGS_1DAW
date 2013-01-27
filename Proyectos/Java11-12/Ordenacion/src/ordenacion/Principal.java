package ordenacion;

public class Principal{
	public static int Menu(){
		int opcion;
		
		do{
			System.out.println("\nMetodos de Ordenacion\n");
			System.out.println("1. BURBUJA");
			System.out.println("2. SELECCION");
			System.out.println("3. INSERCION");
			System.out.println("0. SALIR");
			opcion = Leer.datoInt();
		}while (opcion < 0 && opcion > 3);
		
		return opcion;
	}
	
	public static void main(String[] args){
		int opcion;
	
		do{
			opcion = Menu();
			switch(opcion){
				case 1:{
					System.out.print("Tamanio de vector: "); int t = Leer.datoInt();
					MetodosOrdenacion vector1 = new MetodosOrdenacion(t);
					vector1.rellenarVector();
					System.out.println("\nArray Desordenado");
					vector1.mostrarVector();
					vector1.Burbuja();
					System.out.println("\nArray Ordenado");
					vector1.mostrarVector();
					System.out.println();
					break;
				}
				
				case 2:{
					System.out.print("Tamanio de vector: "); int t = Leer.datoInt();
					MetodosOrdenacion vector2 = new MetodosOrdenacion(t);
					vector2.rellenarVector();
					System.out.println("\nArray Desordenado");
					vector2.mostrarVector();
					vector2.Seleccion();
					System.out.println("\nArray Ordenado");
					vector2.mostrarVector();
					System.out.println();
					break;
				}
				
				case 3:{
					System.out.print("Tamanio del vector: "); int t=Leer.datoInt();
					MetodosOrdenacion vector3 = new MetodosOrdenacion(t);
					vector3.rellenarVector();
					System.out.println("\nArray Desordenado");
					vector3.mostrarVector();
					vector3.Insersion();
					System.out.println("\nArray Ordenado");
					vector3.mostrarVector();
					break;
				}
				case 0:{
					System.out.println("Hasta luego");
					break;
				}
			}
		}while(opcion != 0);
				
	}
}
