package tests.app.words;

import java.util.List;

import app.models.Word;
import app.sources.words.File;
import junit.framework.TestCase;

import org.junit.Test;

public class TestFileSource extends TestCase {
	private File source;
	
	public void setUp(){
		source = new File();
	}
	
	@Test
	public void test_read() {
		List<Word> words = source.getWords();
		assertTrue(words.size() == 10);
	}
}
