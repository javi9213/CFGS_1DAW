public class ordenar{

	private int[]array;
	private int numarray;
	private final int TAMARRAY;

	//Constructor
	public ordenar(){
		TAMARRAY = 3;
		array = new int [TAMARRAY];
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

	//metodo que ordena de menor a mayor (metodo burbuja)
	public void ordenacion(){
		int num;
		for(int i = array.length; i > 0; i--){
			for(int j = 0;j < i - 1; j++){
				if (array[j] > array[j+1]){
					num = array[j+1];
					array[j+1] = array[j];
					array[j] = num;
				}
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