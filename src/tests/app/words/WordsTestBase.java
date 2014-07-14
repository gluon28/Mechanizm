package tests.app.words;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import app.Words;
import junit.framework.TestCase;

public class WordsTestBase extends TestCase {
	protected List<String> arrayOfWords;
	protected Words words; 
	
	@Override
	public void setUp() {
		words = new Words();
		arrayOfWords = Arrays.asList(
			"blender", "cooker", "glass", "ovzen", 
			"plate", "sink", "spoon", "toaster", "fork", "microwave oven"
		);
	}
}
