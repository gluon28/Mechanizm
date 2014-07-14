package tests.app.words;

import java.util.Set;

import org.junit.Test;

public class GenerateBoardTest extends WordsTestBase {
	@Test
	public void test_generate_method() throws Exception {
		words.generateBoard(arrayOfWords, 4);
		assertTrue(true);
	}
	
	@Test
	public void test_generate_zero_size() throws Exception {
		try {
			words.generateBoard(arrayOfWords, 0);
			fail();
		} catch(Exception expected) {
			assertTrue(expected instanceof Exception);
		}
	}
}
