package Vector;

public class Pair<T> {
	private T first;
	private T second;

	Pair() {
	}

	Pair(T first, T second) {
		this.first = first;
		this.second = second;
	}

	public T getFirst() {
		return first;
	}

	public T getSecond() {
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

	@Override
	public String toString() {
		return first + " " + second;
	}

}
