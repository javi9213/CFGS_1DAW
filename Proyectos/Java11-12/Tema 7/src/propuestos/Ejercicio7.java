package propuestos;

public class Ejercicio7 {

	public int[] entrada(int[] array,int[] array1){
		
		int tamanio = array.length+array1.length;
		int[] solucion = new int [tamanio];
		int aux, j;
		
		for(int i=0;i<array.length;i++){
			solucion[i]=array[i];
		}
		
		for(int k=array.length+1;k<tamanio;k++){
			solucion[k]=array1[k];
		}
		
		for(int i = 1; i < solucion.length; i++){
			aux=solucion[i];
			for(j = i-1; ((j >= 0) && (aux < solucion[j])); j--){
				solucion[j+1]=solucion[j];
			}
			solucion[j+1]=aux;
		}
		
		return solucion;
	}
}