package alquiler;

public class camion extends vehículo {

	private double preciocamion;
	
	public camion(){
		super.matricula = 0;
		super.precio = 50.0;
		preciocamion = 40.0;
	}
	
	public double getPreciocamion() {
		return preciocamion;
	}

	public void setPreciocamion(double preciocamion) {
		this.preciocamion = preciocamion;
	}

	public double valorcamion(){
		double resultado = 0.0;
		resultado = precio + preciocamion;
		return resultado;
	}
	
	/*Pongo la variable privada preciocamion para que en un futuro se pueda camniar el valor de la variable fácilmente*/
	
	/**Pongo las variables protected de vehiculo suponiendo (porque no estoy seguro) de que en las
	 * herencias no se heredan los constructores */
}