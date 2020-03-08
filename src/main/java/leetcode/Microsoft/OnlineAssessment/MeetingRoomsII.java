package leetcode.Microsoft.OnlineAssessment;

import java.util.Arrays;

public class MeetingRoomsII {
	public static int minMeetingRooms(int[][] intervals) {
		if (intervals.length <= 1) {
			return intervals.length;
		}

		int[] startTimesArray = new int[intervals.length];
		int[] endTimesArray = new int[intervals.length];

		for (int i = 0; i < intervals.length; i++) {
			startTimesArray[i] = intervals[i][0];
			endTimesArray[i] = intervals[i][1];
		}

		Arrays.sort(startTimesArray);
		Arrays.sort(endTimesArray);

		int startTime = 0, endTime = 0;
		int rooms = 0;

		while (startTime < intervals.length) {
			if (startTimesArray[startTime] >= endTimesArray[endTime]) {
				/*
                     If the start time greater than current end time, then there
                     is no meeting currently going on and the room is free.
                     Let's compare the next start and end time.
				*/
				startTime++;
				endTime++;
			} else {
				/*
                     If the start time less than current end time,
                     then a meeting  is still going on and we need another room.
                     Let's compare the next start with this same end time to
                     see if that also conflicts or if this room will be free by then
				*/
				startTime++;
				rooms++;
			}
		}
		return rooms;
	}

	public static void main(String[] args) {
		int[][] input1 = {{0,30},{5,10},{15,20}};
		int[][] input2 = {{7,10},{2,4}};
		int[][] input3 = {};
		System.out.println(minMeetingRooms(input1));
		System.out.println(minMeetingRooms(input2));
		System.out.println(minMeetingRooms(input3));
	}
}


/*

	UNABLE TO UNDERSTAND WHATS WRONG WITH THIS!

	public static int[] getMinMax(int[][] intervals) {
		int[] result = new int[2];
		int min = intervals[0][0];
		int max = intervals[0][0];

		for (int i = 0; i < intervals.length; i++) {
			int[] innerArray = intervals[i];
			for (int j = 0; j < innerArray.length; j++) {
				max = Math.max(max, innerArray[j]);
				min = Math.min(min, innerArray[j]);
			}
		}
		result[0] = min;
		result[1] = max;
		return result;
	}

	public static boolean[] populateBooleanArrayToFalse(int min, int max) {
		boolean[] boolArray = new boolean[max];
		for (int i = min; i < max; i++) {
			boolArray[i] = false;
		}
		return boolArray;
	}

	public static int minMeetingRooms(int[][] intervals) {
		if (intervals == null || intervals.length == 0) {
			return 0;
		}

		int count = 1;
		int[] minMaxArray = getMinMax(intervals);
		int min = minMaxArray[0];
		int max = minMaxArray[1];

		boolean[] booleanArray = populateBooleanArrayToFalse(min,max);

		for (int i = 0; i < intervals.length; i++) {
			int[] innerArray = intervals[i];
			for (int j = innerArray[0]; j < innerArray[1]; j++) {
				if (!booleanArray[j]) {
					booleanArray[j] = true;
				}
				else if (booleanArray[j]) {
					count++;
					break;
				}
			}
		}

		return count;
	}

 */