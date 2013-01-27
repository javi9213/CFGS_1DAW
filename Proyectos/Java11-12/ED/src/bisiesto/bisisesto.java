package bisiesto;
public class bisisesto {
	    int ano = 1999;
	    
	    public void calcular(int ano){
	       if ((( ano % 4 == 0 ) && ( ano % 100 != 0 )) || ( ano % 400 == 0 ))
	        
	            System.out.println("Es bisiesto");
	        else 
	            System.out.println("No es bisiesto");
	 }        
}