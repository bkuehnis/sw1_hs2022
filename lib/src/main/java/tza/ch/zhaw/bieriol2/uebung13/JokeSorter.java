package tza.ch.zhaw.bieriol2.uebung13;

import java.io.FileWriter;
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
		var client = HttpClient.newHttpClient();
		Gson gson = new GsonBuilder().create();
		Scanner keyScan = new Scanner(System.in);
		String answer = null;

		var request = HttpRequest.newBuilder().uri(URI.create("https://v2.jokeapi.dev/joke/Any?safe-mode")).GET()
				.build();

		try {
			// query joke
			var res = client.send(request, HttpResponse.BodyHandlers.ofString());
			String output = null;
			FileWriter goodjokesWriter = new FileWriter("goodjokes.txt",StandardCharsets.UTF_8,true);
			FileWriter badjokesWriter = new FileWriter("badjokes.txt",StandardCharsets.UTF_8,true);
			Joke joke = gson.fromJson(res.body(), Joke.class);

			if (joke.getType().equals("twopart")) {
				output = "A: " + joke.getSetup() + "\n" + "B: " + joke.getDelivery();

			} else if (joke.getType().equals("single")) {
				output = joke.getJoke();

			}
			System.out.println(output);
			System.out.print("Is this joke good? (y/n):");
			answer = keyScan.nextLine();

			if (answer.equals("y")) {
				goodjokesWriter.write(joke.getCategory() + ":" + "\n" + output + "\n\n");
				goodjokesWriter.close();
			} else {
				badjokesWriter.write(joke.getCategory() + ":" + "\n" + output + "\n\n");
				badjokesWriter.close();
			}

		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
