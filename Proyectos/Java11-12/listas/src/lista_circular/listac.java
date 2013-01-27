package lista_circular;

public class listac<T> {

	private class CElemento {
		private T dato;
		private CElemento siguiente;

		@SuppressWarnings("unused")
		public CElemento() {
		}

		public CElemento(T d, CElemento s) {
			dato = d;
			siguiente = s;
		}
	}

	private CElemento ultimo = null;
	private int tamanio;

	public listac() {
		tamanio = 0;
	}

	public int tamanio() {
		return tamanio;
	}

	public void addFirst(T dato) {
		CElemento nuevo = new CElemento(dato, null);
		if (ultimo != null) {
			nuevo.siguiente = ultimo.siguiente;
			ultimo.siguiente = nuevo;
		} else {
			ultimo = nuevo;
			ultimo.siguiente = nuevo;
		}
		tamanio++;
	}

	public void addLast(T dato) {
		addFirst(dato);
		ultimo = ultimo.siguiente;
	}

	public T borrar() {
		CElemento q = ultimo.siguiente;
		T obj = q.dato;

		if (ultimo == null) {
			System.out.println("Lista vacia");
		} else {
			if (q == ultimo) {
				ultimo = null;
			} else {
				ultimo.siguiente = q.siguiente;
			}
		}
		tamanio--;

		return obj;
	}

	public T obtener(int i) {

		CElemento aux = ultimo.siguiente;
		T ret = null;
		if (i <= tamanio() || i > 0) {
			for (int j = 0; j < i; j++) {
				aux = aux.siguiente;
			}
			ret = aux.dato;
		}
		return ret;
	}

	public void add(T dato, int i) {
		if (ultimo != null) {

		}
	}

	public String toString() {
		String cadena = "";
		CElemento aux = ultimo.siguiente;
		for (int i = 0; i < tamanio(); i++) {
			cadena += aux.dato.toString() + " \n";
			aux = aux.siguiente;
		}
		return cadena;
	}
}