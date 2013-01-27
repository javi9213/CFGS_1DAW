package ejercicio10propuesto;

public class minumero {

	public void esVampiro(int num){
		int unidad=num%10;
		int decena=num%100;
		decena/=10;
		int centena=num%1000;
		centena/=100;
		int millar=num/1000;
		millar=(millar*10)+unidad;
		decena=(decena*10)+centena;
		unidad=millar*decena;
		System.out.println(unidad+"="+millar+"x"+decena);
		if(unidad==num){
			System.out.println("El número "+num+" es un número vampiro");
		}else{
			System.out.println("El número "+num+" no es un número vampiro");
		}
	}
}