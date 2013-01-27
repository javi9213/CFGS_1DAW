package ejercicio1;

public class Ejercicio1r{
  public static void main(String args []){
    int radio;
    CEsfera obj = new CEsfera();
    
    System.out.print("Introduce el radio: ");
    radio = Leerr.datoInt();
    obj.setRadio(radio);
    System.out.println("Volumen: "+ obj.Volumen());
    System.out.println("Radio: " + obj.getRadio());
  }
}
