package monday;

public class MainBlocking {

	public static void main(String[] args) {
		MyBlockingQueue q = new MyBlockingQueue(10);
		Producer producer = new Producer(q);
		Consumer consumer = new Consumer(q);

		new Thread(producer).start();
		new Thread(consumer).start();

	}

}
