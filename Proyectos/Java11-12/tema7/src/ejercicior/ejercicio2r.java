package ejercicior;

public class ejercicio2r {

	private static int[] lista;
	final static int POS=50;
	final static int LIMITE=100;
	
	public static int getaleatorio(){
		return (int) (Math.random()*LIMITE+1);
	}
	
	public static void ordena(int array[]){
		int aux;
		for(int i=array.length;i>0;i--){
			for (int j=0;j<i-1;j++){
				if(array[j]>array[j+1]){
					aux = array[j+1];
					array[j+1]=array[j];
					array[j] = aux;
				}
			}
		}
	}
	
	public static void muestra(){
		for(int i=0;i<POS;i++){
			System.out.print(lista[i]+" ");
		}
	}
	
	public static void main (String[]args){
		lista = new int[POS];
		for(int i=0;i<POS;i++){
			lista[i]=getaleatorio();
		}
		muestra();
		System.out.println();
		ordena(lista);
		System.out.println();
		muestra();
		System.out.println();
	}
}