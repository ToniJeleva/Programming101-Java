package mondayShape;

public class Point {
	private Integer x; // Integer because we override hashCode
	private Integer y;

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public Point() {
		x = 0;
		y = 0;
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void copy(Point p) {
		x = p.getX();
		y = p.getY();
	}

	public static Point getOrigint() {
		return new Point(0, 0);
	}

	@Override
	public String toString() {
		String result = "(" + x + "," + y + ")";
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Point)) {
			return false;
		}
		Point compared = (Point) obj;
		if ((x == compared.getX() && (y == compared.getY()))) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		int hash = 17;
		hash = hash * 23 + x.hashCode();
		hash = hash * 23 + y.hashCode();
		return hash;
	}

}
