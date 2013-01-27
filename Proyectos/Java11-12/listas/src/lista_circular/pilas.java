package lista_circular;

@SuppressWarnings("rawtypes")
public class pilas<T>{
	
	listac<T> pila;
	
	@SuppressWarnings("unchecked")
	public pilas(){
		pila = new listac();
	}
	
	public int size(){
		return pila.tamanio();
	}
	
	public void push(T dato){				//añadir
		pila.addFirst(dato);
	}
	
	public T pop(){							//obtener
		return pila.borrar();
	}
	
	public boolean pilaVacia(){
		return (pila.tamanio() == 0);
	}
	
	public boolean pilaLlena(){
		return false;
	}
}