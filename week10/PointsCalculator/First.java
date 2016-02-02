package Friday;

import java.util.List;
import java.util.Map;

public class First implements Runnable {

	private Map<Point, Point> map;
	private List<Point> list;

	public First(Map<Point, Point> map, List<Point> list) {
		this.map = map;
		this.list = list;
	}

	@Override
	public void run() {
		PointsCalculator.getNearestPoint(list, map);

	}
}
