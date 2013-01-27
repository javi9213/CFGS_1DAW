package Componentes;

public final class Teclado extends Periferico {

	private int numeroDeTeclas;
	private String tipoTeclado;
	
	public Teclado(){}

	public Teclado(String tipocon, double velcon, String puertcon, int numtecla, String tipotecl){
		super(tipocon, velcon, puertcon);
		numeroDeTeclas = numtecla;
		tipoTeclado = tipotecl;
	}

	public int getNumTeclas() {
		return numeroDeTeclas;
	}

	public void setNumTeclas(int numTeclas) {
		this.numeroDeTeclas = numTeclas;
	}

	public String getTipoTeclado() {
		return tipoTeclado;
	}

	public void setTipoTeclado(String tipo) {
		this.tipoTeclado = tipo;
	}

	public String toString(String cadena){
		cadena = null;
		super.toString();
		cadena = "/nEl número de teclas es "+getNumTeclas()+"/nEl tipo de teclado es "+getTipoTeclado();
		return cadena;
	}
}