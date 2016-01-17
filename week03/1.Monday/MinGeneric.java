package week3;

import java.util.ArrayList;

public class MinGeneric {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(1);
		arr.add(3);
		arr.add(2);
		System.out.println(min(arr));
	}

	public static <T extends Comparable<T>> T min(ArrayList<T> arr) {
		T min = arr.get(0);
		for (int i = 1; i < arr.size(); i++) {
			if (min.compareTo(arr.get(i)) == 1) {
				min = arr.get(i);
			}
		}
		return min;
	}

}
