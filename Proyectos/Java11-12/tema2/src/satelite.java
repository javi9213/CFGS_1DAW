public class satelite {
	private double meridiano;
	private double paralelo;
	private double distancia_tierra;
	satelite (double m,double p,double d){
		meridiano=m;
		paralelo=p;
		distancia_tierra=d;
	}
	satelite(){
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
	void variaAltura(double desplazamiento){
		desplazamiento=4;
		if(desplazamiento>=0){
			return;
		}else{
			return;
		}
	}
	boolean enOrbita(){
		if(distancia_tierra==0){
			return(false);
		}else{
			return(true);
		}
	}
	void variaPosicion(double variap, double variam){
		variap=paralelo;
		variam=meridiano;
	}
}