package tza.ch.zhaw.buerlxen.uebung10;

public class Brief extends Lieferung {

	private boolean mitUnterschrift;

	public Brief(int plz, String empfaenger, boolean mitUnterschrift) {
		super(plz, empfaenger);
		this.mitUnterschrift = mitUnterschrift;
	}
	
	public boolean istMitUnterschrift() {
		return mitUnterschrift;
	}
	
		public void print() {
			System.out.println("");
			System.out.println("Brief");
			System.out.println("Plz: " + getPlz());
			System.out.println("Empfänger: " + getEmpfaenger());
			if(mitUnterschrift)
			{
				System.out.println("Unerschrift: ja");
			}
			else
			{
				System.out.println("Unterschrift: nein");
			}
	}

}
