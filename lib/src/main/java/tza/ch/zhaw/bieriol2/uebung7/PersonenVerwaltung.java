package tza.ch.zhaw.bieriol2.uebung7;

import java.util.ArrayList; 

public class PersonenVerwaltung {

	// erfasste personen (maximal 30)
	private Person[] personen = new Person[30];
	// aktuelle Anzahl erfasster Personen
	private int anzahl = 0;

	public int getAnzahl() {
		return this.anzahl;
	}

	public void addPerson(Person p) {
		this.personen[anzahl] = p;
		this.anzahl++;
	}

	public void printPersonen() {
		for (int i = 0; i < anzahl; i++) {
			personen[i].printPerson();
		}
	}

	public Person getPerson(int index) {
		if (personen[index] != null) {
			return personen[index];
		} else {
			return null;
		}

	}

	public Person getPerson(String name) {
		Person gesuchtesObjekt = null;
		for (int i = 0; i < anzahl; i++) {
			if (personen[i].getName().equals(name)) {
				gesuchtesObjekt = personen[i];
			}
		}
		return gesuchtesObjekt;
	}

	public int getAnzahlMitMerkmal(String merkmal) {
		int anzahlMitMerkmal = 0;
		for (int i = 0; i < anzahl; i++) {
			String merkmaleCSV = personen[i].getMerkmaleAlsCsv();
			if (merkmaleCSV.contains(merkmal)) {
				anzahlMitMerkmal++;
			}

		}
		return anzahlMitMerkmal;

	}

	public Person[] getAlleMitMerkmal(String merkmal) {
		int anzahlMitMerkmal = 0;
		ArrayList<Person> personenMitMerkmalList = new ArrayList<>();
	    
		for (int i = 0; i < anzahl; i++) {
			String merkmaleCSV = personen[i].getMerkmaleAlsCsv();
			if (merkmaleCSV.contains(merkmal)) {
				personenMitMerkmalList.add(personen[i]);
				anzahlMitMerkmal ++;
			}

		}
		Person[] personenMitMerkmal = personenMitMerkmalList.toArray(new Person[personenMitMerkmalList.size()]);
		return personenMitMerkmal;
	}

}