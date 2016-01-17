package week3;

public class Triple<T, S, M> {
	private T first;
	private S second;
	private M third;

	public T getFirst() {
		return first;
	}

	public void setFirst(T first) {
		this.first = first;
	}

	public S getSecond() {
		return second;
	}

	public void setSecond(S second) {
		this.second = second;
	}

	public M getThird() {
		return third;
	}

	public void setThird(M third) {
		this.third = third;
	}

	public boolean equals(Triple<T, S, M> one, Triple<T, S, M> two,
			Triple<T, S, M> three) {
		if ((one.getFirst().equals(two.getFirst()) && one.getFirst().equals(
				three.getFirst()))
				&& (one.getSecond().equals(two.getSecond())
						&& one.getSecond().equals(three.getSecond()) && (one
						.getThird().equals(two.getThird()) && one.getThird()
						.equals(three.getThird())))) {
			return true;
		} else {
			return false;
		}
	}

	public String toString() {
		String str = "";
		str = first + " " + second + " " + third;
		return str;
	}

	public static void main(String[] args) {
		Triple<Integer, String, Double> tr = new Triple<Integer, String, Double>();
		tr.setFirst(12);
		tr.setSecond("blbf");
		tr.setThird(13.5);
		System.out.println(tr);

	}

}
