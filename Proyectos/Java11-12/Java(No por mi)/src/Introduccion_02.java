public class Introduccion_02 {		// VISIVILIDAD 1
	static int valor=1;
	public static void mostrarValor(){
		int valor=3;
		System.out.println(valor);
	}
	public static void main(String [] args){
		System.out.println(valor);
		valor++;
		mostrarValor();
	}
}