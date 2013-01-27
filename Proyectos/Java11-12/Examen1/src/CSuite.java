public abstract class CSuite extends CHabitacion {
	
	//Atributos
	private int numaseos;
	private boolean jacuzzi;
	
	//Constructor vacio
	public CSuite(){
		super();
		numaseos = 0;
		jacuzzi = true;
	}
	
	//Constructor con parametros
	public CSuite(int cod, double superf, int camas, double precio, int aseos, boolean jacusi){
		super(cod, superf, camas, precio, true);
		numaseos = aseos;
		jacuzzi = jacusi;
	}

	//Getters and setters
	public int getNumaseos() {
		return numaseos;
	}

	public void setNumaseos(int aseos) {
		this.numaseos = aseos;
	}

	public boolean isJacuzzi() {
		return jacuzzi;
	}

	public void setJacuzzi(boolean jacuzi) {
		this.jacuzzi = jacuzi;
	}
	
	//Metodo toString() heredado de la clase padre (abstract CHabitacion.java)
	public String toString(){
		String cadena = "";
		cadena += "Numero: "+getCodigo();
		cadena += "\nSuperficie: "+getSuperficie();
		cadena += "\nNumero de camas: "+getNumcamas();
		cadena += "\nPrecio Noche: "+getPrecionoche();
		cadena += "\nVista Exterior: ";
		
		if(isVistaext() == true){
			cadena += "Si";
		}else{
			cadena += "No";
		}
		
		cadena += "\nNumero Aseos: "+getNumaseos();
		cadena += "\nJacuzzi: ";
		
		if(isJacuzzi() == true){
			cadena += "Si\n";
		}else{
			cadena += "No\n";
		}
		
		return cadena;
	}
	
	//Metodo precio() heredado de la clase padre (abstract CHabitacion.java)
	//donde mostrara el precio por noche de la habitacion
	public double precio(){
		double precio;
		precio = getPrecionoche() * getSuperficie();
		return precio;
	}
}