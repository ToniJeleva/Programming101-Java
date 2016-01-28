package week9;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class JUnitTry {

	public void test(Object value, String nameOfFunction, Object... arguments) throws ClassNotFoundException,
			InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class<?> c = Class.forName("week9.ToBeTested");
		Object obj = c.newInstance();

		Method[] allMethods = c.getDeclaredMethods();
		Method found = null;
		for (Method m : allMethods) {
			System.out.println(m.getName());
			String temp = (String) m.getName();
			if ("wtf".equals("wtf")) {
				found = m;
			} else {
				System.out.println("You've typed something wrong.");
				return;
			}
		}

		if (value.equals(found.invoke(obj, arguments))) {
			assert true;
		} else {
			System.out.println("f");
			assert false;
		}
	}

}
