package prCPS;

public class ContadorPalabrasSig extends ContadorPalabras {
	private String [] palNoSig;
	
	public ContadorPalabrasSig(String [] pns) {
		this(NUM_INICIAL, pns);
	}
	
	public ContadorPalabrasSig(int n, String [] pns) {
		super(n);
		palNoSig = pns;
	}
	
	public void incluye(String pal) {
		if (esSignificativa(pal)) {
			super.incluye(pal);
		}
	}
	
	private boolean esSignificativa(String pal) {
		String palM = pal.toUpperCase();
		boolean significativa = true;
		int pos = 0;
		while (pos < palNoSig.length && significativa) {
			significativa = !palNoSig[pos].equals(palM);
			pos++;
		}
		return significativa;
	}

}
