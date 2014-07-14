package app.models;

public class Word {
	private String word;
	public Word(String line) {
		word = line;
	}
	
	public char[] getChars() {
		return word.toCharArray();
	}
	
	public String getWord() {
		return word;
	}

}
