package ejercicios;
public class InfoFrutas{

	public void imprimirFruta(Fruta fr){
		System.out.print("La fruta se llama: ");
		fr.escribeNombre();
		fr.escribeCaracteristicas();
	}
	
	public static void main(String[] args){
		// Se crean objetos de las clases Fruta, Naranja y Manzana
		// y se inicializan sus valores
		
		Fruta fruta1 = new Fruta("Mango");
		Fruta fruta2 = new Fruta("Piña");
		
		Manzana fruta3 = new Manzana();
		fruta3.cambiaCategoria("Reineta");
		Manzana fruta4 = new Manzana();
		fruta4.cambiaCategoria("Golden");
		
		Naranja fruta5 = new Naranja();
		fruta5.cambiaOrigen("Valencia");
		Naranja fruta6 = new Naranja();
		fruta6.cambiaOrigen("Marruecos");
		
		// Se imprime su información
		InfoFrutas imp = new InfoFrutas();
		
		imp.imprimirFruta(fruta6);
		imp.imprimirFruta(fruta1);
		imp.imprimirFruta(fruta3);
		imp.imprimirFruta(fruta4);
		imp.imprimirFruta(fruta5);
		imp.imprimirFruta(fruta2);
	}
}