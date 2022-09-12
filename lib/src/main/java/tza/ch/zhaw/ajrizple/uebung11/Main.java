package tza.ch.zhaw.ajrizple.uebung11;

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
			//aufgabe a Dashbi)
			long mCount = Stream.of(heros).filter(x-> x.getGender().equals("Male")).count();
			System.out.println("\nSuperhelden (Male): " +mCount);
			
			//aufgabe b dashbi)
			
			System.out.println("\nSuperheldinnen mit roten Augen:");
			
			Stream.of(heros).filter(x-> (x.getGender().equals("Female")&&x.getEye().equals("red"))).forEach(x-> System.out.println(x.getName()));
			
			//aufgabe c dashbi)
				long hColorCount =  Stream.of(heros).map(Hero::getHair).distinct().count();
			
			System.out.println("Anzahl Haarfarben: "+hColorCount);
			
			//aufgabe d dashbi)
			System.out.println("\nAlle Helden, die mit Y beginnen: ");
			List<Hero> yList=Stream.of(heros).filter(x-> x.getName().startsWith("Y")).collect(Collectors.toList());
			
			for (Hero h: yList) {
				 System.out.println(h.getName()+" "+h.getHeight());
				}
 //aufgabe e dashbi)
			
			System.out.println("\nY-Helden sortiert nach Gr飉se:");
			List<Hero> yListSorted = Stream.of(heros).filter(x-> x.getName().startsWith("Y")).sorted(Comparator.comparing(Hero::getHeight)).collect(Collectors.toList());
		
					for (Hero h: yListSorted) {
			System.out.println(h.getName()+" "+h.getHeight());
			}
			
			//
			
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
	 Stream.of(heros).filter(x-> x.getGender().equals(gender)).filter(x->x.getAlignment().equals(alignment)).filter(x->x.getHair().equals(hairColor)).filter(x-> x.getEye().equals(eyeColor)).forEach(x->System.out.println(x.getPublisher()+": "+x.getName()));
			
			
			keyScan.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
