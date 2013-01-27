package ejercicio3p;

public class moneda extends sorteo {

	public moneda(){}
	
	public moneda(int posibilidad){
		this.posibilidades = posibilidad;
	}
	
	public int lanzar(){
		posibilidades = (int) (Math.random()*2+1);
		if(posibilidades == 1){
			System.out.println("cara");
		}else{
			System.out.println("cruz");
		}
		return posibilidades;
	}
	
	/*public static void main(String[] args) {
		moneda prueba1 = new moneda();
		prueba1.lanzar();
	}*/
}