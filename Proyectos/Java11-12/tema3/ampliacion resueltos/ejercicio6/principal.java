package ejercicio6;

public class principal {
	public static void main (String[]args){
		int color1;
		int color2;
		int multiplicador;
		int tolerancia;
		int voltaje;
		int eleccion;
		
		//Creacion del objeto
		calculo electricidad=new calculo();
		
	do{
		//Recogida de datos
		do{
		System.out.println("Elija el primer color de la resistencia: (numericamente)");
		System.out.println("1. Marron");
		System.out.println("2. Rojo");
		System.out.println("3. Naranja");
		System.out.println("4. Amarillo");
		System.out.println("5. Verde");
		System.out.println("6. Azul");
		System.out.println("7. Violeta");
		System.out.println("8. Gris");
		System.out.println("9. Blanco");
		
		color1=Leer.datoInt();
		
		electricidad.primerColor(color1);
		
		}while(color1<1||color1>9);
		
		do{
		System.out.println("Elija el segundo color de la resistencia: (numericamente)");
		System.out.println("0. Negro");
		System.out.println("1. Marron");
		System.out.println("2. Rojo");
		System.out.println("3. Naranja");
		System.out.println("4. Amarillo");
		System.out.println("5. Verde");
		System.out.println("6. Azul");
		System.out.println("7. Violeta");
		System.out.println("8. Gris");
		System.out.println("9. Blanco");
		
		color2=Leer.datoInt();
		
		electricidad.segundoColor(color2);
		
		}while(color2<0||color2>9);

		do{
		System.out.println("Elija el tercer color de la resistencia: (numericamente)");
		System.out.println("0.  Negro");
		System.out.println("1.  Marron");
		System.out.println("2.  Rojo");
		System.out.println("3.  Naranja");
		System.out.println("4.  Amarillo");
		System.out.println("5.  Verde");
		System.out.println("6.  Azul");
		System.out.println("7.  Violeta");
		System.out.println("8.  Gris");
		System.out.println("9.  Blanco");
		System.out.println("10. Oro");
		System.out.println("11. Plata");
		
		multiplicador=Leer.datoInt();
		
		electricidad.tercerColor(multiplicador);
		
		}while(multiplicador<0||multiplicador>11);
		
		do{
		System.out.println("Elija el primer color de la resistencia: (numericamente)");
		System.out.println("1. Marron");
		System.out.println("2. Rojo");
		System.out.println("3. Naranja");
		System.out.println("4. Amarillo");
		System.out.println("5. Verde");
		System.out.println("6. Azul");
	
		tolerancia=Leer.datoInt();
		electricidad.cuartoColor(tolerancia);
		}while(tolerancia<1||tolerancia>6);
		
		System.out.println("Introduzca el voltaje que hay entre los extremos de la resistencia:");
		voltaje=Leer.datoInt();
		electricidad.voltaje(voltaje);
		
		//Llamada a los metodos de calculo
		
		electricidad.calculoResistencia();
		electricidad.calculoIntensidad();
		electricidad.calculoPotencia();
		
		//Devolucion de los datos
		
		System.out.println("La resistencia tiene un valor de: "+electricidad.devuelveResistencia()+" Ohms.");
		System.out.println("En base a su tolerancia, su valores fluctuaran entre: "+electricidad.devuelvetoleranciabaja()+" Ohms y "+electricidad.devuelvetoleranciaalta()+" Ohms.");
		System.out.println("La corriente que circulará por la resistencia será de: "+electricidad.devuelveintensidad()+" A.");
		System.out.println("La potencia que disipará será de: "+electricidad.devuelvepotencia()+" W.");
		System.out.println("");
		System.out.println("Si desea salir del programa pulse 0, sino, pulse cualquier otro numero.");
		eleccion=Leer.datoInt();
	}while(eleccion!=0);
	
		System.out.println("Fin de Programa.");
	}
}