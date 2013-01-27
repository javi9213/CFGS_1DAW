package inmueble;

public  class CSolares extends CSuperficie{
	
	//atributos privados
	private boolean zona;
	
	//constructor
	public CSolares(String ubicacion, float mCuadrado, float pmCuadrado, boolean zonaSolar){
			
		super(ubicacion, mCuadrado, pmCuadrado);
		this.zona=zonaSolar;		
	}
	
	//getters y setters
	public boolean isZona() {
		return zona;
	}

	public void setZona(boolean zona) {
		this.zona = zona;
	}

	//equals()
	public  boolean equals(Object inm){
		
		boolean igual=true;
		
		if(this.getUbic().compareToIgnoreCase(((CSolares)inm).getUbic())!=0) igual=false;
		else if (this.getmCuadr()!=((CSolares)inm).getmCuadr()) igual=false;
		else if (this.getPrecioMCuadr()!=((CSolares)inm).getPrecioMCuadr()) igual=false;
		else if(this.zona!=((CSolares)inm).zona) igual=false;
		return igual;
	}
	
	//toString
	public String toString() {
		
		String cadena="";
		
		cadena+=super.toString();
		cadena+="\nZona del superficie: ";
		
		if(this.zona) cadena+="rústica";
		else cadena+="urbana";
		return cadena;
	}
}