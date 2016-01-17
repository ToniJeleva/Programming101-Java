package week2;

public class Fibonaci {

	public static void main(String[] args) {
		System.out.println(fibNumber(10));
	}

	public static String fibNumber(int n) {
		String result = "";
		int[] numbers = new int[n + 1];
		numbers[1] = 1;
		numbers[2] = 2;
		result = result.concat("12");
		for (int i = 3; i < numbers.length; i++) {
			numbers[i] = numbers[i - 1] + numbers[i - 2];
			result = result.concat(numbers[i] + "");
		}
		return result;
	}

}
