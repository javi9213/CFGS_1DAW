package determinante;

public class ApMatriz extends matriz{

	public static void main(String[] args) {
		
		matriz m = new matriz();
		long inicio = System.nanoTime();
		for(int i = 0; i <= 8; i++){
			System.out.print("Introduzca numero a la matriz:");
			int num = Leer.datoInt();
			m.anadirnum(num);
		}
		
		System.out.println();
		m.formatriz();
		System.out.println();
		System.out.println();
		System.out.print("El resultado de hacer el determinante es: ");
		m.determinante();
		System.out.println();
		System.out.println("Tiempo Array :" + (System.nanoTime() - inicio));
	}
}