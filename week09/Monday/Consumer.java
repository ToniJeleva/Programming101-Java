package monday;

public class Consumer implements Runnable {
	MyBlockingQueue queue;

	public Consumer(MyBlockingQueue queue) {
		this.queue = queue;
	}

	@Override
	public void run() {

		try {
			for (int i = 0; i < 5; i++) {
				queue.take();
				Thread.sleep(50);
				System.out.println("I've taken something.");
			}

		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
