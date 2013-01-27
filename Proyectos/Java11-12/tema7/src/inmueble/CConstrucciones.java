package inmueble;

public abstract class CConstrucciones extends CInmuebles{
	
	//atributos privados
	private boolean tipo;
	
	//constructor
	public CConstrucciones(String ubicacion, float mCuadrado, boolean tipoConstr){
		
		super(ubicacion, mCuadrado);
		this.tipo=tipoConstr;
	}
	
	//getters y setters
	public boolean isTipo() {
		return tipo;
	}

	public void setTipo(boolean tipo) {
		this.tipo = tipo;
	}

	//equals() 
	public abstract boolean equals(Object inm);
	
	//toString
	public String toString() {
		String cadena="";
		
		cadena+=super.toString();
		cadena+="\nTipo de la construccion: ";
		
		if(this.tipo) cadena+="nuevo";
		else cadena+="segunda mano";
		return cadena;
	}
}