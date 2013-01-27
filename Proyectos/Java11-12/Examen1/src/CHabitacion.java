public class CHabitacion {
	
	//Atributos
	private int codigo;
	private double superficie;
	private int numcamas;
	private double precionoche;
	private boolean vistaext;
	
	//Constructor vacio
	public CHabitacion(){
		codigo = 0;
		superficie = 0.0;
		numcamas = 0;
		precionoche = 0.0;
		vistaext = true;
	}
	
	//Constructor con parametros
	public CHabitacion(int cod, double superf, int camas, double precio, boolean vista){
		codigo = cod;
		superficie = superf;
		numcamas = camas;
		precionoche = precio;
		vistaext = vista;
	}
	
	//getters and setters
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int cod) {
		this.codigo = cod;
	}

	public double getSuperficie() {
		return superficie;
	}

	public void setSuperficie(double superf) {
		this.superficie = superf;
	}

	public int getNumcamas() {
		return numcamas;
	}

	public void setNumcamas(int cama) {
		this.numcamas = cama;
	}

	public double getPrecionoche() {
		return precionoche;
	}

	public void setPrecionoche(double noche) {
		this.precionoche = noche;
	}

	public boolean isVistaext() {
		return vistaext;
	}

	public void setVistaext(boolean ext) {
		this.vistaext = ext;
	}
	
	//Metodo toString()
	public String toString(){
		String cadena = "";

		cadena += "Numero: "+getCodigo();
		cadena += "\nSuperficie: "+getSuperficie();
		cadena += "\nNumero de camas: "+getNumcamas();
		cadena += "\nPrecio Noche/Metro cuadrado: "+getPrecionoche();
		cadena += "\nVista Exterior: ";
		
		if(isVistaext() == true){
			cadena += "Si";
		}else{
			cadena += "No";
		}
		return cadena;
	}
	
	//Metodo precio()
	public double precio(){
		double precio;
		precio = getPrecionoche() * getSuperficie();
		return precio;
	}
	
}