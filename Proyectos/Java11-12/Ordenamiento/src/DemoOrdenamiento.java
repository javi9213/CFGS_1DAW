public class DemoOrdenamiento{
	public static void main(String []args) throws InterruptedException{
        Ordenamiento datos=new Ordenamiento();
        int sw,opcion;
 
        datos.ingreso();
        sw=1;
        do{
        	System.out.println("MENU DE NUESTRA APLICACION");
            System.out.println("1. Burbuja Derecha Izquierda");
            System.out.println("2. Burbuja de Izq a derecha");
            System.out.println("3. Inserción Directa");
            System.out.println("4. Selección Directa");
            System.out.println("5. Metodo Shell");
            System.out.println("6. Ordenamiento rápido");
            System.out.println("0. Salir");
            System.out.println("");
            System.out.print("Opcion ==> ");
            opcion=Leer.datoInt();
            if(opcion>0){
                System.out.println("Arreglo antes de ordenar");
                datos.reporte();
            }
            switch(opcion){
                case 0: 
                	System.out.println("Ha seleccionado salir.");
                	sw=1;						// sw=0;
                	break;
                case 1: 
                	datos.burbuja_der_izq();
                	break;
                case 2: 
                	datos.burbuja_izq_der();
                	break;
                case 3: 
                	datos.baraja();
                	break;// FALTA BREAK
                case 4: 
                	datos.seleccion_directa();
                	break;
                case 5: 
                	datos.shell();
                	break;
                case 6:
                	datos.quicksort(datos.a,0,datos.n-1);		//case 7: datos.quicksort(datos.a,0,datos.n-1);break;
                	break;										//	public void quicksort(int data[],int inf,int sup)	
            }
            if(opcion>0){
                System.out.println("Arreglo despues de ordenar");
                datos.reporte();
                Thread.sleep(5000);
                main(null);
            }
        }while(sw!=1);							
    }
}