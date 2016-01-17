package week2;

import java.util.Arrays;

public class uniqueWords {

	public static void main(String[] args) {
		String[] arr = new String[] { "apple", "apple", "banana", "apple",
				"pie" };
		System.out.println(uniqueWordCount(arr));
	}

	public static int uniqueWordCount(String[] words) {
		String[] temp = Arrays.copyOf(words, words.length); // in order not to
															// change the
															// original array
		int counter = temp.length;

		for (int i = 0; i < temp.length - 1; i++) {
			for (int j = i + 1; j < temp.length; j++) {
				if (temp[i].equals(temp[j]) && (!temp[i].equals(""))) {
					temp[j] = ""; // change repeated words to ""
					counter--;
				}
			}
		}
		return counter;
	}

}
