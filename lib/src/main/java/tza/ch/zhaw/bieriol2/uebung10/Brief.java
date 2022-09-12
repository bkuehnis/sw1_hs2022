package tza.ch.zhaw.bieriol2.uebung10;


public class Brief extends Lieferung{


	private boolean mitUnterschrift;
	
	public Brief(int plz, String empfaenger, boolean mitUnterschrift) {
		super(plz, empfaenger);
		if (mitUnterschrift)
		this.mitUnterschrift = mitUnterschrift;
	}
	
	public boolean isMitUnterschrift() {
		return this.mitUnterschrift;
	}
	
	public void print() {
		System.out.println();
		System.out.println("Brief");
		super.print();
		System.out.print("-Unterschrif: ");
		if (this.mitUnterschrift == true) {
			System.out.println("ja");
		}
		else {
			System.out.println("nein");
		}
		System.out.println();
	}

}
