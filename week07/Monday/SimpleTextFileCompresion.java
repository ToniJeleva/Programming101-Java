package Monday;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedHashMap;

public class SimpleTextFileCompresion {
	private LinkedHashMap<String, Integer> dictionary;

	public SimpleTextFileCompresion() {
		dictionary = new LinkedHashMap<>();
	}

	public void compress(Path path) throws IOException {
		readFromFile(path);
		writeEncodedText(path);

	}

	private void readFromFile(Path path) throws IOException {
		BufferedReader buf = null;

		try {
			buf = new BufferedReader(new FileReader(path.toFile()));
			String line;

			while ((line = buf.readLine()) != null) {
				String[] temp = line.split(" ");
				putEncodedWordsInMap(temp);
			}
		} finally {
			buf.close();
		}
	}

	private void putEncodedWordsInMap(String[] words) {
		int i;
		for (i = 0; i < words.length; i++) {
			if (!dictionary.containsKey(words[i])) {
				dictionary.put(words[i], dictionary.size());
			}
		}
		dictionary.put(i + "", -3); // indicator for a new line
	}

	private void writeEncodedText(Path path) throws IOException {
		BufferedWriter buf = null;
		try {
			buf = new BufferedWriter(new FileWriter(path.toFile(), true));
			StringBuffer content = new StringBuffer();
			for (String key : dictionary.keySet()) {
				if (dictionary.get(key).equals(-3)) {
					content.append("\n");
					buf.write(content.toString());
					content.delete(0, content.length());
				} else {
					content.append(dictionary.get(key) + "~");
				}
			}
		} finally { //
			buf.close();
		}
	}

	public static void main(String[] args) {
		SimpleTextFileCompresion compresor = new SimpleTextFileCompresion();
		Path path = Paths.get("/home/toni/words");
		try {
			compresor.compress(path);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
