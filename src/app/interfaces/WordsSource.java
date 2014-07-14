package app.interfaces;

import app.models.Word;
import app.models.Category;

import java.io.FileNotFoundException;
import java.util.List;


public interface WordsSource {	
	public List<Word> getWords();
	public List<Category> getCategories();
}
