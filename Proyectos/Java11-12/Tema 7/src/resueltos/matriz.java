package resueltos;

public class matriz {

	public static void main(String[]args){
		int [][] matriz= new int [5][8];
		for (int i=0; i<5; i++){
			for(int j=0; j<8; j++){
				matriz[i][j]=i+j;
			}
		}
		for(int i=0; i<5; i++){
			for(int j=0; j<8; j++){
				System.out.println(matriz[i][j]);
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}