package tza.ch.zhaw.bieriol2.uebung8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SpielWerIstEs {

	public static void main(String[] args) {
		PersonenVerwaltung pv = new PersonenVerwaltung();
		Random rn = new Random();
		Scanner keyScan = new Scanner(System.in);

		pv.addPerson(new Person("Tom", "schwarz", true, "blau"));
		pv.addPerson(new Person("Alex", "schwarz", true, "braun"));
		pv.addPerson(new Person("Maria", "braun", false, "braun"));
		pv.addPerson(new Person("Robert", "braun", true, "blau"));
		pv.addPerson(new Person("Bernard", "braun", true, "braun"));
		pv.addPerson(new Person("Anita", "blond", false, "blau"));
		pv.addPerson(new Person("David", "blond", true, "blau"));
		pv.addPerson(new Person("Charles", "blond", true, "braun"));
		pv.addPerson(new Person("Alfred", "rot", false, "blau"));
		pv.addPerson(new Person("Frans", "rot", true, "blau"));
		pv.addPerson(new Person("Bill", "rot", true, "braun"));
		
		
		ArrayList<ArrayList<String> > kategorien = new ArrayList<ArrayList<String>>();
		ArrayList<String> haarlaenge = new ArrayList<>(Arrays.asList("kurze Haare", "lange Haare"));
		ArrayList<String> haarfarbe = new ArrayList<>(Arrays.asList("braune Haare", "schwarze Haare", "blonde Haare"));
		ArrayList<String> augenfarbe = new ArrayList<>(Arrays.asList("blaue Augen", "braune Augen"));
		kategorien.add(haarlaenge);
		kategorien.add(haarfarbe);
		kategorien.add(augenfarbe);
		
		
		System.out.println("Wähle eine Person:");
		
		while (pv.getAnzahl() > 1) {
			int randomKategorie = rn.nextInt(kategorien.size());
			int randomMerkmal = rn.nextInt(kategorien.get(randomKategorie).size());
			String merkmal = kategorien.get(randomKategorie).get(randomMerkmal);
			ArrayList<Person> personenMitMerkmal = pv.getAlleMitMerkmal(merkmal);
			System.out.println("Hast du " + merkmal + "?");
			if (keyScan.nextLine().equals("ja")) {
				pv.removePersonenNichtInListe(personenMitMerkmal);
				kategorien.remove(randomKategorie);
			} else {
				pv.removePersonenInListe(personenMitMerkmal);
				if(kategorien.get(randomKategorie).size()>2) {
					kategorien.get(randomKategorie).remove(randomMerkmal);	
				}
				else {
					kategorien.remove(randomKategorie);
				}
				
			}
			
		}

		System.out.println("Du bist " + pv.getPerson(0).getName());
		keyScan.close();
	}
}
