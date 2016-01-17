package mondayShape;

public class LineSegment {
	private Point start;
	private Point end;

	public Point getStart() {
		return start;
	}

	public Point getEnd() {
		return end;
	}

	public LineSegment(Point start, Point end) {
		this.start = start;
		this.end = end;
	}

	public void copy(LineSegment line) {
		start.copy(line.getStart());
		end.copy(line.getEnd());
	}

	public double getLenght() {
		double result = 0;
		result = Math.sqrt(Math.pow(start.getX() - end.getX(), 2)
				+ Math.pow(start.getY() - end.getY(), 2));
		return result;
	}

	@Override
	public String toString() {
		return "[" + start.toString() + end.toString() + "]";
	}

}
