public class pilad {

	private class CElemento{
		private char dato;
		private CElemento siguiente;
		
		public CElemento(char d){
			this.dato=d;
			siguiente=null;
		}
	}
	
	private int numElem;
	private CElemento pila;
	
	public pilad(){
		numElem = 0;
		pila = null;
	}
	
	public int size(){
		return numElem;
	}
	
	public void push(char ch){		//anadir
		CElemento nuevo = new CElemento(ch);
		if (!pilaVacia()) {
			nuevo.siguiente = pila.siguiente;
			pila.siguiente = nuevo;
		}else{
			pila = nuevo;
			pila.siguiente = nuevo;
		}
		numElem++;
	}
	
	public char pop(){				//obtener
		CElemento nuevo = pila.siguiente;
		char ch = nuevo.dato;

		if(pilaVacia()){
			System.out.println("Pila vacia");
		}else{
			if(nuevo == pila){
				pila = null;
			}else{
				pila.siguiente = nuevo.siguiente;
			}
		}
		numElem--;

		return ch;
	}
	
	public boolean pilaVacia(){
		return (numElem == 0);
	}
	
	public String toString(char ch){
		String cadena = "";
		cadena += String.valueOf(ch);
		return cadena;
	}
}