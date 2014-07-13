package app;

import java.util.*;

public class Words {
	
	public int generateBoard(List<String> words, int boardSize) {
		return 1;
	}
	
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
