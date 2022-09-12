package tza.ch.zhaw.buerlxen.uebung11;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import com.google.gson.*;

public class Main {

	public static void main(String[] args) {
		
		try {
			Scanner keyScan = new Scanner(System.in);
			FileReader reader = new FileReader("superheros.json",StandardCharsets.UTF_8);
			Gson gson = new GsonBuilder().create();
			Hero [] heros = gson.fromJson(reader, Hero[].class);
			
			System.out.println("Dashboard\n---------");
			System.out.println("Erfasste Superhelden und Superheldinnen: "+heros.length);
			System.out.println("\nSuperheld Nr. 10:");
			heros[9].print();
			
			// TODO: Weitere Ausgaben f僡 das Dashboard machen
			
			//a)
			long mCount = Stream.of(heros).filter(x -> x.getGender().equals("Male")).count();
			System.out.println("\nSuperhelden (Male): "+mCount);

			//b)
			System.out.println("\nSuperheldinnen mit roten Augen:");
			Stream.of(heros).filter(x -> x.getEyecolor().equals("red")).filter(x -> x.getGender().equals("Female")).forEach(y -> System.out.println(y.getName()));
			
			//c)
			long hColorCount = Stream.of(heros).map(x -> x.getHair()).distinct().count();
			System.out.println("\nAnzahl Haarfarben: "+hColorCount);
			
			//d)
			System.out.println("\nAlle Helden, die mit Y beginnen:");
			List<Hero> yList = Stream.of(heros).filter(x -> x.getName().startsWith("Y")).collect(Collectors.toList());
			for (Hero h: yList) {
			 System.out.println(h.getName()+" "+h.getHeight());
			}
			
			//e)
			System.out.println("\nY-Helden sortiert nach Gr飉se:");
			List<Hero> yListSorted = Stream.of(heros).sorted(Comparator.comparing(Hero::getHeight)).filter(x -> x.getName().startsWith("Y")).collect(Collectors.toList());
			
			for (Hero h: yListSorted) {
			System.out.println(h.getName()+" "+h.getHeight());
			}
			
			
			
			System.out.println("\nHero Finder\n-----------");
			
			// User Input
			System.out.println("Gender (Male, Female, ?)");
			String gender = keyScan.nextLine();
			System.out.println("Alignment (good, bad, neutral, ?)");
			String alignment = keyScan.nextLine();
			System.out.println("Hair color (Black, Blond, No Hair, ...)");
			String hairColor = keyScan.nextLine();
			System.out.println("Eye color (blue, green, red, ...)");
			String eyeColor = keyScan.nextLine();	
			
			// TODO: Held oder Heldin suchen und ausgeben
			
			List<Hero> heroList = Stream.of(heros).filter(x -> x.getGender().equalsIgnoreCase(gender))
					.filter(x -> x.getAlignment().equalsIgnoreCase(alignment))
					.filter(x -> x.getHair().equalsIgnoreCase(hairColor))
					.filter(x -> x.getEyecolor().equalsIgnoreCase(eyeColor))
					.collect(Collectors.toList());
			for (Hero h: heroList) {
			 System.out.println(h.getPublisher()+": "+h.getName());
			}
			
			keyScan.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
