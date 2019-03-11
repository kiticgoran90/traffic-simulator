package saobracaj;

public class Traka {
	private Kamera kamera;
	private Elem prvi, posl;
	private String snimak;
	
	private class Elem {
		Vozilo v;
		Elem sled = null;
		Elem(Vozilo v) {
			this.v = v;
			if(prvi == null) prvi = this;
			else posl.sled = this;
			posl = this;
		}
	}
	
	public Traka() {
		kamera = new Kamera();
	}
	
	public synchronized void stavi(Vozilo v) {
		new Elem(v);
	}
	
	public synchronized Vozilo uzmi() {
		snimak = null;
		if(prvi == null) return null;
		Vozilo v = prvi.v;
		if((prvi = prvi.sled) == null) posl = null;
		kamera.snimi(v);
		snimak = kamera.snimak();
		return v;
	}
	
	public String snimak() {
		return snimak;
	}
}
