package tza.ch.zhaw.bieriol2.uebung6;


public class Person {
	private String name;
	private String haarfarbe;
	private boolean kurzeHaare;
	private String augenfarbe;

	public Person(String name, String haarfarbe, boolean kurzeHaare, String augenfarbe) {
		this.name = name;
		this.haarfarbe = haarfarbe;
		this.kurzeHaare = kurzeHaare;
		this.augenfarbe = augenfarbe;
	}

	public String getName() {
		return this.name;
	}

	public String getHaarfarbe() {
		return this.haarfarbe;
	}

	public boolean getKurzeHaare() {
		return this.kurzeHaare;
	}

	public String getAugenfarbe() {
		return this.augenfarbe;
	}

	public void printPerson() {
		if (kurzeHaare == true) {
			System.out.println(this.getName() + " hat kurze " + this.getHaarfarbe() + " Haare und "
					+ this.getAugenfarbe() + " Augen.");
		} else if (kurzeHaare == false) {
			System.out.println(this.getName() + " hat lange " + this.getHaarfarbe() + " Haare und "
					+ this.getAugenfarbe() + " Augen.");
		}
	}

	public boolean stimmtHaarFarbe(String haarfarbe) {
		if (this.getHaarfarbe().equals(haarfarbe)) {
			return true;
		} else {
			return false;
		}
	}
	
	public String schneideHaare() {
		if(this.getKurzeHaare() == false) {
			this.kurzeHaare = true;
			return this.getName() + " Haare wurden geschnitten.";
		}
		else {
			return this.getName() + " Haare sind bereits kurz.";
 		}
	}

}
