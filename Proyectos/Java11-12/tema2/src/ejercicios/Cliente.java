package ejercicios;
public class Cliente{

	private String nombre;
    private int total;
    
    public Cliente(String nom){
        nombre = nom;
        total = 0;
    }
    
    public void depositar(int cant){
        total = total + cant;
    }
    
    public void extraer(int cant){
        total = total - cant;
    }
    
    public int retornarTotal(){
        return total;
    }
    
    public void imprimir(){
        System.out.println(nombre + " tiene depositado la suma de " + total);
    }
}