package determinante;

public class matriz {

	private int[]matriz;
	private int NUMATRIZ;
	
	public matriz(){
		matriz = new int[9];
		NUMATRIZ = 0;
	}
	
	public int getNUMATRIZ(){
		return NUMATRIZ;
	}
	
	public void determinante(){
		int resultado;
		resultado = (matriz[0] * matriz[4] * matriz[8]) +
					(matriz[1] * matriz[5] * matriz[6]) +
					(matriz[2] * matriz[3] * matriz[7]) -
					(matriz[2] * matriz[4] * matriz[6]) -
					(matriz[1] * matriz[3] * matriz[8]) -
					(matriz[0] * matriz[5] * matriz[7]);
		System.out.print(resultado);
	}
	
	public void formatriz(){
		System.out.println("La matriz que has introducido es:");
		System.out.println();
		for(int i=0;i<=2;i++){
			System.out.print(matriz[i]+"  ");
		}
		System.out.println();
		for(int j=3;j<=5;j++){
			System.out.print(matriz[j]+"  ");
		}
		System.out.println();
		for(int k=6;k<=8;k++){
			System.out.print(matriz[k]+"  ");
		}
	}
	
	public void anadirnum(int num){
		matriz[NUMATRIZ] = num;
		NUMATRIZ++;
	}
}