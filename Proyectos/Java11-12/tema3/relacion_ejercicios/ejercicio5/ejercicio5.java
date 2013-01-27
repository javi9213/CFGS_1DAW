package ejercicio5;

public class ejercicio5 {
	
	private boolean primo;

	public void primos(int valor) {
		for(int i=2;i<valor;i+=1){ 
			primo=true;
	    for(int j=2;j<i/2;j+=1){ 
	    	if(i%j==0){ 
	    		primo=false;  
	    	}
	    } 
	    if(primo){  
	    	if(i==4){

	        }else{ 
	           System.out.print(i + "  "); 
	        }
	    } 
		}
	}
}