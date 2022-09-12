package tza.ch.zhaw.ajrizple.uebung1;

public class Rechner {

	public static void main(String[] args) {

		double fzA = 5;
		double fzB = 5;
		double vA = 50;
		double vB = 30;
		
		System.out.println("Geschwindigkeit A: "+vA);
		System.out.println("Geschwindigkeit B: "+vB);
		System.out.println("Länge A: "+fzA);
		System.out.println("Länge B: "+fzB);
		
		double se = vA / 2;
		double sz = vB / 2;
		
		System.out.println("Sicherheitsabstand 1: "+se);
		System.out.println("Sicherheitsabstand 2: "+sz);
		
		double strecke = fzA + se + fzB + sz;
		
		System.out.println("Relative Strecke: "+ strecke + " Meter");
		
		double gdiff = vA - vB;
		
		System.out.println("Relative Geschwindigkeit: "+gdiff+ " km/h");
		
		double bz = strecke * 3.6 / gdiff;
		
		System.out.println("Benötigte Zeit: "+bz+ " Sekunden");
		
		double uw = bz * vA / 3.6;
		
		System.out.println("Ueberholweg: " +uw+ " Meter");
	}

}
