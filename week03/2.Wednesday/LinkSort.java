package w3fri;

import java.util.Collections;
import java.util.LinkedList;

public class LinkSort {

	public static void main(String[] args) {
		Student b = new Student("b", 2);
		Student a = new Student("a", 2);
		Student c = new Student("a", 3);
		LinkedList<Student> list = new LinkedList<Student>();
		list.add(a);
		list.add(b);
		list.add(c);
		sort(list);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getName() + " "
					+ list.get(i).getGrade());
		}

	}

	public static LinkedList<Student> sort(LinkedList<Student> list) {
		Collections.sort(list);
		return list;
	}

}
