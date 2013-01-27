package Componentes;

public abstract class Periferico {

	protected String tipoDeConexion;
	protected double velocidadDeConexion;
	protected String puertoDeConexion;
	
	public Periferico(){}
	
	public Periferico(String tipocon, double velcon, String puertcon){
		tipoDeConexion = tipocon;
		velocidadDeConexion = velcon;
		puertoDeConexion = puertcon;
	}
	
	public String getTipo() {
		return tipoDeConexion;
	}
	
	public void setTipo(String tipo) {
		this.tipoDeConexion = tipo;
	}
	
	public double getVelocidad() {
		return velocidadDeConexion;
	}
	
	public void setVelocidad(double velocidad) {
		this.velocidadDeConexion = velocidad;
	}
	
	public String getPuerto() {
		return puertoDeConexion;
	}
	
	public void setPuerto(String puerto) {
		this.puertoDeConexion = puerto;
	}
	
	public String toString(){
		String cadena = null;
		cadena += "El tipo de conexión es "+getTipo()+"/nLa velocidad de conexión es de "+getVelocidad()+"/nEl puerto de conexión es "+getPuerto();
		return cadena;
	}
}