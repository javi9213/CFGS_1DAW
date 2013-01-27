package ordenacion;

public class MetodosOrdenacion{
	
	int[] vector;

	//Constructor
	public MetodosOrdenacion(int tamano){
		vector = new int[tamano];
	}

	//Rellenar Vector
	public void rellenarVector(){
		for(int i=0; i<vector.length; i++){
			System.out.print("Posicion [" +(i+1)+ "]: ");
			vector[i] = Leer.datoInt();
		}
	}
	
	public void Burbuja(){
		int aux;
		for(int i=vector.length-1; i>0; i--){
			for(int j=0; j<i; j++){
				if(vector[j] > vector[j+1]){
					aux = vector[j];
					vector[j] = vector[j+1];
					vector[j+1] = aux;
				}
			}
		}
	}

	public void BurbujaEficiente(){
		int aux;
		int i=vector.length-1;
		int j;
		boolean comprobar = true;
		while((comprobar) && (i > 0)){
			j=0;
			comprobar = false;
			while (j < i){
				if(vector[j] > vector[j+1]){
					aux = vector[j];
					vector[j] = vector[j+1];
					vector[j+1] = aux;
					comprobar = true;
				}
				j++;
			}
			i--;
		}
	}

	public void Seleccion(){
		int aux;
		int minimo;
		for (int i = 0; i < vector.length - 1; i++){
			minimo = i;
            for (int j = i + 1; j < vector.length; j++){
            	if (vector[j] < vector[minimo]){
            		minimo = j;
                }
            }
	        if (i != minimo){
	        	aux= vector[i];
	        	vector[i] = vector[minimo];
	        	vector[minimo] = aux;
            }
        }
	}
	
	public void Insersion(){
		int aux;
		int j;
		for(int i=1; i<vector.length; i++){
			aux=vector[i];
			j = i-1;
			while((j>=0) && (aux<vector[j])){
				vector[j+1]=vector[j];
				j--;
			}
			vector[j+1]=aux;
		}
	}
	
	//Mostrar Vector
	public void mostrarVector(){
		for(int i=0; i<vector.length; i++){
			System.out.print(vector[i]+ "\t");
		}
	}
}