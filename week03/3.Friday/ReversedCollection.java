package w3wed;

import java.util.Collection;
import java.util.LinkedList;
import java.util.ListIterator;

public class ReversedCollection {

	public static void main(String[] args) {
		LinkedList<Integer> some = new LinkedList<Integer>();
		LinkedList<Integer> second = new LinkedList<Integer>();
		int t;
		some.add(1);
		some.add(2);
		some.add(4);
		second = (LinkedList<Integer>) reverse(some);
		for (int i = 0; i < second.size(); i++) {
			System.out.println(second.get(i));
		}

	}

	public static <T> Collection<T> reverse(Collection<T> collection) {
		LinkedList<T> list = new LinkedList<T>();
		for (T element : collection) {
			list.add(element);
		}
		ListIterator<T> el = (ListIterator<T>) list.iterator();
		while (el.hasPrevious()) {

		}

		return list;
	}

}
