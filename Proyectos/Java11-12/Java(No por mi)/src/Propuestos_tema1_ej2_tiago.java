public class Propuestos_tema1_ej2_tiago {
	/*Crear una variable que contenga un numero aleatorio con Math.random() y que el número 
	 * resultante de la operación sea entre 0 y 127. Convierte el número aleatorio en un carácter de la 
	 * tabla ASCII. (Tiago)
	 * Ejemplo de salida: El número 125 en la tabla ASCII es: X.*/
	public static void main(String[] args){
		char c;
		c =(char)(Math.random()*127);
		System.out.print("El caracter es " +(int)c+" y en ASCII es "+(char)c);
	}
}