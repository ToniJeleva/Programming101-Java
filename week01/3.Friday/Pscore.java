package week1;

public class Pscore {

	public static void main(String[] args) {
		System.out.println(pScore(198));
	}

	public static int pScore(int n) {
		int counter = 1;
		if (isPalindrome(n + "")) {
			return 1;
		} else {
			int nReversed = nReversed(n);
			counter = 1 + pScore(n + nReversed);
		}
		return counter;
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

	public static int nReversed(int n) {
		int temp = 0;
		if (n % 10 == 0) {
			n = n / 10;
		}
		while ((n % 10 != 0) || ((n % 10 == 0) && (n / 10 > 0))) {
			temp = temp * 10 + n % 10;
			n = n / 10;
		}
		return temp;
	}
}
