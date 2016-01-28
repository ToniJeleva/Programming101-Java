package week9;

import java.lang.reflect.InvocationTargetException;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException,
			IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		/*
		 * MyClass myCl = new MyClass(); Annotation[] ann =
		 * myCl.getClass().getAnnotations(); for (Annotation annotation : ann) {
		 * System.out.println(annotation); } System.out.println(ann.length);
		 */

		JUnitTry unit = new JUnitTry();
		unit.test("b", "something1", 3);

	}

}
