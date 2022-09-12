package tza.ch.zhaw.ajrizple.uebung2;
import java.util.Random;	
import java.util.Scanner;
	

public class Zufallszahl {
	public static void main(String[] args) {
		Scanner keyScan = new Scanner(System.in);
		Random rn = new Random();
			
		
		int zahl = rn.nextInt(101);
		
		System.out.println("Rate eine Zahl zwischen 0 und 100");
		int antwort = keyScan.nextInt();
		int anzahlantworten = 1;
		
		while (zahl!=antwort){
			
			if (antwort>zahl) {
				
			System.out.println("zu gross"); 
			 antwort = keyScan.nextInt();
			  anzahlantworten++;
			}else if (antwort<zahl) {
			System.out.println("zu klein");
		 antwort = keyScan.nextInt();
		  anzahlantworten++;

			
			}

		
}
		System.out.println("Richtig.  Du hast "  +anzahlantworten+ " Versuche benötigt." );
		keyScan.close();
		
	}}
