package Monday;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MainFileUtils {

	public static void main(String[] args) {
		FileUtils a = null;
		File file = new File("/home/toni/foo");
		Path path = Paths.get("/home/toni/foo");
		try {
			a.getInstance().writeToFile(file, "tuff");
			System.out.println(a.getInstance().readFromFile(file));
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
