package prCPSL;

public class PalabraEnTexto {
	private String palabra;
	private int veces;
	
	public PalabraEnTexto(String p) {
		palabra = p.toUpperCase();
		veces = 1;
	}
	
	public boolean equals(Object o) {
		return o instanceof PalabraEnTexto && 
			((PalabraEnTexto)o).palabra.equalsIgnoreCase(palabra);
	}
	
	public int hashCode() {
		return palabra.toUpperCase().hashCode();
	}

	public String toString() {
		return palabra + ": " + veces;
	}
	
	public void incrementa() {
		veces++;
	}
}
