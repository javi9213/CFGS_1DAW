package arrayobjeto;

public class CMatriz {

	private double[] matriz;
	private int NDims;
	private int[] dimsMatriz;
	
	public CMatriz(){
		CMatriz matriz = new CMatriz();
		matriz.construir(dimsMatriz);
	}
	
	public void construir(int [] dims) {
		for(int i = 0;i<dimsMatriz[i];i++){
			if(dimsMatriz[i]<0){
				dimsMatriz[i] = 1;
			}
		}
	}
	
	public int totalelementos(){
		int cont = 0;
		for(int i = 0;i<dimsMatriz[i];i++){
			cont++;
		}
		return cont;
	}

	public int desplazamiento(int []subind){
		int desplazar = 0;
		for(int i=0;i<matriz[i];i++){
			if(matriz[i] == subind[i]){
				desplazar = i;
			}else{
				desplazar = -1;
			}
		}
		return desplazar;
	}
	
	public void asignarDato(int dato, int...in){
		
	}
	
	public double obtenerDato(){
		double resul = 0;
		
		return resul;
	}
	
	public static void main (String[]args){
		double[][][] miMatrizDouble = new double[5][10][4];
		int i = 5, j = 10, k = 4, conta = 1;
		miMatrizDouble[i][j][k] = conta++;
	}
}