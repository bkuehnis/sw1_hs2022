package tza.ch.zhaw.ajrizple.uebung3;

import ch.zhaw.lib.ZhawCsvLib;

public class PegelRechner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double startWert = 50000;
		double schadensgrenze = 61500;
		double[] zufluss1 = ZhawCsvLib.readDoubleArray("zufluss1.csv");
		double[] zufluss2 = ZhawCsvLib.readDoubleArray("zufluss2.csv");
		double[] abfluss1 = ZhawCsvLib.readDoubleArray("abfluss1.csv");

		System.out.println("Werte Zufluss 1: " + zufluss1.length);
		System.out.println("Werte Zufluss 2: " + zufluss2.length);
		System.out.println("Werte Abfluss 1: " + abfluss1.length);

		double[] wasserImSee = new double[120];

		wasserImSee[0] = startWert;
		System.out.println("Wasser im See: " + wasserImSee[0] + " m3");
		double max = wasserImSee[0];
		double anzahlueberstundenfluss = 0;
		double abflussstollen = 0;
		for (int i = 1; i < wasserImSee.length; i++) {
			wasserImSee[i] = wasserImSee[i - 1] + (zufluss1[i - 1] + zufluss2[i - 1] - abfluss1[i - 1]- abflussstollen) * 60;
			System.out.println("Wasser im See: " + wasserImSee[i] + " m3");
			if (wasserImSee[i] > max) {
				max = wasserImSee[i];
			}
			if(wasserImSee[i]>schadensgrenze) {
			anzahlueberstundenfluss++;
			}
			
			if (wasserImSee[i]>55000) {
				abflussstollen=4;
			}else {
				abflussstollen =0;
			}
			

		}

		System.out.println("Maximaler Füllstand: " + max + " m3");
		
		
		System.out.println("Anzahl Ueberstunden: " +anzahlueberstundenfluss+ " h");
		ZhawCsvLib.writeDoubleArray("ohneStollen.csv", wasserImSee);
		ZhawCsvLib.writeDoubleArray("mitstollen.csv", wasserImSee);
		
	}

}
