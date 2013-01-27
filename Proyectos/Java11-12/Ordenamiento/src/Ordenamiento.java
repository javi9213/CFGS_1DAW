public class Ordenamiento extends ArregloUni{
	public void burbuja_der_izq() throws InterruptedException{
		int i,j;
		for(i=1;i<=n-1;i++){
			System.out.println("Recorrido"+i);//sirve para que en cada recorrido lo vaya imprimiendo
			for(j=n-1;j>=i;j--){
				if(a[j-1]>a[j]){
					cambio(a,j-1,j);
				}
				reporte();// se pone para que cada recorrido vaya reportando
				}
			}
	}
	public void burbuja_izq_der() throws InterruptedException{
		int i,j;
		for(i=n-2;i>=0;i--){
			System.out.println("Recorrido"+-((i-n)+1));
			for(j=0;j<=i;j++){
					if(a[j]>a[j+1])
				cambio(a,j,j+1);
				reporte();
				}
			}
		}

	public void cambio(int[]a,int pos1,int pos2){
		int t;
		t=a[pos1];
		a[pos1]=a[pos2];
		a[pos2]=t;
	}
	
	public void baraja(){
		int i,j,aux;
		for(i=1;i<=n-1;i++){
			aux=a[i];
			j=i-1;
			while(a[j]>aux && j>0){
				a[j+1]=a[j];
				j--;
			}

			if(a[j]>aux){
				a[j+1]=a[j];
				a[j]=aux;
			}else
				a[j+1]=aux;
		}
	}

	public void seleccion_directa(){
		int i,j,k,aux;
		for(i=0;i<=n-2;i++){
			k=1;
			aux=a[i];
			for(j=i+1;j<=n-1;j++)
				if(a[j]<aux){
					k=j;
					k=a[j];
				}
				a[k]=a[i];
				a[i]=aux;
		}
	}

	public void shell(){
		int d,i,sw;
		d=n;
		do{
			d=d/2;
			do{
				sw=0;
				i=-1;
				do{
					i++;
					if(a[i]>a[i+d]){
						cambio(a,i,i+d);
						sw=1;
					}
				}while(i+d!=n-1);
			}while(sw!=0);
		}while(d!=1);
	}

	public void quicksort(int data[],int inf,int sup){
		int left,rigth;
		double half;

		left=inf;
		rigth=sup;
		half=data[(left+rigth)/2];
		while(left<rigth){
			while(data[left]<half && left<sup)
				left++;
			while(half<data[rigth] && rigth>inf)
				rigth--;

			if(inf<rigth) quicksort(data,inf,rigth);
			if(left<sup) quicksort(data,left,sup);
		}
	}
}