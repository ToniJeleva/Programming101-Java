package week1;

public class ReduceFilePath {

	public static void main(String[] args) {
		System.out.println(reduceFilePath("/../"));

	}

	public static String reduceFilePath(String path) {
		String result = "/";
		String[] temp = path.split("/");
		// deletes the directory before each occurrence of ".."
		for (int i = 1; i < temp.length; i++) {
			if (temp[i].equals("..")) {
				temp[i - 1] = "";
			}
		}
		for (int i = 0; i < temp.length; i++) {
			if (temp[i].matches("\\w+")) {
				result = result.concat(temp[i] + "/");
			}
		}
		return result;
	}
}
