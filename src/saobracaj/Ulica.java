package saobracaj;

import greske.GNegVred;

public class Ulica extends Saobracajnica {
	
	public Ulica(int brTraka, long minVreme, long maxVreme) throws GNegVred {
		super(brTraka, minVreme, maxVreme);
		start();
	}

	@Override
	public void radi() {
		trake[(int)(Math.random()*trake.length)].stavi(new Vozilo());
	}
	
	public String snimak() {
		Traka traka = trake[(int)(Math.random()*trake.length)];
		traka.uzmi();
		return traka.snimak();
	}
}
