package Ejercicio1;

public class cuadrado extends figuras {
	
	private double lado;

	public cuadrado(){
		super();
		lado = 0.0;
	}
	
	public cuadrado(String tipos, String colores, double lados){
		super(tipos,colores);
		if(lados<=0){
			this.lado = 0.0;
		}else{
			this.lado = lados;
		}
	}
	
	public double getLado(){
		return lado;
	}
	
	public void setLado(double lados){
		this.lado = lados;
	}

	public double areacuadr(){
		double resultcuadr;
		resultcuadr = Math.pow(lado,2);
		return resultcuadr;
	}
	
	public double perimetrocuadr(){
		double resultcuadr;
		resultcuadr = 4 * lado;
		return resultcuadr;
	}
	
	public String toString(){
		String cadena = "";
		cadena += "Características:\nTipo: "+getTipo()+"\nColor: "+getColor()+"\nLado: "+getLado()+
		"\nÁrea: "+areacuadr()+"\nPerímetro: "+perimetrocuadr()+"\n";
		return cadena;
	}
}