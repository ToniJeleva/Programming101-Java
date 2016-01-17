package Vector;

public class Vector {
	Pair<Point> points;

	public Vector(Pair currentPoints) {
		points = new Pair();
		points = currentPoints;
	}

	public int dimention() {
		return points.getFirst().dimention();
	}

	public double lenght() {
		return 0;
	}
}
