package seleccion;

public class seleccion {

	public int[]array;
	public int numarray;
	public final int TAMARRAY;

	//Constructor
	public seleccion(){
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

	//metodo para seleccionar el mayor y recorrer
	//el array en la busqueda del otro mayor del resto y menor de el
	public void selecionar(){
		int min, aux;
		for(int i = 0; i < array.length - 1; i++){
			min = i;
			for(int j = i + 1;j < array.length; j++){
				if (array[j] < array[min]){
					min = j;
				}
			}

			if(i != min){
				aux = array[i];
				array[i] = array[min];
				array[min] = aux;
			}
		}
	}

	//metodo para mostrar el contenido del array
	public void mostrar(){
		for(int i = 0; i < TAMARRAY; i++){
			System.out.print(array[i]+"  ");
		}
	}
}