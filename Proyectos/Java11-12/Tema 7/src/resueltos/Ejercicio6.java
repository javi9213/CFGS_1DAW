package resueltos;

public class Ejercicio6 {

	private static String[] lista;
	final static int POS=10;
	public static void ordena(String array[]){
		String aux = new String();
		for (int i=array.length;i>0;i--){
			for(int j=0;j<i-1;j++){
				if(array[j].compareTo(array[j+1])>0){
					aux = array[j+1];
					array[j+1] = array[j];
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
	
	public static void main(String[] args) {
		lista = new String[POS];
		for(int i=0;i<POS;i++){
			String ln="";
			lista[i]=ln.toString();
		}
		muestra();
		System.out.println();
		ordena(lista);
		System.out.println();
		muestra();
		System.out.println();
	}
}