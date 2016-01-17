package Monday;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class WordsCounter {
	private int words;
	private int lines;
	private int characters;

	public WordsCounter(int w, int l, int c) {
		words = w;
		lines = l;
		characters = c;
	}

	public static WordsCounter wordsCount(File file) throws IOException {
		BufferedReader buf = null;
		int linesCount = 0;
		int wordsCount = 0;
		int charsCount = 0;
		try {
			buf = new BufferedReader(new FileReader(file));
			String line;
			while ((line = buf.readLine()) != null) {
				linesCount++;
				String[] temp = line.split(" ");
				wordsCount += temp.length;
				charsCount += numberOfCharsInWord(temp);
			}
		} finally {
			buf.close();
		}
		return new WordsCounter(wordsCount, linesCount, charsCount);
	}

	private static int numberOfCharsInWord(String[] word) {
		int counter = 0;
		for (int i = 0; i < word.length; i++) {
			counter += word.length;
		}
		return counter;
	}

	@Override
	public String toString() {
		return "words:" + words + " lines:" + lines + " chars:" + characters;
	}

	@Override
	public boolean equals(Object w) {
		if (w.getClass().equals(this.getClass()))
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		File file = new File("/home/toni/words");
		WordsCounter wordsCounter = null;
		WordsCounter w = new WordsCounter(6, 3, 14);
		try {
			wordsCounter = WordsCounter.wordsCount(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(wordsCounter);

	}
}
