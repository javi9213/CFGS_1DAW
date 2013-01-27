package alquiler;

public class microbus extends vehículo {
	
	private double preciomicrobus;
	
	public microbus(){
		super.matricula = 0;
		super.precio = 50.0;
		preciomicrobus = 2;
	}
	
	public double getPreciomicrobus() {
		return preciomicrobus;
	}

	public void setPreciomicrobus(double preciomicrobus) {
		this.preciomicrobus = preciomicrobus;
	}

	public double valormicrobus(int plaza){
		double resultado = 0.0, numplaza = 0.0;
		numplaza = plaza * preciomicrobus;
		resultado = precio * numplaza;
		return resultado;
	}
	/*Pongo preciobus como una variable privada de la clase para poder cambiarla con toda facilidad
	 * por si en un futuro hay que cambiar ese valor*/
	
	/**Pongo las variables protected de vehiculo suponiendo (porque no estoy seguro) de que en las
	 * herencias no se heredan los constructores */
}