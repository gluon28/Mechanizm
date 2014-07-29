package tests.app.words;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import app.Words;
import app.models.Word;
import app.sources.words.File;
import junit.framework.TestCase;

public class WordsTestBase extends TestCase {
	protected List<Word> arrayOfWords;
	protected Words words; 
	
	@Override
	public void setUp() {
		words = new Words();
		File source = new File();
		arrayOfWords = source.getWords();
	}
}
