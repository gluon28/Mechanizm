package app;

import java.io.IOException;
import java.util.*;

import app.models.Word;

public class Words {
	
	/**
	 * Generuje plansze z literami. 
	 * @param words lista słów
	 * @param boardSize długośc kwadratu
	 * @return
	 * @throws Exception 
	 */
	public int generateBoard(List<Word> words, int boardSize) throws Exception {
		if(boardSize <= 0)
			throw new Exception();
		return 1;
	}
	
	/**
	 * Funkcja zwracająca zbiór niepowtarzających się znaków 
	 * tworzona na podstawie listy słów.
	 * @param list lista słów
	 * @return zbiór niepowtarzjącyc się znaków (bez spacji)
	 */
	public Set<Character> tokenize(List<Word> list) {
		Set<Character> result = new HashSet<Character>();
		for(Word word: list){
			for(Character c: word.getChars()) {
				if (c != ' ')
					result.add(c);
			}
		}
		return result;
	}
}
