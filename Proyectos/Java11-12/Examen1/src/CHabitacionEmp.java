public class CHabitacionEmp extends CHabitacion {

	//Atributos
	private boolean mesareunion;
	
	//Constructor vacio
	public CHabitacionEmp(){
		super();
		mesareunion = true;
	}
	
	//Constructor con parametros
	public CHabitacionEmp(int cod, double superf, int camas, double precio, boolean mesa){
		super(cod, superf, camas, precio, false);
		mesareunion = mesa;
	}

	//Getters and setters
	public boolean isMesareunion() {
		return mesareunion;
	}

	public void setMesareunion(boolean mesareunion) {
		this.mesareunion = mesareunion;
	}

	//Metodo toString() heredado de la clase padre (abstract CHabitacion.java)
	public String toString() {
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
		
		cadena += "\nMesa Reunion: ";
		
		if(isMesareunion() == true){
			cadena += "Si\n";
		}else{
			cadena += "No\n";
		}
		return cadena;
	}

	//Metodo precio() heredado de la clase padre (abstract CHabitacion.java)
	public double precio() {
		double precio;
		precio = getPrecionoche() * getSuperficie();
		return precio;
	}
}