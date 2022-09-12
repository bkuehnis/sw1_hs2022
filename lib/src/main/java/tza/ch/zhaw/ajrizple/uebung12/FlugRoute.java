package tza.ch.zhaw.ajrizple.uebung12;

import java.util.HashMap;
import java.util.Scanner;

public class FlugRoute {

	public static void main(String[] args) {
		HashMap<String,Flughafen> flughaefen = new HashMap<String,Flughafen>();
		
		flughaefen.put("HAM",new Flughafen("Hamburg","HAM"));
		flughaefen.put("AMS",new Flughafen("Amsterdam","AMS"));
		flughaefen.put("ZRH",new Flughafen("Zuerich","ZRH"));
		flughaefen.put("CDG",new Flughafen("Paris","CDG"));
		flughaefen.put("BER",new Flughafen("Berlin","BER"));
		flughaefen.put("MUC",new Flughafen("Muenchen","MUC"));
		flughaefen.put("FCO",new Flughafen("Rom","FCO"));
		
		flughaefen.get("HAM").addVerbindung(new  Verbindung(flughaefen.get("AMS"), 152));
		flughaefen.get("AMS").addVerbindung(new  Verbindung(flughaefen.get("HAM"), 301));
		flughaefen.get("AMS").addVerbindung(new  Verbindung(flughaefen.get("CDG"), 203));
		flughaefen.get("AMS").addVerbindung(new  Verbindung(flughaefen.get("ZRH"), 85));
		flughaefen.get("ZRH").addVerbindung(new  Verbindung(flughaefen.get("FCO"), 234));
		flughaefen.get("BER").addVerbindung(new  Verbindung(flughaefen.get("AMS"), 166));
		flughaefen.get("BER").addVerbindung(new  Verbindung(flughaefen.get("MUC"), 186));
		flughaefen.get("BER").addVerbindung(new  Verbindung(flughaefen.get("FCO"), 251));
		flughaefen.get("MUC").addVerbindung(new  Verbindung(flughaefen.get("BER"), 220));
		flughaefen.get("MUC").addVerbindung(new  Verbindung(flughaefen.get("CDG"), 186));
		flughaefen.get("FCO").addVerbindung(new  Verbindung(flughaefen.get("CDG"), 310));
		
		// Benutzereingaben
		Scanner keyScan = new Scanner(System.in);
		System.out.print("Abflug von: ");
		String from = keyScan.nextLine();
		System.out.print("Anzahl Zwischenlandungen: ");
		int stops = keyScan.nextInt();
		keyScan.close();
		
		if (flughaefen.containsKey(from)) {
			printVerbindungen(flughaefen.get(from),stops, "", 0.0);
		} else {
			System.out.println("Unbekannter Ausgansflughafen");
		}
	}
	
	static void printVerbindungen(Flughafen fromFlughafen, int stops, String path, double price) {
		path+= fromFlughafen.getName()+"  ";
		if(stops>0) {
			for(Verbindung v: fromFlughafen.getVerbindungen()) {
				printVerbindungen(v.getZiel(), stops-1, path, price+v.getPreis());
				
			}
		}else {
			String fligthPath=path;
			
			fromFlughafen.getVerbindungen().stream().forEach(v-> System.out.println(fligthPath+v.getZiel().getName()+": " +(price+v.getPreis())));
		}
	}
} 
