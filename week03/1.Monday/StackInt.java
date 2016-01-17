package week3;

public interface StackInt<T> {
	public void push(T data);

	public T pop();

	public T peek();

	public boolean isEmpty();

	public void clear();

	public int size();

}
