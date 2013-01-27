package ejercicio8;

public class cuadrado{

	private int lado;
	public void setLado(int lado){
		this.lado = lado;
	}
	
	/** Método para dibujar un cuadrado de asteriscos
	 *  teniendo la posibilidad de que sea con o sin
	 *  relleno*/
	public void DibujarCuadrado(){
	          for(int aux = 0; aux < lado; aux++){
	               if(aux == 0 || aux == (lado-1)){
	                    for(int aux2 = 0; aux2 < lado; aux2++){
	                         System.out.print(" *");
	                    }
	               }else{
	                    for(int aux2 = 0; aux2 < lado; aux2++){
	                         if(aux2 == 0 || aux2 == (lado - 1)) {
	                              System.out.print(" *");
	                         }else{
	                              System.out.print(" *"); //Si queremos el cuadrado vacio solo con lines borramos el * y agregamos un espacio
	                         }
	                    }
	               }
	          System.out.println();
	          }
	     }
	}