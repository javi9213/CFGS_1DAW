package inmueble;

public abstract class CLocales extends CConstrucciones{
	
	//atributos privados
	private float precioMCuadr;
	
	//constructor
	public CLocales(String ubicacion, float mCuadrado, boolean tipoConstr, float precioMCuadrado){
		
		super(ubicacion, mCuadrado, tipoConstr);
		this.precioMCuadr=precioMCuadrado;
	}
	
	//getters y setters
	public float getPrecioMCuadr() {
		return precioMCuadr;
	}

	public void setPrecioMCuadr(float precioMCuadr) {
		this.precioMCuadr = precioMCuadr;
	}

	//equals()
	public  boolean equals(Object inm){
		
		boolean igual=true;
		
		if(this.getUbic().compareToIgnoreCase(((CLocales)inm).getUbic())!=0) igual=false;
		else if (this.getmCuadr()!=((CLocales)inm).getmCuadr()) igual=false;
		else if (this.isTipo()!=((CLocales)inm).isTipo()) igual=false;
		else if(this.precioMCuadr != ((CLocales)inm).precioMCuadr) igual=false;
		return igual;
	}
	
	//toString
	public String toString() {
		
		String cadena="";
		
		cadena+=super.toString();
		cadena+="\nPrecio por metro cuadrado del local: "+this.precioMCuadr;
		return cadena;
	}
}