package Ejercicio3;

public class palabra {
	
	//Atributos
	public String palabra="A";
	private String palabraAux;
	

	
	//Constructor
	public palabra( int numLetra){
		int i=0;
		char letra;
		char letraUltimo =1;
		
		
		while(i<numLetra-1){
			letra=(char)(Math.random()*82+66);
			
			//para que no se repite mucho el mismo vocal.Es posible que se  repita el 2 y el 'ultimo vocal.
				if(i==1){
					letraUltimo=letra;
				}
				else{
					while(letraUltimo==letra){
						letra=(char)(Math.random()*82+66);
					}
				}
			
			if(letra=='E' || letra=='O' || letra=='U' || letra=='I' ){
				
				palabraAux=palabraAux.valueOf(letra);
				palabra=palabra.concat(palabraAux);
				letraUltimo=letra;
				i++;
			}
			
		}
		
		
	}
	

}
