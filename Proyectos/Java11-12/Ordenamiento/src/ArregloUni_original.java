public class ArregloUni_original{
    protected static int MAX=20;
    protected int n;
    protected int []a=new int[MAX];
 
    public int cantidad(){
        return n;
    }
 
    public void ingreso(){
       int i,cant;
 
        do{
            System.out.print("Cuantos elementos : ");
            cant=Leer_original.datoInt();
        } while(cant<1 || cant>MAX);
        for(i=0;cant>i;i++){
            System.out.print("elemento "+(i+1)+":");
            a[i]=Leer_original.datoInt();
        }
        n=cant;
   }
   public void reporte(){
        int i;
 
        if(n>1){
            for(i=1;n>i;i++) System.out.print(a[i]+"\t");
            System.out.println("\n");
        }
        else System.out.println("Esta Vacio");
    }
 
    public int localizar(int x){
        int i=0;
        if(n>0){
            while (i<n-1 && x!=a[i]) i++;
            if (x==a[i]) return i; // Esta en posición i
            else return -1; // No se encuentra
        }
        else return -2; // Esta vacia
    }
 
    public void insertar(int x, int pos){
        int i;
 
        if ((n>0) && (n)!=MAX){
            for(i=n-1;pos<=i;i--) a[i+1]=a[i];
            a[pos]=x;
            n=n+1;
        }
        else if (n>=0) System.out.println("Desbordamiento");
        else System.out.println("Esta vacio");
    }
 
    public void suprimir(int pos){
        int i;
 
        if(n>0){
            for(i=pos;n-1>i;i++) a[i]=a[i+1];
            n=n-1;
        }
        else System.out.println("Esta vacio");
    }
}