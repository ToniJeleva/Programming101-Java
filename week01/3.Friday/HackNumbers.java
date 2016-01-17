package week1;

public class HackNumbers {

	public static void main(String[] args) {
		System.out.println();

	}

	public static boolean isHack(int n) { // See for n<0
		boolean checker = true;
		String number;
		number = Integer.toBinaryString(n);
		if (n % 2 == 0) {
			return false;
		}
		for (int i = 0; i < number.length() / 2; i++) {
			if (number.charAt(i) != number.charAt(number.length() - i - 1)) {
				checker = false;
			}
		}
		if ((number.charAt(number.length() / 2) == '1') && (checker == false)
				&& (number.length() % 2 != 0)) {
			checker = false;
		}
		return checker;
	}

	public static int nextHack(int n) {
		int nextNumber = n + 1;
		while (!isHack(nextNumber)) {
			nextNumber++;
		}

		return nextNumber;
	}

}
