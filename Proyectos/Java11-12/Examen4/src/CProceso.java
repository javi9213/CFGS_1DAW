public class CProceso {

	private int cod_identificador;
	private String nombre;
	private long tiempo;
	
	public CProceso(int cod, String nom, long temp){
		cod_identificador = cod;
		nombre = nom;
		tiempo = temp;
	}
	
	public int getCod_identificador() {
		return cod_identificador;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public long getTiempo() {
		return tiempo;
	}
	
	public String toString(){
		String cadena = "";
		cadena += "Codigo:"+getCod_identificador()+"  Nombre:"+getNombre()+"  Tiempo:"+getTiempo();
		return cadena;
	}
}