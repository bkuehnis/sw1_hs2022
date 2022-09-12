package tza.ch.zhaw.bieriol2.uebung10;


public class Lieferung {
	private int plz;
	private String empfaenger;
	
	public Lieferung(int plz, String empfaenger) {
		this.plz = plz;
		this.empfaenger = empfaenger;
	}
	
	public int getPlz() {
		return this.plz;
	}
	
	public String getEmpfaenger() {
		return this.empfaenger;
	}
	
	public void print() {
		System.out.println("-PLZ: " + this.plz);
		System.out.println("-Empfänger: "+ this.empfaenger);
	}

}
