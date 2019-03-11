package saobracaj;

public class Kamera {
	private static int ID = 0;
	private int id = ++ID;
	private Vozilo vozilo;
	private static long t0 = System.currentTimeMillis();
	private long t;
	
	public Kamera snimi(Vozilo v) {
		vozilo = v;
		t = System.currentTimeMillis() - t0;
		return this;
	}
	
	public String snimak() {
		return "[" + id + ":" + t + "]" + vozilo.regOznaka();
	} 
}
