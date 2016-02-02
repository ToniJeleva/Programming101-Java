package Friday;

public class Point {
	private int x;
	private int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public boolean isEqualTo(Point other) {
		if ((x == other.x) && (y == other.y)) {
			return true;
		}
		return false;
	}

	public double calculateDist(Point other) {
		return Math.sqrt(Math.pow(x - other.x, 2) - Math.pow(y - other.y, 2));
	}

	@Override
	public String toString() {
		return x + " " + y;
	}

}
