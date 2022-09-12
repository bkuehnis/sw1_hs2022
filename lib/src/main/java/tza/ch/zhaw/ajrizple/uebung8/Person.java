package tza.ch.zhaw.ajrizple.uebung8;


public class Person {
	private String name;
	private String haarfarbe;
	private String augenfarbe;
	private boolean kurzeHaare;
	
	public Person (String name, String haarfarbe, boolean kurzeHaare, String augenfarbe) {
		this.name = name;
		this.haarfarbe = haarfarbe;
		this.augenfarbe = augenfarbe;
		this.kurzeHaare = kurzeHaare;
	}
	
	public String getName() {
		return name;
	}
	public String getHaarfarbe() {
		return haarfarbe;
	}
	public String getAugenfarbe() {
		return augenfarbe;
	}
	public boolean isKurzeHaare() {
		return kurzeHaare;
	}
	
	public void printPerson() {
		if (kurzeHaare) {
			System.out.println(name +" hat kurze " +haarfarbe +" Haare und "+augenfarbe+" Augen.");
		} else {
			System.out.println(name +" hat lange " +haarfarbe +" Haare und "+augenfarbe+" Augen.");
		}
	}
	
	public boolean stimmtHaarfarbe(String haarfarbe) {
		System.out.print(name +" hat "+ haarfarbe +"e Haare: ");		
		if (haarfarbe.equals(this.haarfarbe)) {
			return true;
		} else {		
			return false;
		}
	}
	
	public String schneideHaare () {
		System.out.print(name +"s Haare ");
		if (kurzeHaare) {
			return "sind bereits kurz.";
		}
		else {
			kurzeHaare = true;
			return "wurden geschnitten.";
			
		}
	}
	
	// Teilaufgabe f) -> gibt bei jeder Person die Merkmale als String zurück
	public String getMerkmaleAlsCsv() {
		if(kurzeHaare) {
			return ("kurze Haare, " +haarfarbe +"e Haare, " +augenfarbe +"e Augen");
		}
		return ("lange Haare, " +haarfarbe +"e Haare, " +augenfarbe +"e Augen");
		
	}
}
