package saobracaj;

import greske.GNegVred;

public abstract class Saobracajnica extends Thread {
	protected Traka[] trake;
	private long minVreme, maxVreme;
	private boolean radi = false;
	
	public Saobracajnica(int brojTraka, long minVreme, long maxVreme) throws GNegVred {
		if(brojTraka < 0) throw new GNegVred();
		trake = new Traka[brojTraka];
		for(int i=0; i<brojTraka; i++)
			trake[i] = new Traka();
		this.minVreme = minVreme;
		this.maxVreme = maxVreme;
	}
	
	public abstract void radi();
	
	public void run() {
		try {
			while(!interrupted()) {
				synchronized(this) {
					if(!radi) wait();
				}
				sleep((long)(minVreme + Math.random() * (maxVreme - minVreme)));
				if(radi) radi();
			}
		}catch(InterruptedException g) {}
	}
	
	public synchronized void kreni() {
		radi = true;
		notify();
	}
	
	public void stani() {
		radi = false;
	}
	
	public void zavrsi() {
		interrupt();
	}
}
