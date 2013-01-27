package ejercicior;

public class ejercicio6r {

	private static String[] lista;
	final static int POS=10;
	public static void ordena(String array[]){
		String aux = new String();
		for(int i=array.length;i>0;i--){
			for(int j=0;j<i-1;j++){
				if(array[j].compareTo(array[j+1])>0){
					aux=array[j+1];
					array[j+1] = array[j];
					array[j]=aux;
				}
			}
		}
	}
}