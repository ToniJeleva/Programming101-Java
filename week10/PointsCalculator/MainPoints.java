package Friday;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MainPoints {

	public static void main(String[] args) throws InterruptedException {
		List<Point> list = PointsCalculator.generatePoints();
		Map<Point, Point> map = new ConcurrentHashMap<>();
		Thread th1 = new Thread(new First(map, list));
		Thread th2 = new Thread(new Second(map, list));
		Thread th3 = new Thread(new Third(map, list));
		th1.start();
		th2.start();
		th3.start();
		th1.join();
		th2.join();
		th3.join();

		for (Point key : map.keySet()) {
			System.out.println(key.toString() + " nearest is " + map.get(key).toString());
		}
		System.out.println(map.size());

	}

}
