package ejercicior;

public class ejercicio3r {

	private static int[] lista;
	final static int POS=50;
	final static int LIMITE=100;
	public static int getaleatorio(){
		return (int) (Math.random()*LIMITE);
	}
	
	public static void ordenacocktail(int array[]){
		int i=0, j = array.length-1;
		while(i<j){
			for(int k = i;k<j;k++){
				if(array[k]>array[k+1]){
					int temp = array[k];
					array[k] = array[k+1];
					array[k+1] = temp;
				}
			}
			j--;
			for(int k = j;k>i;k--){
				if(array[k]>array[k-1]){
					int temp = array[k];
					array[k] = array[k-1];
					array[k-1] = temp;
				}
			}
			i++;
		}
	}
	
	public static void muestra(){
		for(int i=0;i<POS;i++){
			System.out.print(lista[i]+" ");
		}
	}
	
	public static void main(String[]args){
		lista = new int[POS];
		for(int i=0;i<POS;i++){
			lista[i]=getaleatorio();
		}
		muestra();
		System.out.println();
		ordenacocktail(lista);
		System.out.println();
		muestra();
		System.out.println();
	}
}