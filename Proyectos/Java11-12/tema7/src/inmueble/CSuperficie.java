package inmueble;

public abstract class CSuperficie extends CInmuebles{
	
	//atributos privados
	private float precioMCuadr;
	
	//constructor
	public CSuperficie(String ubicacion, float mCuadrado, float pmCuadrado){
		
		super(ubicacion, mCuadrado);
		this.precioMCuadr=pmCuadrado;
	}
	
	//getters y setters
	public float getPrecioMCuadr() {
		return precioMCuadr;
	}

	public void setPrecioMCuadr(float precioMCuadr) {
		this.precioMCuadr = precioMCuadr;
	}

	//calcular el precio
	public float precio(){
		return this.precioMCuadr*this.getmCuadr();
	}
	
	//equals() 
	public abstract boolean equals(Object inm);
	
	
	//toString()
	public String toString() {
		
		String cadena="";
		
		cadena+=super.toString();
		cadena+="\nPrecio por metro cuadrado: "+this.precioMCuadr;
		return cadena;
	}
}