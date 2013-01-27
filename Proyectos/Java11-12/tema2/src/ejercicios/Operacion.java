package ejercicios;
public class Operacion{
    
	private int val1;
    private int val2;
    private int resultado;
    
    public void cargar1(int num){
        val1 = num;  
    }
    
    public void cargar2(int num){
        val2 = num;
    }
    
    public int valor1(){
    	return val1;
    }
    
    public int valor2(){
    	return val2;
    }
    
    public void asignarResultado(int num){
    	resultado = num;
    }
    
    public void mostrarResultado() {
        System.out.println(resultado);
    }
}
