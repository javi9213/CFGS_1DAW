public class numero {
	private int num;
	numero(){
		num=0;
	}
	void inicializa(){
		num=5;
	}
	public static int añade(int num,int numsuma){
		return(num+numsuma);
	}
	public static int resta(int num,int numresta){
		return(num-numresta);
	}
	public void getValor(){
		System.out.println(num);
	}
	public void getDoble(){
		int doble=num;
		doble*=2;
		System.out.println(doble);
	}
	public void getTriple(){
		int triple=num;
		triple*=3;
		System.out.println(triple);
	}
	public void setNumero(){
		num=5;
	}
}