package inmueble;

public abstract class CViviendas extends CConstrucciones{
	
	//atributos privados
	private float precio;
	private int  numHab;
	private int piso;
	
	//constructor
	public CViviendas(String ubicacion, float mCuadrado, boolean tipoConstr, float precioConstr, int nHab, int nPiso){
		
		super(ubicacion, mCuadrado, tipoConstr);
		this.precio=precioConstr;
		this.numHab=nHab;
		this.piso=nPiso;
	}
	
	//getters y setters
	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public int getNumHab() {
		return numHab;
	}

	public void setNumHab(int numHab) {
		this.numHab = numHab;
	}

	public int getPiso() {
		return piso;
	}

	public void setPiso(int piso) {
		this.piso = piso;
	}

	//equals()
	public  boolean equals(Object inm){
		
		boolean igual=true;
		
		if(this.getUbic().compareToIgnoreCase(((CViviendas)inm).getUbic())!=0) igual=false;
		else if (this.getmCuadr()!=((CViviendas)inm).getmCuadr()) igual=false;
		else if (this.isTipo()!=((CViviendas)inm).isTipo()) igual=false;
		else if(this.precio != ((CViviendas)inm).precio) igual=false;
		else if(this.numHab != ((CViviendas)inm).numHab) igual=false;
		else if(this.piso != ((CViviendas)inm).piso) igual=false;
		
		return igual;
	}
	
	//toString
		public String toString() {
		
		String cadena="";
		
		cadena+=super.toString();
		cadena+="\nPrecio de la vivienda: "+this.precio;
		cadena+="\nNúmero de habitaciones de la vivienda: "+this.numHab;
		cadena+="\nNúmero del piso: "+this.piso;
		return cadena;
	}
}