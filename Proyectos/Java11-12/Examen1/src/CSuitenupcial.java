public class CSuitenupcial extends CSuite {

	//Atributos
	private boolean celebra;
	
	//Constructor vacio
	public CSuitenupcial(){
		super();
		celebra = true;
	}
	
	//Constructor con parametros
	public CSuitenupcial(int cod, double superf, int camas, double precio, int aseos, boolean celebracion){
		super(cod, superf, camas, precio, aseos, true);
		celebra = celebracion;
	}

	//Getters and setters
	public boolean isCelebra() {
		return celebra;
	}

	public void setCelebra(boolean celeb) {
		this.celebra = celeb;
	}
	
	//Metodo toString()
	public String toString(){
		String cadena = "";
		super.toString();
		cadena += "Celebra su boda:";
		
		if(isCelebra() == true){
			cadena += "Si\n";
		}else{
			cadena += "No\n";
		}
		
		return cadena;
	}
	
	//Metodo precio
	public double precio(){
		
		double precio = 0.0;
		
		if(isCelebra() == true){
			precio = (getPrecionoche() * getSuperficie())/4;
		}else{
			precio = getPrecionoche() * getSuperficie();
		}
		return precio;
	}
}