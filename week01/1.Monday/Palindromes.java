package week1;

public class Palindromes {

	public static void main(String[] args) {

	}

	public static boolean isPalindrome(String argument) { // 19
		for (int i = 0; i < argument.length(); i++) {
			if (argument.charAt(i) != argument
					.charAt(argument.length() - 1 - i)) {
				return false;
			}
		}
		return true;
	}

	public static boolean isPalindrome(int argument) {// 20
		return isPalindrome(argument + "");
	}

}
