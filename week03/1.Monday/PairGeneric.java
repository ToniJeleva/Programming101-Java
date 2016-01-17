package week3;

public class PairGeneric<T> {
	private T first;
	private T second;

	PairGeneric(T first, T second) {
		this.first = first;
		this.second = second;
	}

	private T getFirst() {
		return first;
	}

	private T getSecond() {
		return second;
	}

	public boolean equals(PairGeneric<T> one, PairGeneric<T> two) {
		if ((one.getFirst().equals(two.getFirst()))
				&& (one.getSecond().equals(two.getSecond()))) {
			return true;
		} else {
			return false;
		}
	}

}
