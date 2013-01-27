public class CLista {

	public class CElemento{
		private CElemento siguiente;
		private CProceso dato;
		
		public CElemento(){
			siguiente = null;
			dato = null;
		}
		
		public CElemento(CProceso otro){
			dato = otro;
			siguiente = null;
		}
	}
	
	private CElemento ultimo;
	private int numElem;
	
	public CLista(){
		ultimo = null;
		numElem = 0;
	}
	
	public void insertarPrincipio(CProceso proc){
		CElemento nuevo = new CElemento(proc);
		
		if(!isListaVacia()){
			ultimo.siguiente = nuevo;
			nuevo.siguiente = ultimo;
			ultimo = nuevo;
		}else{
			ultimo = nuevo;
		}
		numElem++;
	}
	
	public String sacarListaF(){
		if(!isListaVacia()){
			//ultimo = ultimo.siguiente;
			ultimo.siguiente = null;
		}
		return ultimo.dato.toString();
	}
	
	public String obtener(int pos){
		CElemento aux;
		aux = ultimo;
		if(!isListaVacia()){
			while((aux.siguiente != null)&&(pos<size())){
				aux = aux.siguiente;
			}
		}
		return aux.dato.toString();
	}
	
	public boolean sacarPosicion(int pos){
		boolean sacar = true;
		CElemento aux;
		aux = ultimo;
		if(!isListaVacia()){
			while((aux.siguiente != null)&&(pos<size())){
				aux = aux.siguiente;
			}
			ultimo.siguiente = aux.siguiente;
			aux.siguiente = null;
		}else{
			sacar = false;
		}
		return sacar;
	}
	
	public int size(){
		return numElem;
	}
	
	public boolean isListaVacia(){
		return (numElem == 0);
	}
	
	public String toString(){
		String cadena = "";
		cadena += sacarListaF();
		return cadena;
	}
}