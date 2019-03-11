package greske;

@SuppressWarnings("serial")
public class GNegVred extends Exception {
	
	@Override
	public String toString() {
		return "Nije dozvoljena negativna vrednost za broj traka u saobracajnici!";
	}
}
