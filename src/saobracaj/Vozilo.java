package saobracaj;

public class Vozilo implements Registrovano {
	private static final String[] mesta = {"BG", "NS", "NI"};
	private String regOznaka;
	
	public Vozilo() {
		regOznaka = mesta[(int)(Math.random()*mesta.length)] + (int)(Math.random()*1000);
	}
	
	@Override
	public String regOznaka() {
		return regOznaka;
	}
}
