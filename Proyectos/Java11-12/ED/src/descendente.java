public class descendente {
	public static void main(String[] args) {
		int a=4, b=5, c=3;
		if(a>=b){
			if(b>=c){
				System.out.println("Orden "+a+", "+b+", "+c);
			}else{
				if(a>=c){
					System.out.println("Orden "+a+", "+c+", "+b);
				}else{
					System.out.println("Orden "+c+", "+a+", "+b);
					}
						}
		}else{
			if(b>=c){
				if(a>=c){
					System.out.println("Orden "+b+", "+a+", "+c);
						}else{
							System.out.println("Orden "+b+", "+c+", "+a);
							}
					}else{
						System.out.println("Orden "+c+", "+b+", "+a);
						}
					}
			}
}