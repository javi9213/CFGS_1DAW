package Ejercicio1;

public abstract class figuras {

	protected String tipo;
	protected String color;
	
	public figuras(){
		tipo = "Ninguno";
		color = "Ninguno";
	}
	
	public figuras(String tipos, String colores){
		this.tipo = tipos;
		this.color = colores;
	}
	
	public String getTipo(){
		return tipo;
	}
	
	public String getColor(){
		return color;
	}
	
	public void setTipo(String tipos){
		this.tipo = tipos;
	}
	
	public void setColor(String colores){
		this.color = colores;
	}
	
	public abstract String toString();
}