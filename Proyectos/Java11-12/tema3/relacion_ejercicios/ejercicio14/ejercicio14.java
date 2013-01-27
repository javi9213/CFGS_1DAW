package ejercicio14;

public class ejercicio14 {

private int valor;
private int contador1;
private int contador2;
private int contador3;
private int contador4;
private int contador5;
private int contador6;
    
    public void tirar(int n){
    	for(int i=1;i<=n;i++){
        valor=1+(int)(Math.random()*6);
    
    		if(valor==1)
    			contador1++;
    		
    		if(valor==2)
    			contador2++;
 
    		if(valor==3)
    			contador3++;
    		
    		if(valor==4)
    			contador4++;
    		
    		if(valor==5)
    			contador5++;
    		
    		if(valor==6)
    			contador6++;
    	}
    	float porc1 = (float) (contador1*(100/n));
    	float porc2 = (float) (contador2*(100/n));
    	float porc3 = (float) (contador3*(100/n));
    	float porc4 = (float) (contador4*(100/n));
    	float porc5 = (float) (contador5*(100/n));
    	float porc6 = (float) (contador6*(100/n));
    	System.out.println("El número 1 ha salido en un porcentaje de "+porc1+"%");
    	System.out.println("El número 2 ha salido en un porcentaje de "+porc2+"%");
    	System.out.println("El número 3 ha salido en un porcentaje de "+porc3+"%");
    	System.out.println("El número 4 ha salido en un porcentaje de "+porc4+"%");
    	System.out.println("El número 5 ha salido en un porcentaje de "+porc5+"%");
    	System.out.println("El número 6 ha salido en un porcentaje de "+porc6+"%");
	}
    
    public void menu(){
    	System.out.println("Juego del Dado");
    	System.out.println("**************");
    	System.out.println("Opción 1: Jugar");
    	System.out.println("Opción 2: Salir");
    	System.out.print("Introduzca la opción deseada:");
    }
}