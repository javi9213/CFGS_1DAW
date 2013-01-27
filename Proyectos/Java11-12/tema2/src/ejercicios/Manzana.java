package ejercicios;
public class Manzana extends Fruta{
	private String categoria;
	
	public Manzana(){
		// Como ya se sabe que es una Manzana, se inicializa el valor del nombre.
		super("Manzana");
	}
	
	public void escribeCaracteristicas(){
		System.out.println("Categoria: " + categoria);
	}
	
	public void cambiaCategoria(String nuevaCategoria){
		categoria = nuevaCategoria;
	}
}