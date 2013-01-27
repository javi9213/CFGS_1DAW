package tema2;
class consumo {
	private static float kms;
	private static float litros;
	private static float vmed;
	private static float pgas;
	public consumo(){
		kms=80;
		litros=15;
		vmed=120;
		pgas=1.4F;
	}
	
	public void setKms(float km){
		kms=km;
	}
	public void setLitros(float litro){
		litros=litro;
	}
	public void setVmed(float vmed1){
		vmed=vmed1;
	}
	public void setPgas(float pgas1){
		pgas=pgas1;
	}
	public void getTiempo(){
		float tiempo=vmed/kms;
		System.out.println(tiempo);
	}
	public void consumoMedio(){
		float consumotiempo=litros/100;
		System.out.println(consumotiempo);
	}
	public void consumoEuros(){
		float consumoeuros=pgas/100;
		System.out.println(consumoeuros);
	}
	
	public static void main(String[] args){
		consumo c=new consumo();
		c.setKms(100);
		c.setLitros(20);
		c.setVmed(110);
		c.setPgas(1.35F);
		c.getTiempo();
		c.consumoMedio();
		c.consumoEuros();
	}
}