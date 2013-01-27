package propuestos;

//import java.util.*;

public class Ejercicio2 {

	//ArrayList<Integer> array1;
	//ArrayList<Integer> array2;
	private int[] array1;
	private int[] array2;
	final int TAMARRAY;
	
	public Ejercicio2(){
		TAMARRAY=100;
		array1 = new int[TAMARRAY];
		array2 = new int[TAMARRAY];
		//array1 = new ArrayList<Integer>();
		//array2 = new ArrayList<Integer>();
	}

	public int getaleatorio(){
		//return (int) (Math.random()*array1.size());
		return (int) (Math.random()*TAMARRAY);
	}
	
	public void insertion_sort(){
		
		int j, aux;
		
		for(int i=0;i<TAMARRAY;i++){
		//for(int i=0;i<array1.size();i++){
			array1[i]=getaleatorio();
			array2[i]=array1[i];
		}
		
		//for(int i=1;i<array2.size();i++){
		for(int i = 1; i < array2.length; i++){
			aux=array2[i];
			for(j = i-1; ((j >= 0) && (aux < array2[j])); j--){
				array2[j+1]=array2[j];
			}
			array2[j+1]=aux;
		}
		
		//for(int i=0;i<array1.size();i++){
		for(int i=0;i<TAMARRAY;i++){
			System.out.print(array2[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		Ejercicio2 ejer = new Ejercicio2();
		ejer.insertion_sort();
	}
}