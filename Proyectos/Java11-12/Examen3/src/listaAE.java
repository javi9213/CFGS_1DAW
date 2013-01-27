public class listaAE {

	//Clase privada de CElemento para crear las listas
	private class CElemento{
		
		private CElemento anterior;
		private CPersona dato;
		
		@SuppressWarnings("unused")
		public CElemento(){}
		
		public CElemento(CPersona d, CElemento c){
			dato=d;
			anterior=c;
		}
	}
	
	//Atributos de lista
	private CElemento ultimo;
	private int tamanio;
	
	//Constructor vacio
	public listaAE(){}
	
	//Constructor con parametros
	public listaAE(CElemento u){
		ultimo=u;
	}
	
	//Metodo para devolver el tamanio de mi lista
	public int tamanio(){
		return tamanio;
	}
	
	//Metodo que anade una persona a la lista
	public void anadir(CPersona persona1){
		CElemento nuevo = new CElemento(persona1, null);
		if((ultimo!=null)&&(nuevo.dato.getEdad()>=ultimo.dato.getEdad())){
			ultimo.anterior=nuevo;
		}else{
			ultimo=nuevo;
		}
		tamanio++;
	}
	
	//Metodo que borra a una persona de la lista
	public CPersona borrar(long numtelf){
		CPersona persona2 = new CPersona(null, 0 ,numtelf);
		CElemento aborrar = new CElemento(persona2, null);
		CElemento aux;
		aux=ultimo;
		if(ultimo!=null){
			for(int i=0;((i<tamanio)&&(aux.anterior!=null));i++){
				if(aborrar.dato.getNumtelf()==ultimo.dato.getNumtelf()){
					ultimo=ultimo.anterior;
					aborrar.anterior=null;
				}
				aux=aux.anterior;
			}
		}else{
			System.out.println("No existe ningun contacto en la agenda");
		}
		tamanio--;
		return aborrar.dato;
	}
	
	//Metodo que nos devuelve a una persona de la lista
	public String obtener(String nom){
		CPersona persona3 = new CPersona(nom, 0, 0);
		CElemento obtener = new CElemento(persona3, null);
		CElemento aux;
		String contacto="";
		aux = ultimo;
		if(ultimo!=null){
			for(int i=0;((i<tamanio)&&(aux.anterior!=null));i++){
				if(aux.dato.getNombre().compareToIgnoreCase(obtener.dato.getNombre())!=0){
					contacto += obtener.dato.getNombre().toString();
				}else{
					System.out.println("No se ha encontrado esa persona");
				}
				aux=aux.anterior;
			}
		}else{
			System.out.println("No hay ningun contacto en la agenda");
		}
		return contacto;
	}

	//Metodo toString() para mostrar los contactos
	public String toString(){
		String cadena="";
		CElemento aux;
		aux=ultimo;
		for(int i=0;((i<tamanio)&&(aux.anterior!=null));i++){
			cadena += aux.dato.toString()+" ";
			aux=aux.anterior;
		}
		cadena += aux.dato.toString();
		return cadena;
	}
}