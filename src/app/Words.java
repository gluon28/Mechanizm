package app;

import java.io.IOException;
import java.util.*;

public class Words {
	
	/**
	 * Generuje plansze z literami. 
	 * @param words lista słów
	 * @param boardSize długośc kwadratu
	 * @return
	 * @throws Exception 
	 */
	public int generateBoard(List<String> words, int boardSize) throws Exception {
		if(boardSize <= 0)
			throw new Exception();
		return 1;
	}
	
	/**
	 * Funkcja zwracająca zbiór niepowtarzających się znaków 
	 * tworzona na podstawie listy słów.
	 * @param words lista słów
	 * @return zbiór niepowtarzjącyc się znaków (bez spacji)
	 */
	public Set<Character> tokenize(List<String> words) {
		Set<Character> result = new HashSet<Character>();
		for(String word: words){
			for(Character c: word.toCharArray()) {
				if (c != ' ')
					result.add(c);
			}
		}
		return result;
	}
}
