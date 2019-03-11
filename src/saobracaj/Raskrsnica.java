package saobracaj;

import greske.GNegVred;

public class Raskrsnica extends Saobracajnica {
	private Ulica ulica;
	
	public Raskrsnica(Ulica u, long minVreme, long maxVreme) throws GNegVred {
		super(0, minVreme, maxVreme);
		ulica = u;
		start();
	}
	
	public void radi() {
		String snimak = ulica.snimak();
		if(snimak != null) System.out.println(snimak);
	}
}
