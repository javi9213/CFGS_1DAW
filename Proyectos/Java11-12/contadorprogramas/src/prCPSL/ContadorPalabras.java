package prCPSL;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;


public class ContadorPalabras {
	private List<PalabraEnTexto> palabras;
	protected static final int NUM_INICIAL = 10;
	
	public ContadorPalabras() {
		this(NUM_INICIAL);
	}
	
	public ContadorPalabras(int n) {
		palabras = new ArrayList<PalabraEnTexto>(n);
	}
	
	private int esta(String pal) {
		return palabras.indexOf(new PalabraEnTexto(pal));
	}
	
	public void incluye(String pal) {
		int i = esta(pal);
		if (i == -1) {
			palabras.add(new PalabraEnTexto(pal));
		} else {
			// ya estaba
			palabras.get(i).incrementa();
		}
	}
	
	public void incluyeTodas(String linea, String del) {
		StringTokenizer st = new StringTokenizer(linea, del);
		while(st.hasMoreTokens()) {
			incluye(st.nextToken());
		}
	}
	
	public void incluyeTodas(String [] texto, String del) {
		for(String linea : texto) {
			incluyeTodas(linea, del);
		}
	}
	
	public PalabraEnTexto encuentra(String pal) {
		int i = esta(pal);
		if (i == -1) {
			throw new NoSuchElementException("La palabra " + pal + " no se encuentra");
		} 
		// Esta
		return palabras.get(i);
	}
	
	
	public String toString() {
		StringBuilder salida = new StringBuilder();
		salida.append(palabras);
		return salida.toString();
	}
	
	
	
	
}
