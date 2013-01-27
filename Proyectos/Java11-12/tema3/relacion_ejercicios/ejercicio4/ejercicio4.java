package ejercicio4;

public class ejercicio4 {
	
	public void x5(int x,int a,int b,int c){
		int num=(int)(a*Math.pow(x,5)-b*Math.pow(x,3)+c*x-7);
		System.out.println("Para x="+x+", "+a+"x^5-"+b+"x^3+"+c+"x-7= "+num);
	}
}