package Monday;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;

import org.junit.Test;

public class WordsCounterTest {

	@Test
	public void testWordsCounter() throws IOException {
		File file = new File("/home/toni/words");
		WordsCounter words = new WordsCounter(6, 3, 14);
		assertEquals(words, WordsCounter.wordsCount(file));
	}

}
