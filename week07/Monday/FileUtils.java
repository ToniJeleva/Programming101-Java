package Monday;

import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;

public class FileUtils {
	private static final FileUtils INSTANCE = new FileUtils();

	private FileUtils() {
	}

	public static FileUtils getInstance() {
		return INSTANCE;
	}

	public String readFromFile(File file) throws IOException {
		String result = "";
		InputStream inStream = null;
		BufferedInputStream bis = null;
		inStream = new FileInputStream(file);
		bis = new BufferedInputStream(inStream);
		while (bis.available() > 0) {
			char c = (char) bis.read();
			result += c;

		}

		try {
			if (bis != null)
				bis.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}

		return result;
	}

	public String readFromPaht(Path path) throws IOException {
		String result = "";
		InputStream inStream = null;
		BufferedInputStream bis = null;
		inStream = new FileInputStream(path.toString());
		bis = new BufferedInputStream(inStream);
		while (bis.available() > 0) {
			char c = (char) bis.read();
			result += c;

		}
		try {
			if (bis != null)
				bis.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}

		return result;
	}

	public void writeToFile(File file, String str) throws IOException {
		try (BufferedWriter buf = new BufferedWriter(new FileWriter(file, true))) {
			buf.write(str);
		}
	}
}
