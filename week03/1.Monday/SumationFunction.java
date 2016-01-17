package week3;

public class SumationFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static <T extends Number> double sum(T first, T second) {
		return first.doubleValue() + second.doubleValue();
	}

	public static <T extends Number> double sub(T first, T second) {
		return first.doubleValue() - second.doubleValue();
	}

	public static <T extends Number> double divide(T first, T second) {
		return first.doubleValue() / second.doubleValue();
	}

	public static <T extends Number> double pow(T first, T second) {
		return Math.pow(first.doubleValue(), second.doubleValue());
	}

}
