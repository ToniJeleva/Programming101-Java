package week1;

public class Anagrams {

	public static void main(String[] args) {

	}

	public static boolean anagram(String A, String B) { // 26 //without empty
														// string, need word
		StringBuilder temp = new StringBuilder(B); // mutable
		int counter = 0;
		if (A.length() != B.length()) {
			return false;
		}
		for (int i = 0; i < A.length(); i++) {
			for (int j = 0; j < temp.length(); j++) {
				if (A.charAt(i) == temp.charAt(j)) {
					temp.deleteCharAt(j);
					counter++;
				}
			}

		}
		if (counter == A.length()) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean hasAnagramOf(String A, String B) { // 27 //the same as
		// 26
		StringBuilder temp = new StringBuilder(B);
		int counter = 0;
		if (A.length() > B.length()) {
			return false;
		}
		for (int i = 0; i < A.length(); i++) {
			for (int j = 0; j < temp.length(); j++) {
				if (A.charAt(i) == temp.charAt(j)) {
					temp.deleteCharAt(j);
					counter++;
					break; // if the necessary character found stop iterating
							// over B
				}
			}
		}
		if (counter == A.length()) {
			return true;
		} else {
			return false;
		}
	}

}
