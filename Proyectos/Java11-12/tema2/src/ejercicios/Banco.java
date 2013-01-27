package ejercicios;
public class Banco{
    private Cliente cliente1,cliente2,cliente3;
	
    public Banco(){
        cliente1 = new Cliente("Juan");
        cliente2 = new Cliente("Ana");
        cliente3 = new Cliente("Pedro"); 
    }

    public void operar(){
        cliente1.depositar(100);
        cliente2.depositar(150);
        cliente3.depositar(200);
        cliente3.extraer(150);
    }
	
    public void depositosTotales (){
        int t;
        t = cliente1.retornarTotal() + cliente2.retornarTotal() + cliente3.retornarTotal();
        System.out.println ("El total de dinero en el banco es:" + t);
        cliente1.imprimir();
        cliente2.imprimir();
        cliente3.imprimir();
    }
}