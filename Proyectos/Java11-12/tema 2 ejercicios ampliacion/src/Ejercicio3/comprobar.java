package Ejercicio3;

public class comprobar {
	
	private palabra p;
	public int numCarac=0;
	public int puntos=0;
	
//	constructor
	public comprobar(int carac){
		p=new palabra(carac);
		numCarac=carac;
	}
	
	//metodos
	private boolean comparar(int j, String palabraCmp){
		int cmp;
		boolean acertado=false;
	
		 cmp=p.palabra.compareToIgnoreCase(palabraCmp);
		 if(cmp==0){
			 if(j==0){ puntos+=100;}
			 else if(j==1){ puntos+=80;}
			 else{puntos+=50;}
			 
			 System.out.printf("\nFelicidades, se ha acertado la palabra\nHas ganado %d puntos ", puntos);
			 acertado=true;
		 }
		 
		 return acertado;
	 }
	
	
	public void comprobar(){
		String palabraInt;
		int i=0;
		boolean accert;
		
		
		 for(i=0; i<3; i++){
			 
			 //si ha elegido la primera opcion
			 if(numCarac==2 && i==0){
				 System.out.printf("\nIntroduzca la palabra de %d vocales (empieza por 'A' o'a')\n", numCarac);
				 palabraInt = Leer.dato();
				accert=comparar(i, palabraInt);
				 if (accert==false){
						System.out.printf("\nLa palabra introducida no coincide.\nLa palabra clave era : %s \nHas ganado %d puntos ",p.palabra,puntos);
					 }
				i+=3;
			 }
	
			 //si ha elegido la segunda opcion tiene 2 oposrtunidades
			 if(numCarac==3){
				 System.out.printf("\nIntroduzca la palabra de %d vocales (empieza por 'A' o'a')\n", numCarac);
				 palabraInt = Leer.dato();
				 accert=comparar(i,palabraInt);
				 if(accert==true){
					i+=2;
				 } 
				 else{
					 if(i<3){System.out.printf("\nLa palabra introducida no coincide");}
					 i++;
					 if(i==3){
						 System.out.printf("\nLa palabra clave era : %s \nHas ganado %d puntos ",p.palabra,puntos);
					 }
				 }
			 }
			 
			 //se ha elegido la tercera opcion
			 if(numCarac==4){
				 System.out.printf("\nIntroduzca la palabra de %d vocales (empieza por 'A' o'a')\n", numCarac);
				 palabraInt = Leer.dato();
				 accert=comparar(i,palabraInt);
				 if(accert==true){
					i+=3;
				 }
				 else { 
					 System.out.printf("\nLa palabra introducida no coincide.");
					 if(i==2){
						 System.out.printf("\nLa palabra clave era : %s \nHas ganado %d puntos ",p.palabra,puntos);
					 }
				 }
			 }
			 
		 }
		 
	}
}
