package ejercicio9;

public class aplicacion {

	/*En la clase aplicacion.java leo de pantalla el dato
	 * de la altura y se lo paso al constructor (con el objeto
	 * previamente creado) y luego llamo al método reloj
	 * para dibujar la figura.*/
	
	public static void main(String[] args) {

		System.out.print("Introduzca número para realizar el reloj de arena: ");
		int num = Leer.datoInt();

		relojarena arena = new relojarena(num);
		arena.reloj();
	}
}