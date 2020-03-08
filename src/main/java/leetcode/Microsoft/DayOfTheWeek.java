package leetcode.Microsoft;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class DayOfTheWeek {

	public static String dayOfTheWeek(int day, int month, int year) {
		String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

		String result = "";

		Calendar calendar = new GregorianCalendar(year, month - 1, day);
		switch (days[calendar.get(Calendar.DAY_OF_WEEK)-1]) {
			case "Sunday":
				return days[0];
			case "Monday":
				return days[1];
			case "Tuesday":
				return days[2];
			case "Wednesday":
				return days[3];
			case "Thursday":
				return days[4];
			case "Friday":
				return days[5];
			case "Saturday":
				return days[6];
		}
		return result;
	}

	public static void main(String[] args) {
		int[] day = {31,18,15,15,15};
		int[] month = {8,7,8,1,11};
		int[] year = {2019,1999,1993,1993,1993};

		for (int i = 0; i < day.length; i++) {
			System.out.println(dayOfTheWeek(day[i],month[i],year[i]));
		}
	}
}
