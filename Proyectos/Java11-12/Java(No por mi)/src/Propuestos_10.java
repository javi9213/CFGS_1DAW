public class Propuestos_10{											// CLASE JOVEN
														
	public static void main(String[] args) {
		
		int edad=28;
		int nivel_de_estudios=4;
		int ingresos=6;
		
		System.out.println("Edad:"+edad+"  Nivel de estudios:"+nivel_de_estudios+"  Ingresos:"+ingresos);
		System.out.println("Si edad es menor o igual a 28 y nivel estudios es mayor a 3 || o su edad es menor a 30 y sus ingresos son superiores a 28000 Euros");
		boolean jasp;
		
		jasp=false;
		jasp=((edad<=28) && (nivel_de_estudios>3)) || ((edad<30) && (ingresos>28000));
		System.out.println(jasp);
		
		System.out.println("----------------------------------");
		
		jasp=false;
		edad=15;
		nivel_de_estudios=1;
		ingresos=40000;
		
		System.out.println("Edad:"+edad+"  Nivel de estudios:"+nivel_de_estudios+"  Ingresos:"+ingresos);
		System.out.println("Si edad es menor o igual a 28 y nivel estudios es mayor a 3 || o su edad es menor a 30 y sus ingresos son superiores a 28000 Euros");
		jasp=((edad<=28) && (nivel_de_estudios>3)) || ((edad<30) && (ingresos>28000));
		System.out.println(jasp);

		System.out.println("----------------------------------");
		
		jasp=false;
		edad=23;
		nivel_de_estudios=2;
		ingresos=100;
		
		System.out.println("Edad:"+edad+"  Nivel de estudios:"+nivel_de_estudios+"  Ingresos:"+ingresos);
		System.out.println("Si edad es menor o igual a 28 y nivel estudios es mayor a 3 || o su edad es menor a 30 y sus ingresos son superiores a 28000 Euros");
		jasp=((edad<=28) && (nivel_de_estudios>3)) || ((edad<30) && (ingresos>28000));
		System.out.println(jasp);
	}
}