package Friday;

import java.util.List;
import java.util.Map;

public class Second implements Runnable {
	private Map<Point, Point> map;
	private List<Point> list;

	public Second(Map<Point, Point> map, List<Point> list) {
		this.map = map;
		this.list = list;
	}

	@Override
	public void run() {
		PointsCalculator.getNearestPoint(list, map);
		;

	}

}
