package tza.ch.zhaw.ajrizple.uebung7;


public class PersonenVerwaltung {

	private Person [] personen = new Person[30];  
	
	private int anzahl = 0;

	
	public int getAnzahl () {
		return anzahl;
		
			
	
	}
	public void addPerson (Person p) {
		personen[anzahl]=p;
		anzahl++;
	}
	
	public void printPersonen() {
		for(int i=0; i<anzahl; i++) {
		personen[i].printPerson();	
		}
				
	}
	public Person getPerson(int index) {
		if (index>personen.length) {
			return null;
		
		}else {
			return personen[index];
		}
		
			
				}
	public Person getPerson(String name) {
		for(int i=0; i<anzahl; i++) {
			if (personen[i].getName().equals(name)) {
				return personen[i];
			}
		}
		return null;
	}
	public int getAnzahlMitMerkmal(String merkmal) {
		int merkmalCounter=0;
		for (int i=0; i<anzahl; i++) {
			if(personen[i].getMerkmaleAlsCsv().contains(merkmal)) {
				merkmalCounter++;
			}
		}
		return merkmalCounter;
	}
	
}
