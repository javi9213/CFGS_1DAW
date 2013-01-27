
public class juego {
	
	private String[][] array;
	private String[][] incog;
	
	//Constructor donde inicializo el tamaño de los arrays
	public juego(){
		array = new String[3][4];
		incog = new String[3][4];
	}

	//Relleno el array en posiciones aleatorias
	public void rellenar(String []nom) {
		
		int num= (int) (Math.random() * array.length);
		int num1= (int) (Math.random() * array.length);
		
		for(int i=0;i<array.length;i++){
			array[num][num1] = nom[i];
		}
	}

	//Muestro los valores del array
	public void mostrar() {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.print(array[i][j] + " ");
			}
		}
	}
	
	/*Compruebo que en las filas y columnas introducidas
	las parejas de nombres sean las mismas y si son
	me devuelve un booleano con valor true*/
	public boolean comprobar(int []fyc){
		boolean comprobar = false;
		
		String nom1 = array[fyc[0]][fyc[1]];
		String nom2 = array[fyc[2]][fyc[3]];
		
		int num = nom1.compareToIgnoreCase(nom2);
		
		if(num==0){
			comprobar = true;
		}

		return comprobar;
	}
	
	//Muestro el otro array incognita
	public void mostrarincog(){
		for(int i=0;i<incog.length;i++){
			for(int j=0;j<incog.length;j++){
				System.out.print(incog[i][j]+" ");
			}
		}
	}
	
	/*Relleno el array incognita
	que sera el cual me ayude a esconder
	los valores del otro array ante el usuario*/
	public void rellenarincog(){
		
		String cadena="CENSORED";
		
		for(int i=0;i<incog.length;i++){
			for(int j=0;j<incog.length;j++){
				incog[i][j] = cadena;
			}
		}
	}
}