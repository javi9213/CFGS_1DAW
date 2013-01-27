package Ejercicio1;

public class rectangulo extends figuras {

	private double base;
	private double altura;
	
	public rectangulo(){
		super();
		base = 0.0;
		altura = 0.0;
	}
	
	public rectangulo(String tipos, String colores, double bases, double alturas){
		super(tipos,colores);
		if(bases<=0){
			this.base = 0.0;
		}else{
			this.base = bases;
		}
		
		if(alturas<=0){
			this.altura = 0.0;
		}else{
			this.altura = alturas;
		}
	}
	
	public double getBase(){
		return base;
	}
	
	public double getAltura(){
		return altura;
	}
	
	public void setBase(double bases){
		this.base = bases;
	}
	
	public void setAltura(double alturas){
		this.altura = alturas;
	}
	
	public double arearectan(){
		double resultrectan;
		resultrectan = base * altura;
		return resultrectan;
	}
	
	public double perimetrorectan(){
		double resultrectan;
		resultrectan = (2 * base) + (2 * altura);
		return resultrectan;
	}

	public String toString(){
		String cadena = "";
		cadena += "Características:\nTipo: "+getTipo()+"\nColor: "+getColor()+"\nBase: "+getBase()+
		"\nAltura: "+getAltura()+"\nÁrea: "+arearectan()+"\nPerímetro: "+perimetrorectan()+"\n";
		return cadena;
	}
}