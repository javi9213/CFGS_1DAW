/*Programa para ver los distintos valores de las variables según su posición*/

public class visibilidad {
	static int valor=0;
		public static void mostrarValor(){
			int valor=3;
			System.out.println(valor);
		}

		public static void main(String[] args) {
		System.out.println(valor);
		valor++;
		mostrarValor();
		}
}
/*Hecho por Javier González*/