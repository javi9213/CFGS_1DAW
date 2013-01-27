package propuestos;

import java.util.*;

public class Ejercicio8 {

	private ArrayList<Integer> array;
	public Ejercicio8(){
		array = new ArrayList<Integer>();
	}

	public int getaleatorio(){
		return (int) (Math.random()*100-1);
	}

	public void mayores(){

		int aux, j;
		
		for(int i=0;i<20;i++){
			array.add(i, getaleatorio());
		}

		System.out.println("Array desordenado");
		for(int i=0;i<array.size();i++){
			System.out.print(array.get(i)+" ");
		}

		for(int i = 1; i < array.size(); i++){
			aux=array.get(i);
			for(j = i-1; ((j >= 0) && (aux > array.get(j))); j--){
				array.add(j+1, array.get(j));
			}
			array.add(j+1, aux);
		}

		System.out.println();
		System.out.println();
		System.out.println("Los 10 mayores del array");

		for(int i=0;i<10;i++){
			System.out.print(array.get(i)+" ");
		}
	}

	public static void main(String[] args) {
		Ejercicio8 ejer = new Ejercicio8();
		ejer.mayores();
	}
}