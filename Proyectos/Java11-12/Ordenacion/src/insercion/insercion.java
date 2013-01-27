package insercion;

public class insercion {

	public int[] array;
	public int numarray;
	public final int TAMARRAY;

	//Constructor
	public insercion(){
		TAMARRAY = 3;
		array = new int[TAMARRAY];
	}

	public int getNumarray(){
		return numarray;
	}

	public int getTAMARRAY(){
		return TAMARRAY;
	}

	//Aniadir valores al array
	public void anadirnum(int num){
		array[numarray] = num;
		numarray++;
	}

	//metodo para insertar valores a un array ordenado
	public void insertar(){
		int j, aux;
		for(int i = 1; i < array.length; i++){
			aux=array[i];
			for(j = i-1; ((j >= 0) && (aux < array[j])); j--){
				array[j+1]=array[j];
			}
			array[j+1]=aux;
		}
	}

	//metodo para mostrar el contenido del array
	public void mostrar(){
		for(int i = 0; i < TAMARRAY; i++){
			System.out.print(array[i]+"  ");
		}
	}
}


