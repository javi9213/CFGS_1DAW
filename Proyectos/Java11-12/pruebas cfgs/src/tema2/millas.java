package tema2;
class millas {
	private static float millametro=1852;
	public static void millasAMetros(float millas){
		float metros=millas*millametro;
		System.out.println(metros);
	}
	public static void millasAKilometros(float millas){
		float metros=millas*millametro;
		metros=metros/1000;
		System.out.println(metros);
	}
	public static void main(String[] args) {
		millasAMetros(8);
		millasAKilometros(8);
	}
}