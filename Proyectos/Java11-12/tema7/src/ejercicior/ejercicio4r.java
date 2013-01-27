package ejercicior;

public class ejercicio4r {

	public static void ordenacocktail(int array[]){
		boolean swp = true;
		int i=0, j= array.length-1;
		while(i<j&&swp){
			swp = false;
			for(int k=i;k<j;k++){
				if(array[k]>array[k+1]){
					int temp = array[k];
					array[k]=array[k+1];
					array[k+1] = temp;
					swp = true;
				}
			}
			j--;
			if(swp){
				swp = false;
				for(int k=j;k>i;k--){
					if(array[k]<array[k-1]){
						int temp = array[k];
						array[k] = array[k-1];
						array[k-1] = temp;
						swp = true;
					}
				}
			}
			i++;
		}
	}
}