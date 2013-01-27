public class CHotel {

	//Atributos
	private final int NUMMAX = 300;
	private CHabitacion[] habitaciones = new CHabitacion [NUMMAX];
	private int indice;

	//Constructor vacio
	public CHotel(){
		indice = 0;
	}
	
	//Getters and setters
	public CHabitacion[] getHabitaciones() {
		return habitaciones;
	}

	public void setHabitaciones(CHabitacion[] habitacion) {
		this.habitaciones = habitacion;
	}
	
	public int getIndice(){
		return indice;
	}
	
	public void setIndice(int ind){
		this.indice = ind;
	}
	
	public final int getNUMMAX(){
		return NUMMAX;
	}
	
	//Metodo para anadir habitacion
	public void aniadirhabitacion(CHabitacion hab){
		habitaciones[indice] = hab;
		indice++;
	}
	
	//Metodo para mostrar toda la informacion
	@SuppressWarnings("null")
	public void mostrar(CHabitacion hab){
		CHabitacion habit = null;
		habit.toString();
		hab.precio();
	}
	
	//Metodo para devolver los metros cuadrados de la suite nupcial
	public double metrosnupcial(CSuitenupcial boda){
		return boda.getSuperficie();
	}
	
	//Metodo para mostrar los aseos
	public void mostraraseos(CSuite suit){
		if(suit.getNumaseos() > 1){
			
		}
	}

	
	
	
}