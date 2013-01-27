package propuestos;

import java.util.*;

public class Ejercicio9 {

	private ArrayList<Integer> array;

	public Ejercicio9(){
		array = new ArrayList<Integer>();
	}

	public int getaleatorio(){
		return (int) (Math.random()*70+10);
	}

	public void rellenar(){
		for(int i=0;i<10;i++){
			array.add(i, getaleatorio());
		}
	}

	public void muestra(){
		for(int i=0;i<array.size();i++){
			System.out.print(array.get(i)+" ");
		}
	}

	public int menor(){
		int menor=Integer.MAX_VALUE;

		for(int i=0;i<array.size();i++){
			if(array.get(i)<menor){
				menor=array.get(i);
			}
		}

		return menor;
	}

	public int media(){
		int media = 0, aux = 0;
		for(int i=0;i<array.size();i++){
			aux+=array.get(i);
			media=aux/array.size();
		}

		return media;
	}

	public int valorepite(){
		int valorepite=0, vecesrepite=0;
		int mayorvalorepite = 0, mayorvecesrepite=0;

		for(int i=0;i<array.size();i++){
			valorepite=array.get(i);
			for(int j=0;j<array.size();j++){
				if(array.get(i)==array.get(j)){
					vecesrepite++;
					if(vecesrepite>mayorvecesrepite){
						mayorvecesrepite=vecesrepite;
						mayorvalorepite=valorepite;
					}
				}
			}
		}
		return mayorvalorepite;
	}
/**
	public int vecesrepite(){
		int valorepite=0, vecesrepite=0;
		int mayorvalorepite = 0, mayorvecesrepite=0;

		for(int i=0;i<TAMARRAY;i++){
			valorepite=array[i];
			for(int j=0;j<TAMARRAY;j++){
				if(array[i]==array[j]){
					vecesrepite++;
					if(vecesrepite>mayorvecesrepite){
						mayorvecesrepite=vecesrepite;
						mayorvalorepite=valorepite;
					}
				}
			}
		}

		return mayorvecesrepite;
	}

	public int mayor(){
		int mayor=array[0];
		
		for(int i=0;i<TAMARRAY;i++){
			if(array[i]>mayor){
				mayor=array[i];
			}
		}

		return mayor;
	}

	public static void main(String[] args) {
		Ejercicio9 ejer = new Ejercicio9();
		ejer.rellenar();
		ejer.muestra();
		System.out.println();
		System.out.print("Mayor: "+ejer.mayor()+" Menor: "+ejer.menor()+" Media: "+ejer.media()+
				" Valores repetidos: "+ejer.valorepite()+";"+ejer.vecesrepite());
	}*/
}