package insercion;

public class testInsercion {

	public static void main(String[]args){
		insercion insert = new insercion();

		int valor;

		for(int i = 0; i < insert.getTAMARRAY(); i++){
			System.out.println("Introduzca valores a insertar:");
			valor=Leer.datoInt();
			insert.anadirnum(valor);
		}

		System.out.println("Array desordenado");
		insert.mostrar();//metodo mostrar que mostrara el array antes de ordenarlo

		insert.insertar();

		System.out.println("Array ordenado");
		insert.mostrar();//metodo mostrar el array ordenado
	}
}