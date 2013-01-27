package prCPSM;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;

public class ContadorPalabras {
	private Map<String, Integer> palabras;
	protected static final int NUM_INICIAL = 10;
	
	public ContadorPalabras() {
		this(NUM_INICIAL);
	}
	
	public ContadorPalabras(int n) {
		palabras = new HashMap<String, Integer>(n);
	}
		
	public void incluye(String pal) {
		String palM = pal.toUpperCase();
		if (!palabras.containsKey(palM)) {
			palabras.put(palM, 1);
		} else {
			// ya estaba
			int i = palabras.get(palM);
			palabras.put(palM, i + 1);
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
	
	public int encuentra(String pal) {
		if (!palabras.containsKey(pal.toUpperCase())) {
			throw new NoSuchElementException("La palabra " + pal + " no se encuentra");
		} 
		// Esta
		return palabras.get(pal.toUpperCase());
	}
	
	
	public String toString() {
		StringBuilder salida = new StringBuilder();
		salida.append(palabras);
		return salida.toString();
	}
	
}
