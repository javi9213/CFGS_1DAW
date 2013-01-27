package seleccion;

public class testSeleccion {

	public static void main (String[]args){
		seleccion select = new seleccion();

		int valor;

		for(int i = 0; i < select.getTAMARRAY(); i++){
			System.out.println("Introduzca valores a seleccionar:");
			valor=Leer.datoInt();
			select.anadirnum(valor);
		}

		System.out.println("Array desordenado");
		select.mostrar();//metodo mostrar que muestra el array antes de ordenarlo

		select.selecionar();

		System.out.println("Array ordenado");
		select.mostrar();//metodo mostrar el array ordenado
	}
}