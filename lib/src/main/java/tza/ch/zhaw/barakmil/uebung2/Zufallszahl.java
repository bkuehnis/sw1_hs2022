package tza.ch.zhaw.barakmil.uebung2;
import java.util.Random; 
import java.util.Scanner; 
 
public class Zufallszahl { 
 
  public static void main(String[] args) {
 
 Scanner keyScan = new Scanner(System.in); 
 Random rn = new Random(); 
 
 int zahl = rn.nextInt(101); 
 int antwort = 0;
 int versuche = 0;
 
 while (antwort != zahl) {
	 System.out.println("Rate eine Zahl zwischen 0 und 100");  
	 antwort = keyScan.nextInt();
	 versuche++;
	 
	 if (antwort < zahl) {
		 System.out.println("Zu klein" );
	 	}
	 if (antwort > zahl) {
		 System.out.println("Zu gross" );
	 	}
	 if (antwort == zahl) {
		 System.out.println("Richtig. Du hast " +versuche+ " Versuche ben—tigt." );  
	 	}
 	}
 	keyScan.close();
  }
} 
