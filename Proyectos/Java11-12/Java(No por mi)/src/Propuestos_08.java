public class Propuestos_08{						// Realiza un programa que genere letras aleatoriamente 
												// y determine si son vocales o consonantes.
	public static void main(String[] args){

		char c;
		int i;
		
		for(i=0;i<5;i++){
			c = (char)(Math.random() * 26 + 'a');			
			System.out.print(c + ": ");							
			switch(c){
				case 'a':
				case 'e':	
				case 'i':
				case 'o':	
				case 'u':
					System.out.println("Vocal");
					break;
				default:										
					System.out.println("Consonante");
			}
		}
	}
}