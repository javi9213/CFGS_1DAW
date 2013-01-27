package ejercicio14;

public class Dado
{
    private int valor;
    
    public int tirar()
	{
        valor = 1 + (int)(Math.random()*6);
        return valor;
    }
    
    public void imprimir()
	{
        System.out.println("El valor del dado es:" + valor);
    }
}