package tza.ch.zhaw.bieriol2.uebung8;

import java.util.ArrayList;

public class PersonenVerwaltung {

	private ArrayList<Person> personen = new ArrayList<Person>();

	public int getAnzahl() {
		return this.personen.size();
	}

	public void addPerson(Person p) {
		this.personen.add(p);

	}

	public void printNamen() {
		for (Person person : this.personen) {
			System.out.println(person.getName());
		}

	}

	public void printPersonen() {
		for (Person person : this.personen) {
			person.printPerson();
		}
	}

	public Person getPerson(int index) {
		if (index < this.personen.size()) {
			return this.personen.get(index);
		}
		return null;

	}

	public Person getPerson(String name) {
		for (Person person : this.personen) {
			if (person.getName().equals(name)) {
				return person;
			}
		}
		return null;
	}

	public ArrayList<Person> getAlleMitMerkmal(String merkmal) {
		ArrayList<Person> alleMitMerkmal = new ArrayList<Person>();
		for (Person person : this.personen) {
			String merkmale = person.getMerkmaleAlsCsv();
			if (merkmale.contains(merkmal)) {
				alleMitMerkmal.add(person);
			}
		}
		return alleMitMerkmal;
	}

	public void removePersonenInListe(ArrayList<Person> toRemove) {
		for (Person removeObject : toRemove) {
			personen.remove(removeObject);
		}

	}

	public void removePersonenNichtInListe(ArrayList<Person> notToRemove) {
		for (int i = 0; i < personen.size(); i++) {
			boolean delete = true;
			for (int x = 0; x < notToRemove.size(); x++) {
				if (notToRemove.get(x) == personen.get(i)) {
					x = notToRemove.size();
					delete = false;
				}
			}
			if (delete == true) {
				personen.remove(i);
				i--;
			}
		}

	}

}
