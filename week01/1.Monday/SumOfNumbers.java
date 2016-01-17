package week1;

public class SumOfNumbers {

	public static void main(String[] args) {

	}

	public static int sumOfNumbers(String input) { // 25
		String temp1 = "";
		String temp2 = "";
		String numbers = "";
		int sum = 0;
		for (int i = 0; i < input.length(); i++) {
			temp1 = input.charAt(i) + "";
			if (temp1.matches("\\d+")) {
				numbers = numbers.concat(temp1);
				if (i != input.length() - 1) {
					temp2 = input.charAt(i + 1) + "";
				}
				if (!temp2.matches("\\d+")) {
					sum = sum + Integer.parseInt(numbers);
					numbers = "";
				}
			}
		}
		return sum;
	}

}
