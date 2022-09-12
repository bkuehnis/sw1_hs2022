package tza.ch.zhaw.bieriol2.uebung1;

public class Rechner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double fzA = 5; // Länge von deinem Auto (Meter)
		double fzB = 5; // Länge des anderen Autos (Meter)
		double vA = 50; // Deine Geschwindigkeit (km/h)
		double vB = 30; // Geschwindigkeit des anderen Autos(km/h)

		double s1 = vA / 2; // Sicherheitsabstand ist immer die hälfte der Geschwindigkeit vom Auto A
		double s2 = vB / 2; // Sicherheitsabstand ist immer die hälfte der Geschwindigkeit vom Auto B

		double rs = fzA + s1 + fzB + s2; // Berechnung der relativen Strecke

		double rg = vA - vB; // Berechnung der relativen Geschwindigkeit
		double t = rs * 3.6 / rg; // Berechnung dauer zum Überholen
		double uw = t * vA / 3.6; // Berechnung Überholweg

		System.out.println("Geschwindigkeit A: " + vA);
		System.out.println("Geschwindigkeit B: " + vB);
		System.out.println("Länge A: " + fzA);
		System.out.println("Länge B: " + fzB);
		System.out.println("Sicherheitsabstand 1: " + s1);
		System.out.println("Sicherheitsabstand 2: " + s2);
		System.out.println("relative Strecke: " + rs + " Meter");
		System.out.println("relative Geschwindigkeit: " + rg + " km/h");
		System.out.println("Benötigte Zeit: " + t + " Sekunden");
		System.out.println("Überholweg: " + uw + " Meter");

	}

}
