package tza.ch.zhaw.bieriol2.uebung9;

import java.util.HashMap;

public class Flight {
	private String flightNumber;
	private HashMap<String,Insasse> insassen = new HashMap<String,Insasse>();

	public Flight(String flightNumber) { 
		this.flightNumber = flightNumber;
	}
	
	// TODO: ergaenzen
	
	public String getFlightNumber() {
		return this.flightNumber;
	}
	
	public void addInsasse(String id, Insasse insasse) {
		insassen.put(id, insasse);
	}
	
	public Insasse getInsasse(String id) {
		return this.insassen.get(id);
	}
	
	public boolean hasInsasse(String id) {
		Insasse searchedInsasse = this.insassen.get(id);
		if (searchedInsasse != null) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void printInsassen() {
		for (Insasse i: this.insassen.values()) {
			i.print();
		}
	}
	
	public void printInsassenWithId() {
		for (String id: this.insassen.keySet()) {
			System.out.print(id + ": ");
			insassen.get(id).print();
		}
		
	}

}
