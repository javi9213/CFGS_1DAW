public class Introduccion_04 {		// VISIBILIDAD 3
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
		System.out.println(valor);
		mostrarValor();
	}
}