package w3fri;

public abstract class Task {
	private String name;
	private int time;
	private int priority;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	Task() {

	}

	Task(int pri) {
		name = "";
		time = 0;
		priority = pri;
	}

}
