package listas_simplemente_enlazadas;

public class lista<T> {

	private class CElemento{
		private T dato;
		private CElemento siguiente;
		
		public CElemento(){
			siguiente = null;
		}
		
		public CElemento(T nuevodato){
			siguiente = null;
			dato = nuevodato;
		}
	}
	
	private CElemento lista;
	private int tamanio;
	
	public int getTamanio(){
		return tamanio;
	}
	
	public lista(){
		lista = null;
		tamanio = 0;
	}
	
	public void anadirPrincipio(T obj){
		CElemento nuevo = new CElemento(obj);
		nuevo.siguiente=lista;
		lista=nuevo;
		tamanio++;
	}
	
	public void anadirFinal(T obj){
		CElemento aux;
		CElemento nuevo = new CElemento(obj);
		if(lista == null){
			anadirPrincipio(obj);
		}else{
			aux=lista;
			while(aux.siguiente!=null)
				aux=aux.siguiente;
			aux.siguiente=nuevo;
			tamanio++;
		}
	}
	
	public void anadir(int i, T obj){
		if(tamanio==0){
			anadirPrincipio(obj);
		}else{
			CElemento elemAnt = lista, elemAct = lista;
		
			for(int j=0; j<i; j++){
				elemAnt=elemAct;
				elemAct=elemAct.siguiente;
			}
		
			if(elemAnt==elemAct){
				anadirPrincipio(obj);
			}else{
				anadirFinal(obj);
			}
		}
		tamanio++;
	}
	
	public boolean Buscar(T datobuscado){
		boolean res=false;
		CElemento aux=lista;
		if(aux!=null){
			while((aux.dato!=datobuscado)&&(aux.siguiente!=null)){
				aux=aux.siguiente;
			}
			if(aux.dato==datobuscado){
				res=true;
			}
		}
		return res;
	}
	
	public T Borrar(int i){
		
		CElemento elemAct = null, elemAnt = null;
		
		if(i <= tamanio || i>0){
			elemAct = lista;
			elemAnt = lista;
			
			for(int j=0; j<i; j++){
				elemAnt=elemAct;
				elemAct=elemAct.siguiente;
			}
			
			if(elemAct == lista){
				lista = lista.siguiente;
			}else{
				elemAnt.siguiente=elemAct.siguiente;
			}
		}
		tamanio--;
		
		return elemAct.dato;
	}
	
	public T obtener(int i){
		
		CElemento nuevo = new CElemento();
		
		if(i <= tamanio || i>0){
			nuevo = lista;
			
			for(int j = 0; j<i; j++){
				if(nuevo.siguiente!=null)
					nuevo = nuevo.siguiente;
			}
			
		}
		return nuevo.dato;
	}
	
	public T obtenerPrimero(){
		return obtener(0);
	}
	
	public T obtenerUltimo(){
		return obtener(tamanio-1);
	}
	
	public void Recorrer(){
		CElemento aux = lista;
		while(aux!=null){
			//aux.dato para modificarlo como quisiéramos
			aux=aux.siguiente;
		}
	}
	
	public void BorrarTodo(){
		CElemento aux;
		while(lista!=null){
			aux=lista;
			lista=lista.siguiente;
			aux.siguiente=null;
		}
		tamanio = 0;
	}
}