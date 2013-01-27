package ejercicio4;

public class ejercicio4 {

	public static int elemento(int fila, int columna){
		if(fila<1||columna<1)
			return 0;
		if(columna==1)
			return 1;
		return elemento(fila-1,columna)+elemento(fila-1,columna-1)+elemento(fila-1,columna-2);
	}
	
	
}