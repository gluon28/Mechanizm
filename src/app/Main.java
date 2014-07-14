package app;

import java.util.List;
import java.util.Scanner;

import app.Words;
import app.models.Word;
import app.sources.words.File;

public class Main {
	private static List<Word> arrayOfWords;
	
	private static boolean check(Word word) {
		for(Word w: arrayOfWords)
			if(w.getWord().equals(word.getWord()))
				return true;
		return false;
	}
	
	public static void main(String[] args) {
		File source = new File();
		arrayOfWords = source.getWords();
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
			if(check(new Word(word)))
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
