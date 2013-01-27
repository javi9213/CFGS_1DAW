public class DemoOrdenamiento_original{
	public static void main(String []args){
        Ordenamiento_original datos=new Ordenamiento_original();
        int sw,opcion;
 
        datos.ingreso();
        sw=1;
        do{
            System.out.println("0. Salir");
            System.out.println("1. Burbuja Derecha Izquierda");
            System.out.println("2. Burbuja de derecha a Izquierda");
            System.out.println("3. Inserción Directa");
            System.out.println("4. Selección Directa");
            System.out.println("5. Metodo Shell");
            System.out.println("6. Ordenamiento rápido");
            System.out.print("Opcion ==> ");
            opcion=Leer_original.datoInt();
            if(opcion>0){
                System.out.println("Arreglo antes de ordenar");
                datos.reporte();
            }
            switch(opcion){
                case 0: sw=0;break;
                case 1: datos.burbuja_der_izq();break;
                case 2: datos.burbuja_izq_der();break;
                case 3: datos.baraja();
                case 4: datos.seleccion_directa();break;
                case 5: datos.shell();break;
                case 7: datos.quicksort(datos.a,0,datos.n-1);break;
            }
            if(opcion>0){
                System.out.println("Arreglo despues de ordenar");
                datos.reporte();
            }
        }while(sw!=1);
    }
}