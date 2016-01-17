package Vector;

import java.util.ArrayList;

public class Point {
	ArrayList<Double> coord;

	public Point(ArrayList<Double> coordinates) {
		coord = new ArrayList<>();
		coord = coordinates;
	}

	public int dimention() {
		return coord.size();
	}

}
