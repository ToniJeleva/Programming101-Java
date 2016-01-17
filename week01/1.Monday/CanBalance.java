package week1;

public class CanBalance {

	public static void main(String[] args) {
		System.out.println(canBalance(new int[] { 10, 1, 1, 2, 10 }));

	}

	public static boolean canBalance(int[] numbers) {
		int sumLeft = 0;
		int sumRight = 0;
		for (int i = 0, j = numbers.length - 1; i < numbers.length / 2; i++, j--) {
			sumLeft += numbers[i];
			sumRight += numbers[j];
		}
		if (sumLeft == sumRight) {
			return true;
		} else {
			return false;
		}
	}

}
