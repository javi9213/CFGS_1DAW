package Ejercicio1;

public class circulo extends figuras {

	private double radio;
	
	public circulo(){
		super();
		radio = 0.0;
	}
	
	public circulo(String tipos, String colores, double radios){
		super(tipos, colores);
		if(radios<=0){
			this.radio = 0.0;
		}else{
			this.radio = radios;
		}
	}
	
	public double getRadio(){
		return radio;
	}
	
	public void setRadio(double radios){
		this.radio = radios;
	}

	public double areacirculo(){
		double resulcir;
		resulcir = Math.PI * radio * radio;
		return resulcir;
	}
	
	public double perimetrocirc(){
		double resulcir;
		resulcir = 2 * Math.PI * radio;
		return resulcir;
	}

	public String toString(){
		String cadena = "";
		cadena += "Características:\nTipo: "+getTipo()+"\nColor: "+getColor()+"\nRadio: "+getRadio()+
		"\nÁrea: "+areacirculo()+"\nPerímetro: "+perimetrocirc()+"\n";
		return cadena;
	}
}