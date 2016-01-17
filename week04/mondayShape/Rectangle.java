package mondayShape;

public class Rectangle extends Poligon {
	private Point upRight;

	@Override
	public double getArea() {

		return (getHigh() * getBase() / 2);
	}

	@Override
	public double getPer() {
		return edge1().getLenght() + edge2().getLenght() + edge3().getLenght();
	}

	public void copy(Poligon copied) {

	}

	@Override
	public Point displayCenter() {
		// TODO Auto-generated method stub
		return null;
	}

	public LineSegment edge1() {
		return getEdge(getDownLeft(), getUpLeft());

	}

	public LineSegment edge2() {
		return getEdge(getDownRight(), getUpLeft());

	}

	public LineSegment edge3() {
		return getEdge(getDownLeft(), getDownRight());

	}

	public void setUpRight(Point point) {
		upRight.copy(point);
	}

}
