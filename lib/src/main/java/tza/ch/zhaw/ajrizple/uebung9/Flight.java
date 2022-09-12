package tza.ch.zhaw.ajrizple.uebung9;

import java.util.HashMap;

public class Flight implements Insasse {
	private String flightNumber;
	private HashMap<String,Insasse> insassen = new HashMap<String,Insasse>();

	public Flight(String flightNumber) { 
		this.flightNumber=flightNumber;
	}
	
	public String getFlightNumber() {
		return flightNumber;
	}
	
	public void addInsasse(String id, Insasse insasse) {
		insassen.put(id, insasse);
	}
	
	public Insasse getInsasse(String id) {
		if(insassen.get(id) != null) {
			return insassen.get(id);
		}else {
			return null;
		}
	}
public boolean hasInsasse(String id) {
	if(insassen.get(id) != null) {
		return true;
	}else {
		return false;
	}
}

public void printInsassen() {
	for(Insasse s: insassen.values()) {
		s.print();
	}
}

public void printInsassenWithId() {
	for (String s: insassen.keySet()) {
		Insasse insasse = insassen.get(s);
		System.out.print(s+": ");
		insasse.print();
	}
}

@Override
public String getName() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public void print() {
	// TODO Auto-generated method stub
	
}



}
