package w3fri;

public class Student implements Comparable {
	private String name;
	private int grade;

	public Student(String name, int grade) {
		this.name = name;
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int compareTo(Object o) {
		Student s = (Student) o;
		if (name.compareTo(s.getName()) == -1) {
			return -1;
		} else if (name.compareTo(s.getName()) == 1) {
			return 1;
		} else {
			if (grade < s.getGrade()) {
				return -1;
			} else if (grade > s.getGrade()) {
				return 1;
			} else {
				return 0;
			}
		}
	}

}
