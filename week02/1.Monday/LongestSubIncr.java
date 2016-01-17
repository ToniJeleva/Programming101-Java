package week2;

public class LongestSubIncr {

	public static void main(String[] args) {
		System.out.println(maxEqualConsecutive(new int[] { 1, 2, 3, 3, 3, 3, 4,
				3, 3 }));

	}

	public static int maxEqualConsecutive(int[] numbers) {
		int countMax = 1; // if there are only unrepeated elements
		int current = 0;

		for (int j = 0; j < numbers.length - 1; j++) {
			if (numbers[j] <= numbers[j + 1]) {
				current++;
				if (current + 1 > countMax) {
					countMax = current + 1;
				}
			} else {
				current = 0;
			}
		}

		return countMax;
	}

}
