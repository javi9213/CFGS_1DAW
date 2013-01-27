package tema2;
class numero {
	private static int num;
	public numero(){
		num=5;
	}
	public numero(int num){
		num=0;
	}
	public int añade(int numsuma){
		return(num+numsuma);
	}
	public int resta(int numresta){
		return(num-numresta);
	}
	public static void getValor(){
		System.out.println(num);
	}
	public static void getDoble(){
		int doble=num;
		doble*=2;
		System.out.println(doble);
	}
	public static void getTriple(){
		int triple=num;
		triple*=3;
		System.out.println(triple);
	}
	public static void setNumero(){
		num=5;
	}
	public static void main (String[]args){
		numero n=new numero();
		System.out.println(n.añade(10));
		System.out.println(n.resta(5));
		getValor();
		getDoble();
		getTriple();
		setNumero();
	}
}