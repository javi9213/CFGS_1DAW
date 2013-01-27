package ejercicio5propuesto;

public class ejercicio5p {
	
	public void lucky(){
		System.out.print("Introduzca el día de su fecha de nacimiento:");
		int dia=Leer.datoInt();
		System.out.print("Introduzca el mes de su fecha de nacimiento:");
		int mes=Leer.datoInt();
		System.out.print("Introduzca el año de su fecha de nacimiento(Ej: 1992):");
		int año=Leer.datoInt();
		int suma=dia+mes+año;
		int num=suma%10;
		int num1=suma/1000;
		int num2=num1/100;
		int num3=num2/10;
		int num_suma=num+num1+num2+num3;
		int num4=num_suma/10;
		int num5=num_suma%10;
		int total=num4+num5;
		System.out.println("Tu número de la suerte es el: "+total);
	}
}