package week2;

public class Lucas {

	public static void main(String[] args) {
		System.out.println(nthLucas(5));
	}

	public static int nthLucas(int n) {
		int[] numbers = new int[n + 1];
		numbers[1] = 2;
		numbers[2] = 1;
		for (int i = 3; i < numbers.length; i++) {
			numbers[i] = numbers[i - 1] + numbers[i - 2];

		}
		return numbers[n];
	}

}
