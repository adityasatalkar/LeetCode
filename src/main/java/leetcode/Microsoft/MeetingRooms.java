package leetcode.Microsoft;

public class MeetingRooms {

	public static int[] getMinMax(int[][] intervals) {
		int[] array = new int[2];
		int min = intervals[0][0];
		int max = intervals[0][0];

		for (int i = 0; i < intervals.length; i++) {
			int[] innerArray = intervals[i];
			for (int j = 0; j < innerArray.length; j++) {
				int current = innerArray[j];
				if (min > current) {
					min = current;
				}
				if (current > max) {
					max = current;
				}
			}
		}
		array[0] = min;
		array[1] = max;
		return array;
	}

	public static boolean[] populateBool(int min, int max) {
		boolean[] bool = new boolean[max];
		for (int i = min; i < max; i++) {
			bool[i] = false;
		}
		return bool;
	}

	public static boolean canAttendMeetings(int[][] intervals) {
		if (intervals == null || intervals.length == 0) {
			return true;
		}
		int[] minMaxArray = getMinMax(intervals);
		int min = minMaxArray[0];
		int max = minMaxArray[1];

		System.out.println("Min: " + min);
		System.out.println("Max: " + max);

		boolean[] booleanArray = populateBool(min,max);


		for (int i = 0; i < intervals.length; i++) {
			int[] innerArray = intervals[i];
			for (int j = innerArray[0]; j < innerArray[1]; j++) {
				if (!booleanArray[j]) {
					booleanArray[j] = true;
				}
				else if (booleanArray[j]) {
					return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int[][] input1 = {{0,30},{5,10},{15,20}};
		int[][] input2 = {{7,10},{2,4}};
		int[][] input3 = {};
		System.out.println(canAttendMeetings(input1));
		System.out.println(canAttendMeetings(input2));
		System.out.println(canAttendMeetings(input3));
	}
}
