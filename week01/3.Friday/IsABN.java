package week1;

public class IsABN {

	public static void main(String[] args) {
		System.out.println(isAnBn(""));

	}

	public static boolean isAnBn(String str) {
		int n = 1;
		int bsCounter = 0;
		if (str.charAt(0) != 'a') { // word should start with a
			return false;
		}
		if (str.equals("")) {
			return true;
		}
		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i) == 'a') {
				n++;
			}
		}

		if (n == str.length()) { // word should not contain only a-s
			return false;
		}

		for (int i = n; i < str.length(); i++) { // start from last a occurrence
			if (str.charAt(i) == 'b') {
				bsCounter++;
			}
		}
		if (n == bsCounter) {
			return true;
		}

		return false;
	}

}
