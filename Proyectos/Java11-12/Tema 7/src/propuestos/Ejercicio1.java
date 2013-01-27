package propuestos;

import java.util.*;

public class Ejercicio1{
	
	public static ArrayList<Integer> lista;

	public static int getaleatorio(){
		return (int) (Math.random()*lista.size()+1);
	}
	public static void ordena(ArrayList<Integer> array){
		int min, aux;
		for(int i = 0; i < array.size() - 1; i++){
			min = i;
			for(int j = i + 1;j < array.size(); j++){
				if (array.get(j) < array.get(min)){
					min = j;
				}
			}

			if(i != min){
				aux = array.get(i);
				array.set(i, array.get(min));
				array.set(min, aux);
			}
		}
	}
	public static void muestra(){
		for (int i=0;i<lista.size();i++){
			System.out.print(lista.get(i)+" ");
		}
	}
	public static void main(String[]args){
		lista=new ArrayList<Integer>();
		for(int i=0;i<lista.size();i++){
			lista.add(i, getaleatorio());
		}
		muestra();
		System.out.println();
		ordena(lista);
		System.out.println();
		muestra();
		System.out.println();
	}
}