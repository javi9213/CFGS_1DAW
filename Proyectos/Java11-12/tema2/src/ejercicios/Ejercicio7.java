package ejercicios;
public class Ejercicio7 {
    public static void main(String[] args) {
        Suma suma1 = new Suma();
        suma1.cargar1(5);
        suma1.cargar2(3);
        suma1.operar();
        System.out.print("El resultado de la suma es:");
        suma1.mostrarResultado();
        Resta resta1=new Resta();
        resta1.cargar1(3);
        resta1.cargar2(5);
        resta1.operar();
        System.out.print("El resultado de la resta es:");        
        resta1.mostrarResultado();
    }
}

