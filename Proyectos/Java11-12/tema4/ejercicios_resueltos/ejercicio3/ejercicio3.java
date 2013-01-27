package ejercicio3;

public class ejercicio3 {

	public static int elemento(int fila, int columna){
		if(columna==1)
			return 1;
		if(columna<1||columna>fila)
			return 0;
		return elemento(fila-1,columna)+elemento(fila-1,columna-1);
	}
}