package app;

import java.util.ArrayList;
import java.util.Scanner;

import app.Words;

public class Main {
	private static ArrayList<String> arrayOfWords;
	
	public static void main(String[] args) {
		arrayOfWords = new ArrayList<String>(10);
		arrayOfWords.add("blender");
		arrayOfWords.add("cooker");
		arrayOfWords.add("glass");
		arrayOfWords.add("oven");
		arrayOfWords.add("plate");
		arrayOfWords.add("sink");
		arrayOfWords.add("spoon");
		arrayOfWords.add("toaster");
		arrayOfWords.add("fork");
		arrayOfWords.add("microwave oven");
		Words words = new Words();
		System.out.println(words.tokenize(arrayOfWords));
		System.out.println(words.tokenize(arrayOfWords).size());
		
		Scanner scan = new Scanner(System.in);
		String word;
		int points = 0;
		long start = System.currentTimeMillis();
		do
		{
			word = scan.next();
			if(arrayOfWords.contains(word))
				points++;
			System.out.println("Suma zgromadzonych pkt: " + points);
			if(points == arrayOfWords.size()) {
				System.out.println("You win!");
				System.out.println("Your time is " + ((System.currentTimeMillis() - start) / 1000) + " sec.");
				break;
			}
		}while(word.compareTo("quit") != 0);

	}

}
