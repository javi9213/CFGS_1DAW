package prCPSL;

import java.util.Arrays;
import java.util.List;


public class ContadorPalabrasSig extends ContadorPalabras {
	private List<String>  palNoSig;
	
	public ContadorPalabrasSig(String [] pns) {
		this(NUM_INICIAL, pns);
	}
	
	public ContadorPalabrasSig(int n, String [] pns) {
		super(n);
		palNoSig = Arrays.asList(pns);
	}
	
	public void incluye(String pal) {
		if (!palNoSig.contains(pal.toUpperCase())) {
				super.incluye(pal);
		}
	}
}
