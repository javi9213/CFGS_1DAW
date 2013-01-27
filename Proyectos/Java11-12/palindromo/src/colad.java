public class colad {
	
	private class CElemento{
		private char dato;
		private CElemento siguiente;
		
		public CElemento(char d){
			this.dato=d;
			siguiente=null;
		}
	}
	
	private int numElem;
	private CElemento cola;
	
	public colad(){
		numElem = 0;
		cola = null;
	}
	
	public int size(){
		return numElem;
	}
	
	public void push(char c){		//anadir
		CElemento nuevo = new CElemento(c);
		if(!colaVacia()){
			nuevo.siguiente = cola.siguiente;
			cola.siguiente = nuevo;
		}else{
			cola = nuevo;
			cola.siguiente = nuevo;
		}
		cola = cola.siguiente;
		numElem++;
	}
	
	public char pop(){				//obtener
		CElemento aux = cola.siguiente;
		char ch = aux.dato;

		if(colaVacia()){
			System.out.println("Lista vacia");
		}else{
			if(aux == cola){
				cola = null;
			}else{
				cola.siguiente = aux.siguiente;
			}
		}
		numElem--;
		
		return ch;
	}
	
	public boolean colaVacia(){
		return (numElem == 0);
	}
	
	public String toString(char ch){
		String cadena = "";
		cadena += String.valueOf(ch);
		return cadena;
	}
}