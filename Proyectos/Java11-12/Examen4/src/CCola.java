public class CCola {
	
	private int numCola;
	private CLista lis;
	
	public CCola(){
		numCola = 0;
		lis = new CLista();
	}
	
	public String pop(){
		String cadena = "";
		if(!isColaVacia()){
			cadena += lis.sacarListaF();
		}
		numCola--;
		return cadena;	
	}
	
	public void push(CProceso otro){
		lis.insertarPrincipio(otro);
		numCola++;
	}
	
	public boolean isColaVacia(){
		return (numCola == 0);
	}
	
	public String toString(){
		String cadena = "";
		cadena += pop();
		return cadena;
	}
}