package week3;

import DataStructures101.LinkedList;

public class Stack<T extends Comparable<T>> implements StackInt<T> {

	private LinkedList<T> list;

	Stack() {
		list = new LinkedList<T>();
	}

	@Override
	public void push(T data) {
		if (list.contains(data)) {
			System.out.println("The stack already contains this element.");
		} else {
			list.add(data);
		}

	}

	@Override
	public T pop() {
		T result = list.getTail().getData();
		list.removeAt(list.getTail());
		return result;
	}

	@Override
	public T peek() {
		return list.getHead().getData();
	}

	@Override
	public boolean isEmpty() {
		if (list.size() == 0) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public void clear() {
		while (list.size() != 1) {
			list.removeAt(list.getTail());
		}
		list.setHead(null);
	}

	@Override
	public int size() {
		return list.size();
	}

}
