package Monday;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class PropertiesParser {
	private Map<String, String> result = new HashMap<>();

	public Map<String, String> parseProperties(File file) throws IOException {
		BufferedReader buf = null;

		try {
			buf = new BufferedReader(new FileReader(file));
			String line;

			while ((line = buf.readLine()) != null) {
				String[] temp = parseLineToKeyValue(line).split("'");
				if (temp.length > 1) {
					result.put(temp[0], temp[1]);
				}
			}
		} finally {
			buf.close();
		}

		return result;

	}

	private String parseLineToKeyValue(String line) {
		String result = "";
		line = line.replaceAll(" ", "");
		String some = line.replaceFirst("=", "'");
		if (some.contains("#")) {
			some = some.substring(0, line.indexOf("#"));
		}
		if (some.length() > 0) {
			String[] temp = some.split("'");
			result = temp[0] + "'" + temp[1];
		}
		return result;
	}

	public void print() {
		Iterator it = result.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry pair = (Map.Entry) it.next();
			System.out.println(pair.getKey() + "~" + pair.getValue());
		}
	}

	public static void main(String[] args) {
		File file = new File("/home/toni/foo");
		PropertiesParser parser = new PropertiesParser();
		try {
			parser.parseProperties(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
		parser.print();

	}

}
