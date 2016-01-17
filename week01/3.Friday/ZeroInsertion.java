package week1;

public class ZeroInsertion {

	public static void main(String[] args) {
		System.out.println(zeroInsert(0));

	}

	public static int zeroInsert(int n) {
		StringBuilder temp = new StringBuilder(n + "");
		for (int i = 0; i < temp.length() - 1; i++) {
			char first = temp.charAt(i);
			char next = temp.charAt(i + 1);
			if ((first == next)
					|| ((Integer.parseInt(first + "") + Integer.parseInt(next
							+ "")) % 10 == 0)) {
				temp.insert(i + 1, '0');
			}
		}
		return Integer.parseInt(temp + "");
	}
}
