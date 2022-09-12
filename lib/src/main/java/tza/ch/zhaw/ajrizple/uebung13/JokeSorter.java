package tza.ch.zhaw.ajrizple.uebung13;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class JokeSorter {

	public static void main(String[] args) {

		Joke joke = getJokeViaHttp();
		if (joke != null) {
			// print joke
			joke.print();

			// get user input if user liked it
			Scanner keyScan = new Scanner(System.in);
			System.out.print("Is this joke good? (y/n): ");
			String userFeedback = keyScan.nextLine();
			keyScan.close();

			// save joke to file based on user input
			writeJokeToFile(userFeedback, joke);
		}

	}

	public static void writeJokeToFile(String userFeedback, Joke joke) {
		try {
			String fileName = "generalJokes.txt";
			if (userFeedback.equalsIgnoreCase("y")) {
				fileName = "goodjokes.txt";
			} else if (userFeedback.equalsIgnoreCase("n")) {
				fileName = "badjokes.txt";
			}
			FileWriter writer = new FileWriter(fileName, StandardCharsets.UTF_8, true);
			writer.write(joke.getCategory() + "\n");
			writer.write(joke.getJoke() + "\n");
			writer.write("\n");
			writer.close();
			
			System.out.println("Joke written to " + fileName);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static Joke getJokeViaHttp() {
		var client = HttpClient.newHttpClient();
		Gson gson = new GsonBuilder().create();
		Scanner keyScan = new Scanner(System.in);

		var request = HttpRequest.newBuilder().uri(URI.create("https://v2.jokeapi.dev/joke/Any?safe-mode")).GET()
				.build();

		try {
			// query joke
			var res = client.send(request, HttpResponse.BodyHandlers.ofString());
			Joke joke = gson.fromJson(res.body(), Joke.class);
			return joke;

		} catch (Exception e) {
			System.out.println(e);
		}
		return null;
	}
}
