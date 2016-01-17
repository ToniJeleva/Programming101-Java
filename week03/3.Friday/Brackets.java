package w3wed;

import java.util.Stack;

public class Brackets {

	public static void main(String[] args) {
		String str = "((()))";
		System.out.println(match(str));

	}

	public static boolean match(String brackets) {
		boolean result = false;
		char temp;
		if ((brackets.charAt(0) == ')')
				|| (brackets.charAt(brackets.length() - 1) == '(')) {
			return false;
		} else {
			Stack<Character> first = new Stack<Character>();
			Stack<Character> second = new Stack<Character>();
			for (int i = 0; i < brackets.length(); i++) {
				first.push(brackets.charAt(i));
			}
			while (!first.isEmpty()) {
				temp = first.pop();
				if (!first.isEmpty()) {
					if ((first.peek() == '(') && (brackets.length() % 2 == 0)) {
						result = true;
					} else {
						second.push(temp);
						while (first.peek() != '(') {
							second.push(first.pop());
						}
						int counter = 0;
						if (!first.isEmpty()) {
							while (first.peek() != ')') {
								first.pop();
								counter++;
							}
							if (counter != second.size()) {
								return false;
							}
						}
					}
				}
			}

			return result;
		}
	}

}
