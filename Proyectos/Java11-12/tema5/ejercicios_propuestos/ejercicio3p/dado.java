package ejercicio3p;

public class dado extends sorteo {

	public dado(){}
	
	public dado(int posibilidad){
		this.posibilidades = posibilidad;
	}
	
	public int lanzar() {
		posibilidades = (int) (Math.random()*6+1);
		//System.out.println(posibilidades);
		return posibilidades;
	}
	
	/*public static void main(String[] args) {
		dado prueba = new dado();
		prueba.lanzar();
	}*/
}