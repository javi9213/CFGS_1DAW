package prCPS;

import java.util.NoSuchElementException;
import java.util.StringTokenizer;


public class ContadorPalabras {
	private PalabraEnTexto [] palabras;
	private int numPalabras;
	protected static final int NUM_INICIAL = 10;
	
	public ContadorPalabras() {
		this(NUM_INICIAL);
	}
	
	public ContadorPalabras(int n) {
		palabras = new PalabraEnTexto[n];
		numPalabras = 0;
	}
	
	private int esta(String pal) {
		PalabraEnTexto pet = new PalabraEnTexto(pal);
		boolean encontrado = false;
		int pos = 0;
		while (pos < numPalabras && !encontrado) {
			if (palabras[pos].equals(pet)) {
				encontrado = true;
			} else {
				pos++;
			}
		}
		return encontrado ? pos: -1;
	}
	
	public void incluye(String pal) {
		int i = esta(pal);
		if (i == -1) {
			// hay que incluirla
			if (numPalabras == palabras.length) {
				// hay que agrandar
				PalabraEnTexto [] aux = new PalabraEnTexto[palabras.length*2];
				System.arraycopy(palabras, 0, aux, 0, numPalabras);
				palabras = aux;
			}
			//PD cabe
			palabras[numPalabras] = new PalabraEnTexto(pal);
			numPalabras++;
		} else {
			// ya estaba
			palabras[i].incrementa();
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
		return palabras[i];
	}
	
	
	
	
	public String toString() {
		StringBuilder salida = new StringBuilder("[");
		for(int i = 0 ; i < numPalabras; i++) {
			salida.append(palabras[i]);
			if (i != numPalabras - 1) {
				salida.append(", ");
			}
		}
		return salida.toString();
	}
	
	
	
	
}
