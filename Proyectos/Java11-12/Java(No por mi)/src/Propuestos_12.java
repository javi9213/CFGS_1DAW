public class Propuestos_12{
	public static void main(String[] args){

		int euros=232;
		int billete500=0;
		int billete200=0;
		int billete100=0;
		int billete50=0;
		int billete20=0;
		int billete10=0;
		int billete5=0;

		do{
			if(euros>=500){
				euros=euros-500;
				billete500++;
			}
			if(euros>=200){
				euros=euros-200;
				billete200++;
			}
			if(euros>=100){
				euros=euros-100;
				billete100++;
			}
			if(euros>=50){
				euros=euros-50;
				billete50++;
			}
			if(euros>=20){
				euros=euros-20;
				billete20++;
			}
			if(euros>=10){
				euros=euros-10;
				billete10++;
			}
			if(euros>=5){
				euros=euros-5;
				billete5++;
			}
			
		}while(euros>5);
		
		System.out.println("BILLETERA");
		System.out.println("----------");
		System.out.println("Billetes de 500: "+billete500);
		System.out.println("Billetes de 200: "+billete200);
		System.out.println("Billetes de 100: "+billete100);
		System.out.println("Billetes de  50: "+billete50);
		System.out.println("Billetes de  20: "+billete20);
		System.out.println("Billetes de  10: "+billete10);
		System.out.println("Billetes de   5: "+billete5);
		System.out.println("No billetes > €: "+euros);
	}
}