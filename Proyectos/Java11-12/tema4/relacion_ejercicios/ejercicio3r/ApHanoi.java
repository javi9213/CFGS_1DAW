package ejercicio3r;

public class ApHanoi {

	public static void main(String[] args) {
		int num = 0;
		do{
			System.out.print("Introduzca número de discos: ");
			num = Leer.datoInt();
		} while(num<=0);
		CHanoi torre = new CHanoi();
		torre.solucion(num, "A", "B", "C");
	}
}