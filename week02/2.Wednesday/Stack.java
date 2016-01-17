package DataStructures101;

public class Stack implements StackInt {

	private LinkedList<Integer> list;

	Stack() {
		list = new LinkedList<Integer>();
	}

	@Override
	public void push(int data) {
		if (list.contains(data)) {
			System.out.println("The stack already contains this element.");
		} else {
			list.add(data);
		}

	}

	@Override
	public int pop() {
		int result = list.getTail().getData();
		list.removeAt(list.getTail());
		return result;
	}

	@Override
	public int peek() {
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
