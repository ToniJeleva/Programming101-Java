package week2;

public class IncreasingAndDecresingSeq {

	public static void main(String[] args) {
		int n[] = new int[5];
		for (int i = 0; i < n.length; i++) {
			n[i] = i;
		}

		System.out.println(isIncreasing(n));
	}

	public static boolean isIncreasing(int[] n) {
		for (int i = 0; i < n.length - 1; i++) {
			if (n[i] >= n[i + 1]) {
				return false;
			}
		}
		return true;
	}

	public static boolean isDecreasing(int[] n) {
		for (int i = 0; i < n.length - 1; i++) {
			if (n[i] <= n[i + 1]) {
				return false;
			}
		}
		return true;
	}

}
