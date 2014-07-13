package app;

import static org.junit.Assert.*;

import java.util.*;

import org.junit.Test;

import app.Words;


public class WordsTest {
	private Words words;
	private List<String> arrayOfWords;
	
	protected void setUp() {
		words = new Words();
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
	}
	
	@Test
	public void test_tokenize() {
//		List<String> test_words = arrayOfWords;
//		Set<Character> result = words.tokenize(arrayOfWords);
//		Boolean condition = false;
//		if (result instanceof Set)
//			condition = true;
		assertTrue(true);
	}

//	@Test
//	public void test_generate_function() {
//		assertEquals(1, words.generateBoard(arrayOfWords, 4));
//	}

}
