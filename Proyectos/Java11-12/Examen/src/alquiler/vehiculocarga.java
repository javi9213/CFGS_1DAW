package alquiler;

public class vehiculocarga extends vehículo {
	
	public vehiculocarga(){
		super.matricula = 0;
		super.precio = 50.0;
	}

	public double valorvehiculocarga(int pma){
		double resultado = 0.0;
		resultado = (precio + 20) * pma;
		return resultado;
	}
	
	/**Pongo las variables protected de vehiculo suponiendo (porque no estoy seguro) de que en las
	 * herencias no se heredan los constructores */
}