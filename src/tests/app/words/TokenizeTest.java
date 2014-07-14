package tests.app.words;

import static org.junit.Assert.*;

import java.util.*;

import junit.framework.TestCase;

import org.junit.Test;

import app.Words;

public class TokenizeTest extends WordsTestBase {

	/**
	 * Zwraca wynik który jest zbiorem liter. 
	 * Typ ``Set`` gwarantuje unikalność.
	 */
	@Test
	public void test_result_type_tokenize() {
		Set<Character> result = words.tokenize(arrayOfWords);
		assertTrue(result instanceof Set);
	}
	
	/**
	 * Białe znaki są usuwane.
	 */
	@Test
	public void test_tokenize_strip_whitespace() {
		Set<Character> result = words.tokenize(arrayOfWords.subList(9, 10));
		for(Character c: result) {
			assertTrue(c != ' ');
		}
	}
}
