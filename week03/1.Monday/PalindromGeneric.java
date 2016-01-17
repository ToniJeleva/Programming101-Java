package week3;

public class PalindromGeneric {

	public static void main(String[] args) {

	}

	public static <T> boolean isPalindrome(T argument) {
		String some = (String) argument;
		for (int i = 0; i < some.length(); i++) {
			if (some.charAt(i) != some.charAt(some.length() - 1 - i)) {
				return false;
			}
		}
		return true;
	}

}
