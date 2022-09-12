package tza.ch.zhaw.bieriol2.uebung12;

import java.util.ArrayList;

public class Flughafen {

	private String name;
	private String kuerzel;
	private ArrayList<Verbindung> verbindungen = new ArrayList<Verbindung>();
	
	public Flughafen(String name, String kuerzel) {
		this.name = name;
		this.kuerzel = kuerzel;
	}
	
	public void addVerbindung(Verbindung v) {
		verbindungen.add(v);
	}
	
	public void print() {
		System.out.println(getName() + ": " + getKuerzel());
		verbindungen.stream().forEach(v -> System.out.println(" - " + v.getZiel().getName() + ": " + v.getPreis()));
	}
	
	public String getName() {
		return name;
	}
	public String getKuerzel() {
		return kuerzel;
	}
	public ArrayList<Verbindung> getVerbindungen() {
		return verbindungen;
	}
	
}
