package tema2;
class coche {
	private int velocidad;
	coche(){
		velocidad=0;
	}
	public int getVelocidad(){
		return velocidad;
	}
	public void acelera(int mas){
		velocidad+=mas;
	}
	public void frena(int menos){
		velocidad-=menos;
	}
}
