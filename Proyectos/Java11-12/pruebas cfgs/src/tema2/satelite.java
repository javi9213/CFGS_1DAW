package tema2;
class satelite {
	private double meridiano;
	private double paralelo;
	private double distancia_tierra;
	public satelite (double m,double p,double d){
		meridiano=m;
		paralelo=p;
		distancia_tierra=d;
	}
	public satelite(){
		meridiano=paralelo=distancia_tierra=0;
	}
	public void setPosicion(double m,double p,double d){
		meridiano=m;
		paralelo=p;
		distancia_tierra=d;
	}
	public void printPosicion(){
		System.out.println("El satélite se encuentra en el paralelo "+paralelo+" Meridiano "+meridiano+" a una distancia de la tierra de "+distancia_tierra+" Kilómetros");
	}
	public void variaAltura(double desplazamiento){
		if(desplazamiento>=0){
			return;
		}else{
			return;
		}
	}
	public boolean enOrbita(){
		if(distancia_tierra==0){
			return(false);
		}else{
			return(true);
		}
	}
	public void variaPosicion(double variap, double variam){
		variap=paralelo;
		variam=meridiano;
	}
	public static void main (String[]args){
		satelite s=new satelite();
		s.setPosicion(5,2,9);
		s.printPosicion();
		s.variaAltura(9);
		s.enOrbita();
		s.variaPosicion(4,1);
	}
	
	
	
	
	
}