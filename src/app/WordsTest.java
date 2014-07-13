package app;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import app.Words;

public class WordsTest {

	@Test
	public void test_generate_function() {
		Words words = new Words();
		List<String> arrayOfWords = new ArrayList<String>(10);
		arrayOfWords.add("Ala");
		assertEquals(1, words.generateBoard(arrayOfWords, 4));
	}

}
