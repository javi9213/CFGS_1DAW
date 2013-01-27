class peso {
	private float peso;
	peso(){
		
	}
	public void getLibras(){
		float pesog=peso/1000;
		float pesol=pesog/435;
		System.out.println(pesog+" gramos son "+pesol+" libras.");
	}
	public void getLingotes(){
		float pesoling=peso/14.59F;
		System.out.println(peso+" kilogramos son "+pesoling+" lingotes.");
	}
	public void getPeso(){
		
	}
}