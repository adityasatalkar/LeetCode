package leetcode.practice;

public class DayOfTheWeek {

	public static String dayOfTheWeek(int day, int month, int year) {

		String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
		String result = "";
		java.util.Calendar calendar = new java.util.GregorianCalendar(year, month - 1, day);
		switch (days[calendar.get(java.util.Calendar.DAY_OF_WEEK) - 1]) {
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
		int day = 31, month = 8, year = 2019;
		System.out.println(dayOfTheWeek(day,month,year));
	}
}
