package Quicksort;

public class quicksorts {

    /*Regresa un arreglo ordenado
     por medio del algoritmo quicksort*/
	
    public int[] quicksort(int numeros[]){
        return quicksort(numeros,0,numeros.length-1);
    }
    
    public int[] quicksort(int numeros[],int izq,int der){
        if(izq>=der)
            return numeros;
        int i=izq,d=der;
        if(izq!=der){
        	int pivote;
        	int aux;
        	pivote = izq;
        	while(izq!=der){
        		imprimeArreglo(numeros);
        		while(numeros[der]>=numeros[pivote] && izq<der)
        			der--;
        		while(numeros[izq]<numeros[pivote] && izq<der)
        			izq++;
           
        		if(der!=izq){
        			aux = numeros[der];
        			numeros[der]= numeros[izq];
        			numeros[izq]=aux;
        		}
        	}
        	if(izq==der){
        		quicksort(numeros,i,izq-1);
        		quicksort(numeros,izq+1,d);
        	}
        }else
            return numeros;
       return numeros;
    }

    public void imprimeArreglo(int arreglo[]){
        String imp="";
        int i;
        for(i=0;i<arreglo.length;i++){
            if(i!=arreglo.length-1)
            	imp=imp+arreglo[i]+",";
            else
                imp=imp+arreglo[i]+"";
        }
        System.out.println(imp);
    }
    
    public static void main (String[]args){
    	
    	quicksorts quick = new quicksorts();
    	
    	int array[] = {3,4,6,8,7,9,5};
    	quick.imprimeArreglo(quick.quicksort(array));
    }
}