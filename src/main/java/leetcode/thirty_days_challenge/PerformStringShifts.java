package leetcode.thirty_days_challenge;

public class PerformStringShifts {

	// function that rotates s towards left by d
	public static String leftrotate(String str, int d) {
		return str.substring(d) + str.substring(0, d);
	}

	// function that rotates s towards right by d
	public static String rightrotate(String str, int d) {
		return leftrotate(str, str.length() - d);
	}

	public static String stringShift(String s, int[][] shift) {
		for (int i = 0; i < shift.length; i++) {
			int[] array = shift[i];
			int direction = array[0];
			int amount = array[1];
			if (direction == 0) {
				s = leftrotate(s,amount);
			}
			else if (direction == 1) {
				s = rightrotate(s,amount);
			}
		}
		return s;
	}
}