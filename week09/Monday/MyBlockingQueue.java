package monday;

import java.util.LinkedList;
import java.util.List;

public class MyBlockingQueue {
	private List<Object> queue = new LinkedList<Object>();
	int limit = 10;

	public MyBlockingQueue(int limit) {
		this.limit = limit;
	}

	public synchronized void add(Object element) throws InterruptedException {
		while (queue.size() == limit) {
			wait();
		}
		if (queue.size() == 0) {
			notifyAll();
		}
		queue.add(element);
	}

	public synchronized Object take() throws InterruptedException {
		while (queue.size() == 0) {
			wait();
		}
		if (queue.size() == limit) {
			notifyAll();
		}
		return queue.remove(0);
	}

}
