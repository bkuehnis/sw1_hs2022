package tza.ch.zhaw.bieriol2.uebung10;


public class Paket extends Lieferung{
	private double gewicht;
	
	public Paket(int plz, String empfaenger, double gewicht) {
		super(plz, empfaenger);
		this.gewicht = gewicht;
	}
	
	public double getGewicht() {
		return this.gewicht;
	}
	
	public void print() {
		System.out.println();
		System.out.println("Paket");
		super.print();
		System.out.print("-Gewicht: " + gewicht);
		System.out.println();
	}
}
