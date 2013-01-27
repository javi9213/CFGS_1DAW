package alquiler;

public class coche extends vehículo {
	
	private double preciocoche;
	
	public coche(){
		super.matricula = 0;
		super.precio = 50.0;
		preciocoche = 1.50;
	}
	
	public double getPreciocoche(){
		return preciocoche;
	}
	
	public void setPreciocoche(int precoche){
		this.preciocoche = precoche;
	}
	
	public double valorcoche(int plaza, int dia){
		double resultado = 0.0, numplaza = 0.0, numdia = 0.0;
		numplaza = preciocoche * plaza;
		numdia = preciocoche * dia;
		resultado = precio + numplaza + numdia;
		return resultado;
	}
	
	/*Pongo preciocoche como una variable privada de la clase para así poder cambiar
	 * su valor sin mucha dificultad*/
	
	/**Pongo las variables protected de vehiculo suponiendo (porque no estoy seguro) de que en las
	 * herencias no se heredan los constructores */
}
