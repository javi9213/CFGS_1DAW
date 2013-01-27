package ej2;


public class princpal 
{
	public static void main(String[]args)
	{
		System.out.println("Introduce un numero para darle la vuelta (que sea entero):");
		int numero=0;
		numero=Leer.datoInt();
		System.out.println("El numero introducido es:"+numero);
		System.out.println("Y el numero dado la vuelta es: "+darVuelta.cambiar(numero));
		
		
		
		
	}
	
}
