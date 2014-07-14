package app.sources.words;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import app.interfaces.WordsSource;
import app.models.Category;
import app.models.Word;

public class File implements WordsSource {
	private List<Word> words;
	
	public File() {
		words = new ArrayList<Word>();
	}
	
	private void fetchWordsFromFile(String filename) {
		try {
			BufferedReader reader = new BufferedReader(new FileReader(filename));
			String line;
		    while ((line = reader.readLine()) != null)
		    {
		    	words.add(new Word(line));
		    }
		    reader.close();
		}catch(Exception e) {
			System.err.format("Exception occurred trying to read '%s'.", filename);
			e.printStackTrace();
		}
	}
	
	@Override
	public List<Word> getWords() {
		if(words.isEmpty())
			fetchWordsFromFile("data/sources/words.txt");
		return words;
	}

	@Override
	public List<Category> getCategories() {
		// TODO Auto-generated method stub
		return null;
	}

}
