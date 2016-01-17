package w3wed;

import java.util.Collection;
import java.util.Iterator;

public class Rotate {

	public static void main(String[] args) {

	}

	public static <T> void rotate(Collection<T> collection, int rotateStep) {
		T temp;
		T last = null;
		Iterator<T> it = collection.iterator();
		temp = it.next();
		while (it.hasNext()) {
			last = it.next();
		}
		collection.remove(last);
		collection.add(temp);
	}

}
