package tza.ch.zhaw.bieriol2.uebung2;
import java.util.Random;
import java.util.Scanner;

public class ZahlenRaten {
	public static void main(String[] args) {
		Scanner keyScan = new Scanner(System.in);
		Random rn = new Random();
		int zahl = rn.nextInt(101);
		System.out.println("Rate eine Zahl zwischen 0 und 100");
		int new_zahl = keyScan.nextInt();
		int count = 0;
		while (zahl != new_zahl) {
			if (new_zahl < zahl) {
				System.out.println("zu klein");
			}
			else if (new_zahl > zahl) {
				System.out.println("zu gross");
			}
			new_zahl = keyScan.nextInt();
			count ++;
		}
		System.out.println("Richtig. Du hast "+count+" Versuche benötigt.");
	}
}
