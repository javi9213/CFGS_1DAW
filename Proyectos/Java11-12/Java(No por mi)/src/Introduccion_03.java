
public class Introduccion_03 {	// VISIBILIDAD 2

	static int valor=1;
	public static void mostrarValor(){
		int valor=3;
		System.out.println(valor);
		valor++;
	}
	public static void main(String [] args){
		System.out.println(valor);
		valor++;
		mostrarValor();
		mostrarValor();
	}
}