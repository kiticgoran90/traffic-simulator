package test;
import saobracaj.*;
import greske.GNegVred;

public class SaobracajTest {
	
	public static void main(String[] varg) {
		Ulica ul;
		Raskrsnica ras;
		
		try {
			ul = new Ulica(3,100,300);
			ras = new Raskrsnica(ul, 100,300);
		}catch(GNegVred g) {return;}
		
		ul.kreni();
		ras.kreni();
		
		try {
			Thread.sleep(3000);
		}catch(InterruptedException g) {}
		
		ul.stani();
		ras.stani();
		
		ul.zavrsi();
		ras.zavrsi();
		
		try {
			ul = new Ulica(-1,100,300);
		}catch(GNegVred g) {
			System.out.println(g);
		}
	}
}