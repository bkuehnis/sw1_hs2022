package tza.ch.zhaw.barakmil.uebung1;
public class Rechner {
	public static void main(String[] args) {
		
		double fzA = 5; // Länge von deinem Auto (Meter)
		double fzB = 5; // Länge des anderen Autos (Meter)
		
		double vA = 50; // Deine Geschwindigkeit (km/h)
		double vB = 30; // Geschwindigkeit des anderen Autos(km/h)
		
		double s1 = vA/2; // Sicherheitsabstand fzA
		double s2 = vB/2; // Sicherheitsabstand fzB
		
		double rS = fzA + fzB + s1 + s2; // Relative Strecke 
		double rG = vA - vB; // relative Geschwindigkeitsdifferenz
		
		double z = rS * 3.6 / rG ; // Benötigte Zeit für das Überholmanöver
		double uW = z * vA / 3.6; // Überholweg in Metern
		
		
		System.out.println("Geschwindigkeit A: " + vA);
		System.out.println("Geschwindigkeit B: " + vB);
		
		System.out.println("Länge A: " + fzA);
		System.out.println("Länge B: " + fzB);
		
		System.out.println("Sicherheitsabstand 1: " + s1);
		System.out.println("Sicherheitsabstand 2: " + s2);
		
		System.out.println("Relative Strecke: " + rS + " Meter");
		
		System.out.println("Relative Geschwindigkeit: " + rG + " km/h");
		System.out.println("Benötigte Zeit: " + z + " Sekunden");
		System.out.println("Ueberholweg: " + uW + " Meter");
	}
}