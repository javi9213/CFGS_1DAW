package resueltos;

public class busquedabin {

	private static int[] array;
	final int TAMARRAY;
	final int LIM;
	
	public busquedabin(){
		TAMARRAY = 50;
		LIM=100;
		array = new int[TAMARRAY];
	}
	
	public int getTAMARRAY() {
		return TAMARRAY;
	}


	public int getaleatorio(){
		return (int) (Math.random()*TAMARRAY+1);
	}
	
	public void ordena(int array[]){
		int aux;
		for(int i=array.length;i>0;i--){
			for(int j=0;j<i-1;j++){
				if(array[j]<array[j+1]){
					aux=array[j+1];
					array[j]=array[j+1];
					array[j+1]=aux;
				}
			}
		}
	}
	
	public void muestra(){
		for(int i=0;i<TAMARRAY;i++){
			System.out.print(array[i]+" ");
		}
	}
	
	public int buscabin(int []a, int valor, int min, int max){
		
		int mitad = 0;
		
		if(min==max){
			System.out.println("Salida porque min=max");
			return -1;
		}
		
		mitad=(min+max)/2;
		System.out.println("min:"+min+" a[min]:"+a[min]+" max:"+max+" a[max]:"+a[max]+" mitad:"+mitad+" a[mitad]:"+a[mitad]);
		
		if(valor == a[mitad]){
			return mitad;
		}
		
		if(valor == a[min]){
			return min;
		}
		
		if(valor == a[max]){
			return max;
		}
		
		if(valor > a[mitad]){
			return buscabin(a,valor,mitad+1,max);
		}else{
			return buscabin(a,valor,min,mitad-1);
		}
	}
	
	public static void main(String[] args) {
		
		busquedabin bus = new busquedabin();
		
		for(int i=0;i<bus.getTAMARRAY();i++){
			array[i]=bus.getaleatorio();
		}
		
		bus.muestra();
		System.out.println();
		bus.ordena(array);
		
		System.out.println();
		bus.muestra();
		
		System.out.println();
		System.out.println();
		System.out.println(bus.buscabin(array,50,0,bus.getTAMARRAY()-1));
	}
}