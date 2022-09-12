package tza.ch.zhaw.bieriol2.uebung3;

import ch.zhaw.lib.ZhawCsvLib;
public class Pegelrechner {
	public static void main(String[] args) {
		// Daten Einlesen
		double startWert = 50000;
		double schadensgrenze = 61500;
		double[] zufluss1 = ZhawCsvLib.readDoubleArray("zufluss1.csv");
		double[] zufluss2 = ZhawCsvLib.readDoubleArray("zufluss2.csv");
		double[] abfluss1 = ZhawCsvLib.readDoubleArray("abfluss1.csv");
		double[] WasserMengeOhneAbfluss = new double[zufluss1.length + 1];
		double[] WasserMengeMitAbfluss = new double[zufluss1.length + 1];
		double MaxWertOhneAbfluss = 0;
		double MaxWertMitAbfluss = 0;
		int StundenErhöhtOhneAbfluss = 0;
		int StundenErhöhtMitAbfluss = 0;

		// Länge der Datensätze ausgeben
		System.out.println("Werte Zufluss 1: " + zufluss1.length);
		System.out.println("Werte Zufluss 2: " + zufluss2.length);
		System.out.println("Werte Abfluss 1: " + abfluss1.length);

		// TODO
		WasserMengeOhneAbfluss[0] = startWert;
		WasserMengeMitAbfluss[0] = startWert;
		for (int i = 1; i < WasserMengeOhneAbfluss.length; i++) {
			if (WasserMengeMitAbfluss[i-1] > 55000) {
				WasserMengeMitAbfluss[i] = WasserMengeMitAbfluss[i - 1] + (zufluss1[i - 1] + zufluss2[i - 1] - abfluss1[i - 1] - 4) * 60;
				WasserMengeOhneAbfluss[i] = WasserMengeOhneAbfluss[i - 1] + (zufluss1[i - 1] + zufluss2[i - 1] - abfluss1[i - 1]) * 60;
			} else {
				WasserMengeMitAbfluss[i] = WasserMengeMitAbfluss[i - 1] + (zufluss1[i - 1] + zufluss2[i - 1] - abfluss1[i - 1]) * 60;
				WasserMengeOhneAbfluss[i] = WasserMengeOhneAbfluss[i - 1] + (zufluss1[i - 1] + zufluss2[i - 1] - abfluss1[i - 1]) * 60;
			}
		}

		for (int i = 0; i < WasserMengeOhneAbfluss.length; i++) {
			if (WasserMengeOhneAbfluss[i] > MaxWertOhneAbfluss) {
				MaxWertOhneAbfluss = WasserMengeOhneAbfluss[i];
			}
			if (WasserMengeOhneAbfluss[i] > schadensgrenze) {
				StundenErhöhtOhneAbfluss += 1;
			}
			if (WasserMengeMitAbfluss[i] > MaxWertMitAbfluss) {
				MaxWertMitAbfluss = WasserMengeMitAbfluss[i];
			}
			if (WasserMengeMitAbfluss[i] > schadensgrenze) {
				StundenErhöhtMitAbfluss += 1;
			}
		}

		ZhawCsvLib.writeDoubleArray("ohneStollen.csv", WasserMengeOhneAbfluss);
		ZhawCsvLib.writeDoubleArray("mitStollen.csv", WasserMengeMitAbfluss);

		System.out.println("Maximaler Füllstand mit Stollen: " + MaxWertMitAbfluss + " m3");
		System.out.println("Zeit über Schadensgrenze: "  + StundenErhöhtMitAbfluss + " h");
		System.out.println("Maximaler Füllstand ohne Stollen: " + MaxWertOhneAbfluss + " m3");
		System.out.println("Zeit über Schadensgrenze: " + StundenErhöhtOhneAbfluss + " h");
		
	}
}