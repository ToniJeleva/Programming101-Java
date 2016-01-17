package week2;

public class Pair {
	private Object first;
	private Object second;

	Pair(Object first, Object second) {
		this.first = first;
		this.second = second;
	}

	private Object getFirst() {
		return first;
	}

	private Object getSecond() {
		return second;
	}

	public boolean equals(Pair one, Pair two) {
		if ((one.getFirst() == two.getFirst())
				&& (one.getSecond() == two.getSecond())) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {

	}

}
