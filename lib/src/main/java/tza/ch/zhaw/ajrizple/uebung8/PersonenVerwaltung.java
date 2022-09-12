package tza.ch.zhaw.ajrizple.uebung8;

import java.util.ArrayList;

public class PersonenVerwaltung {

	private ArrayList<Person> personen = new ArrayList<Person>();  

	
	
	public int getAnzahl() {
	int anzahl =0;
		for(Person p: personen) {
			anzahl++;
		}
		return anzahl;
	}

	public void addPerson(Person P) {
		personen.add(P);
	}
	
	public void printNamen() {
		for (Person p: personen) {
	System.out.println(p.getName());
}
}
	
	public void printPersonen() {
		for (Person p: personen) {
			p.printPerson();
		}
	}
	
	public Person getPerson(int index) {
		try { return personen.get(index);
			
		}catch (Exception e) {
			return null;
		}
		
	}
	
	public Person getPerson(String name) {
		for (Person p: personen) {
			if(p.getName().equals(name)) {
				return p;
			}}
		return null;
			
		
	}
	
	public ArrayList<Person> getAlleMitMerkmal(String merkmal) {
		
		 ArrayList<Person> personenm = new ArrayList<>();
		
		for (Person p: personen) {
			String merkmale=p.getMerkmaleAlsCsv();
			if(merkmale.contains(merkmal)) {
				personenm.add(p);
			}
		}
			return personenm;
		}
		
		
	
	
	public void removePersonenInListe(ArrayList<Person> toRemove) {
		for (Person p: toRemove) {
			personen.remove(p);
		}
	}
	
	public void removePersonenNichtInListe(ArrayList<Person> notToRemove) {
		personen=notToRemove;
	}

	
}
