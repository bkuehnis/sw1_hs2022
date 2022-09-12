package tza.ch.zhaw.ajrizple.uebung7;

public class Person {
	private String name;
	private String haarfarbe;
	private boolean kurzeHaare;
	public void setName(String name) {
		this.name = name;
	}

	public void setHaarfarbe(String haarfarbe) {
		this.haarfarbe = haarfarbe;
	}

	public void setKurzeHaare(boolean kurzeHaare) {
		this.kurzeHaare = kurzeHaare;
	}

	public void setAugenfarbe(String augenfarbe) {
		this.augenfarbe = augenfarbe;
	}

	private String augenfarbe;



	public Person(String name, String haarfarbe, boolean kurzeHaare, String augenfarbe) {
		
		this.name = name;
		this.haarfarbe = haarfarbe;
		this.kurzeHaare = kurzeHaare;
		this.augenfarbe = augenfarbe;
	}

	public String schneideHaare() {
		if (kurzeHaare) {
			return name + "s Haare sind bereits kurz.";
		} else {
			return name + "s Haare wurden geschnitten.";
		}
	}

	public boolean stimmtHaarfarbe(String haarfarbe) {

		if (this.haarfarbe.equals(haarfarbe)) {
			return true;
		} else {
			return false;

		}
	}

	public void printPerson() {
		if (kurzeHaare = true) {
			System.out.println(name + " hat kurze " + haarfarbe + "e Haare und " + augenfarbe + "e Augen.");
		} else {
			System.out.println(name + " hat lange " + haarfarbe + "e Haare und " + augenfarbe + "e Augen.");

		}
	}

	public String getName() {
		return name;

	}

	public String getHaarfarbe() {
		return haarfarbe;
	}

	public boolean isKurzeHaare() {
		return kurzeHaare;
	}

	public String getAugenfarbe() {
		return augenfarbe;
	}

	public String getMerkmaleAlsCsv() {
		String Haarlaenge = "lange";
		if (kurzeHaare) {
			Haarlaenge = "kurze";
		}
		return Haarlaenge + " Haare, " + haarfarbe + "e Haare, " + augenfarbe + "e Augen";

	}
}
