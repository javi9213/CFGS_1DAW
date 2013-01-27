package propuestos;

public class Ejercicio10 {

	private int[] array;
	final int TAMARRAY;

	public Ejercicio10(){
		TAMARRAY=20;
		array = new int[TAMARRAY];
	}

	public int getTAMARRAY(){
		return TAMARRAY;
	}

	public int getaleatorio(){
		return (int) (Math.random()*TAMARRAY);
	}

	public void ordenar(){
		int j, aux;

		for(int i=0;i<TAMARRAY;i++){
			array[i]=getaleatorio();
		}

		for(int i=1;i<array.length;i++){
			aux=array[i];
			for(j=i-1;((j>=0)&&(aux<array[j]));j--){
				array[j+1]=array[j];
			}
			array[j+1]=aux;
		}
	}

	public void noalmacenados(){
		String num=" ";
		int i=0,j=0;

		/*for(int j=0;j<TAMARRAY;j++){
			if(array[j]!=vector[j]){
				num+=vector[j]+" ";
			}
		  }*/
		
		while(j<array.length){
			boolean comprobar = false;
			while(i<array.length && comprobar == false){
				if(array[i]==j){
					comprobar = true;
				}
				if(i==array.length-1 && comprobar==false){
					num+=j+" ";
					System.out.print(num);
				}
				i++;
			}
			j++;
		}

		System.out.print(num);
	}

	public void muestra(){
		for(int i=0;i<TAMARRAY;i++){
			System.out.print(array[i]+" ");
		}
	}

	public static void main(String[] args) {
		Ejercicio10 ejer = new Ejercicio10();
		ejer.ordenar();
		ejer.muestra();
		System.out.println();
		ejer.noalmacenados();
	}	
}