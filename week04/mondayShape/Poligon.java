package mondayShape;

public abstract class Poligon implements Shape {
	private int hight;
	private int base;
	private Point upLeft;
	private Point downRight;
	private Point downLeft;

	public LineSegment getEdge(Point start, Point end) {
		return new LineSegment(start, end);
	}

	public int getHigh() {
		return hight;
	}

	public int getBase() {
		return base;
	}

	public Point getUpLeft() {

		return upLeft;
	}

	public Point getDownLeft() {

		return downLeft;
	}

	public Point getDownRight() {
		return downRight;
	}

	public abstract void copy(Poligon copied);

	public void setUpLeft(Point upLeft) {
		this.upLeft = upLeft;
	}

	public void setDownRight(Point downRight) {
		this.downRight = downRight;
	}

	public void setDownLeft(Point downLeft) {
		this.downLeft.copy(downLeft);
	}

}
