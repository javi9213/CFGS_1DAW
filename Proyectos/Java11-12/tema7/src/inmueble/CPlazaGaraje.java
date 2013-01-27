package inmueble;

public class CPlazaGaraje extends CSuperficie{
	
	//atributos privados
	private boolean tipo;
	
	//constructor
	public CPlazaGaraje(String ubicacion, float mCuadrado, float pmCuadrado, boolean tipoPG){
			
		super(ubicacion, mCuadrado, pmCuadrado);
		this.tipo=tipoPG;
	}
	
	//getters y setters
	public boolean isTipo() {
		return tipo;
	}

	public void setTipo(boolean tipo) {
		this.tipo = tipo;
	}

	//equals()
	public  boolean equals(Object inm){
		
		boolean igual=true;
		
		if(this.getUbic().compareToIgnoreCase(((CPlazaGaraje)inm).getUbic())!=0) igual=false;
		else if (this.getmCuadr()!=((CPlazaGaraje)inm).getmCuadr()) igual=false;
		else if (this.getPrecioMCuadr()!=((CPlazaGaraje)inm).getPrecioMCuadr()) igual=false;
		else if(this.tipo!=((CPlazaGaraje)inm).tipo) igual=false;
		
		return igual;
	}
	
	//toString
	public String toString() {
		
		String cadena="";
		
		cadena+=super.toString();
		cadena+="\nTipo de la plaza del garaje: ";
		
		if(this.tipo) cadena+="público";
		else cadena+="privado";
		return cadena;
	}
}