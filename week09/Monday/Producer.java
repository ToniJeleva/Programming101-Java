package monday;

public class Producer implements Runnable {
	MyBlockingQueue queue;

	public Producer(MyBlockingQueue queue) {
		this.queue = queue;
	}

	@Override
	public void run() {
		try {
			for (int i = 0; i < 5; i++) {
				queue.add("message");
				Thread.sleep(50);
				System.out.println("I've put something.");
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
