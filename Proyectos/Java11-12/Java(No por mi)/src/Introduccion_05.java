public class Introduccion_05 {		//VISIBILIDAD4
	static int valor1=1;
	public static void mostrarValor(){
		System.out.println(valor1);
		valor1++;
	}
	public static void main(String [] args){
		System.out.println(valor1);
		mostrarValor();
		mostrarValor();
	}
}