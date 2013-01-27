public class Habitacion{
	
	private int numero;
	private double superficie;
	private int numcamas;
	private double preciom2;
	private boolean vistasexteriores;
	
	
	public Habitacion(int num, double sup, int ncam, double prem2, boolean vext){
		this.setNumero(num);
		this.setSuperficie(sup);
		this.setNumcamas(ncam);
		this.setPrecioM2(prem2);
		this.setVistasexteriores(vext);
	}

	public int getNumero(){
		return numero;
	}

	public void setNumero(int numero){
		this.numero = numero;
	}

	public double getSuperficie(){
		return superficie;
	}

	public void setSuperficie(double superficie){
		this.superficie = superficie;
	}

	public int getNumcamas(){
		return this.numcamas;
	}

	public void setNumcamas(int numcamas){
		this.numcamas = numcamas;
	}

	public double getPrecioM2(){
		return preciom2;
	}

	public void setPrecioM2(double precio){
		this.preciom2 = precio;
	}

	public boolean isVistasexteriores(){
		return vistasexteriores;
	}

	public void setVistasexteriores(boolean vistasexteriores){
		this.vistasexteriores = vistasexteriores;
	}
	
	public double precio(){
		return this.getSuperficie() * this.getPrecioM2();
	}
	
	@Override
	public String toString(){	
		String cadena = "";
	
		cadena = "\n\nHabitacion [" + getNumero() + "]" 
				+ "\nSuperficie: " + getSuperficie() 
				+ "\nNumero de Camas: " + getNumcamas()
				+ (isVistasexteriores()? "\nCon Vistas Exteriores":"\nCon Vistas Interiores")
				+ "\nPrecio de la Habitacion: " + precio();
		
		return cadena;
	}
}