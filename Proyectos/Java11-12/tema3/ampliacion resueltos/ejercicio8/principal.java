package ejercicio8;

public class principal {
	
	public static void main(String[] args){
		
		cuadrado c = new cuadrado();
        int lado;
        do{
        System.out.print("Dime la altura: ");
        lado = Leer.datoInt();
        }while(lado < 4);
        
        c.setLado(lado);
        System.out.println();
        c.DibujarCuadrado();
	}
}