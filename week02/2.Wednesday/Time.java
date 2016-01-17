package week2;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Time {
	private int hours;
	private int min;
	private int sec;
	private int day;
	private int month;
	private int year;

	public Time(String time, String dayOfTheYear) {
		String[] tempTime = time.split(":");
		hours = Integer.parseInt(tempTime[0]);
		min = Integer.parseInt(tempTime[1]);
		sec = Integer.parseInt(tempTime[2]);

		String[] tempDay = dayOfTheYear.split("\\.");
		day = Integer.parseInt(tempDay[0]);
		month = Integer.parseInt(tempDay[1]);
		year = Integer.parseInt(tempDay[2]);
	}

	public String toString() {
		String time = hours + ":" + min + ":" + sec + " " + day + "." + month
				+ "." + year;
		return time;
	}

	public static void now() {
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd_HH:mm:ss")
				.format(Calendar.getInstance().getTime());
		System.out.println(timeStamp);
	}

	public static void main(String[] args) {
		Time current = new Time("08:50:30", "25.11.2015");
		System.out.println(current.toString());
		current.now();

		// difference between this and super

	}

}
