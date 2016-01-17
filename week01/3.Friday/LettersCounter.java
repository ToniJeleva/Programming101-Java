package week1;

public class LettersCounter {

	public static void main(String[] args) {

	}

	public static int countVowels(String str) {
		int counter = 0;
		String temp = str.toLowerCase();
		for (int i = 0; i < temp.length(); i++) {
			if ((temp.charAt(i) + "").matches("[aeiouy]")) {
				counter++;
			}
		}
		return counter;
	}

	public static int countConsonants(String str) {
		int counter = 0;
		String temp = str.toLowerCase();
		for (int i = 0; i < temp.length(); i++) {
			if (!(temp.charAt(i) + "").matches("[aeiouy]")) {
				counter++;
			}
		}
		return counter;
	}

}
