package tema2;
public class restaurante {
	
	public static int papas;
	public static int chocos;
	public restaurante(){
		papas=50;
		chocos=30;
	}
	
	public int getComensales(){
		int num1=papas;
		int num2=chocos/2;
		num1*=3;
		num2*=3;
		if(num1<num2){
			System.out.println("Los clientes atendidos son: "+num1);
		}else{
			if(num2<num1){
				System.out.println("Los clientes atendidos son: "+num2);
			}
		}
		return 0;
	}
	
	public void addChocos(int x){
		int num1=chocos;
		num1=num1+x;
		chocos=num1;
	}
	
	public void addPapas(int x){
		int num2=papas;
		num2=num2+x;
		papas=num2;
	}
	
	public void showChocos(){
		System.out.println("Los kilos de chocos en el almacén son: "+chocos);
	}
	
	public void showPapas(){
		System.out.print("Los kilos de papas en el almacén son: "+papas);
	}
	
	public static void main(String[] args) {
		restaurante r=new restaurante();
		r.addChocos(5);
		r.addPapas(10);
		r.getComensales();
		r.showChocos();
		r.showPapas();
	}
}