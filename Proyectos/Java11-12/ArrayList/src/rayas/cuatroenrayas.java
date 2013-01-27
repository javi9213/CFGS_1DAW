package rayas;

public class cuatroenrayas {

	private String[][]matriz;
	
	public cuatroenrayas(){
		matriz= new String [7][7];
	}
	
	public void rellenar(String nom, int x, int y){
		if((x>0)&&(x<7)&&(y>0)&&(y<7)){
			if((nom.compareTo("X")==0)||(nom.compareTo("O")==0)){
				matriz[x-1][y-1]=nom;
			}else{
				System.out.println("Ficha mal introducida");
			}
		}else{
			System.out.println("Numeros introducidos incorrectos");
		}
	}
	
	public boolean isLleno(int x, int y){
		boolean lleno = false;
		if(!lleno){
			if((matriz[x-1][y-1].compareTo("X")==0)||(matriz[x-1][y-1].compareTo("O")==0)){
				lleno=true;
			}
		}
		return lleno;
	}
	
	public void mostrar(){
		for(int i=0;i<matriz.length;i++){
			for(int j=0;j<matriz.length;j++){
				for(int k=0;k<6;k++){
					System.out.print(matriz[i][j]);
				}
				System.out.println();
			}
		}
	}
	
	
}