public class minumero {
	public static int doble(int num){
		return num*2;
	}
	public static int triple(int num){
		return num*3;
	}
	public static int cuadruple(int num){
		return num*4;
	}
	minumero(int num){
		doble(num);
		triple(num);
		cuadruple(num);
	}
	public static void main(String[] args) {
		int num=5;
		System.out.println(doble(num));
		System.out.println(triple(num));
		System.out.println(cuadruple(num));
	}
}