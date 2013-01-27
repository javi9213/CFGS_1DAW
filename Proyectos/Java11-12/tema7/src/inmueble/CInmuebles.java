package inmueble;

public abstract class CInmuebles {
	
	//atributos privados
	private String ubic;
	private float mCuadr;
	
	//constructor
	public CInmuebles(String ubicacion, float mCuadrado){
		
		this.ubic=ubicacion;
		this.mCuadr=mCuadrado;
		
	}
	
	//getters y setters
	public String getUbic() {
		return ubic;
	}

	public void setUbic(String ubic) {
		this.ubic = ubic;
	}

	public float getmCuadr() {
		return mCuadr;
	}

	public void setmCuadr(float mCuadr) {
		this.mCuadr = mCuadr;
	}

	//equals()
	public abstract boolean equals(Object inm);
	
	//toString
	public String toString() {
		
		String cadena="";
		
		cadena+="\nUbicación: "+this.ubic+"\nMetros cuadrados: "+this.mCuadr;
		
		return cadena;
	}
	
	public void muestra(){
		System.out.printf("%s",this.toString());
	}
}