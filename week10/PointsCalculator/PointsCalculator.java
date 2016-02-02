package Friday;

import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;

public class PointsCalculator {

	public static List<Point> generatePoints() {
		CopyOnWriteArrayList<Point> list = new CopyOnWriteArrayList<>();
		for (int i = 0; i < 10000; i++) {
			Random rand = new Random();
			int randomX = rand.nextInt(10001);
			int randomY = rand.nextInt(10001);
			list.add(new Point(randomX, randomY));
		}
		return list;
	}

	// used this method with CopyOnWriteArrayList
	public static void getNearestPoint(List<Point> points, Map<Point, Point> outmap) {
		Point possiblePoint = null;
		for (int i = 0; i < points.size(); i++) {
			double minDist = 10000;
			for (int j = 0; j < points.size(); j++) {
				if (points.get(i).isEqualTo(points.get(j))) {
					continue;
				}
				double currentDist = points.get(i).calculateDist(points.get(j));
				if (currentDist < minDist) {
					minDist = currentDist;
					possiblePoint = points.get(j);
				}
			}
			outmap.put(points.get(i), possiblePoint);
		}

	}

	// used this method with just ArrayList, explicitly dividing the collection
	public static void doCalculations(List<Point> points, int indexFrom, int indexTo, Map<Point, Point> outMap) {
		Point possiblePoint = null;
		for (int i = indexFrom; i < indexTo; i++) {
			double minDist = 10000;
			for (int j = indexFrom; j < indexTo; j++) {
				if (points.get(i).isEqualTo(points.get(j))) {
					continue;
				}
				double currentDist = points.get(i).calculateDist(points.get(j));
				if (currentDist < minDist) {
					minDist = currentDist;
					possiblePoint = points.get(j);
				}
			}
			outMap.put(points.get(i), possiblePoint);
		}
	}

}
