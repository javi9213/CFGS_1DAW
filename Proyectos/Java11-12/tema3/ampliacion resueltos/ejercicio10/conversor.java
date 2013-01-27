package ejercicio10;

public class conversor {

	//atributos privados
	private int numDec;
	private int opcion;
	
	//constuctor
	public conversor(){
		numDec=0;
		opcion=0;
	}
	
	//metodos
	
	//metodo para cambiar los valores
	public void setDatos(int num, int opc){
		if(num>0 && opc>0 && opc<4){
			numDec=num;
			opcion=opc;
		}else{
			numDec=1;
			opcion=1;
		}
	}
	
	//metodo para convertir el numero a binario
	public String Conversor(){
		//atributos locales
		String binario = (" ");
		String auxBinario=(" ");
		String Binario=("");
		int digitos, numDig=0;
		int aux, i, base=0;
		char digCar='a';
		
		//asignar la base, en funcion de la opción elegida
		if(opcion==1)base=2;
		if(opcion==2)base=8;
		if(opcion==3)base=16;
		
		aux=numDec;
		
		//meter los digitos en un string
		while(aux>0){
			digitos=aux%base;
			
			//en caso de la converción a hexadecimal
			if(base==16 && digitos>=10 && digitos<=15){
			
					for(i=0; i<5; i++){
						if(digitos==(10+i))digitos=65+i;
					}
				
				digCar=(char) digitos;
				auxBinario=auxBinario.valueOf(digCar);
			}
			
			else auxBinario=auxBinario.valueOf(digitos);
			
			binario=binario.concat(auxBinario);
			
			aux/=base;
		}
		
		numDig=(binario.length())-1;
		
		//se intercambian los valores y posiciones de una cadena con otra
		for(i=0; i<numDig; i++){
		
		auxBinario=auxBinario.valueOf(binario.charAt(numDig-i));
		 Binario=Binario.concat(auxBinario);
			
		}
		return Binario;
	}
}