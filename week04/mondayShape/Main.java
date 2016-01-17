package mondayShape;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Point a = new Point(2, 3);
		Point b = new Point();
		b = a;
		b.copy(a);
		System.out.println(b);

	}

}
