public class ArregloUni{
    protected static int MAX=20;
    protected int n;
    protected int []a=new int[MAX];
 
    public int cantidad(){
        return n;
    }
 
    public void ingreso() throws InterruptedException{
       int i,cant;
 
        do{
            System.out.print("Cuantos elementos : ");
            cant=Leer.datoInt();
            if(cant<1 || cant>MAX)
            {
            	System.out.println("Ha introducido un valor incorrecto, recuerde el rango 1-20");
            	Thread.sleep(3000);
            }
        }while(cant<1 || cant>MAX);	
        
        for(i=1;cant>=i;i++){									//for(i=0;cant>=i;i++){
            System.out.print("elemento "+i+":");
            a[i]=Leer.datoInt();
        }
        n=cant+1;											// n=cant;
   }
   public void reporte() throws InterruptedException{
        int i;
 
        if(n>1){
            for(i=1;n>i;i++){
            	System.out.print(a[i]+"\t");
            	}
            System.out.println("\n");
            Thread.sleep(1500);
        }
        else{System.out.println("Esta Vacio");}
    }
 
    public int localizar(int x){
        int i=0;
        if(n>0){
            while (i<n-1 && x!=a[i]) i++;
            if (x==a[i]) return i; // Esta en posición i
            else return -1; // No se encuentra
        }else return -2; // Esta vacia
    }
 
    public void insertar(int x, int pos){
        int i;
 
        if ((n>0) && (n)!=MAX){
            for(i=n-1;pos<=i;i--) a[i+1]=a[i];
            a[pos]=x;
            n=n+1;
       }else if (n>=0) System.out.println("Desbordamiento");
        else System.out.println("Esta vacio");
    }
 
    public void suprimir(int pos){
        int i;
 
        if(n>0){
            for(i=pos;n-1>i;i++) a[i]=a[i+1];
            n=n-1;
        }else System.out.println("Esta vacio");
    }
}