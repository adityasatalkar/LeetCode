package leetcode.Amazon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LastStoneWeight {

	public static int lastStoneWeight(int[] stones) {
		if(stones.length == 1) return stones[0];

		List<Integer> list = new ArrayList<>();
		for (Integer i: stones) {
			list.add(i);
		}

		Collections.sort(list, Collections.reverseOrder());

		int length = list.size();
		boolean iterate = true;

		while(iterate) {
			int big = list.get(0);
			int small = list.get(1);
			int diff = big - small;

			list.remove(0);
			list.remove(0);
			list.add(diff);

			Collections.sort(list, Collections.reverseOrder());

			if (list.size() == 1) {
				iterate = false;
			}
		}

		return list.get(0);
	}

	public static void main(String[] args) {
		int[] array = {2,7,4,1,8,1};
		System.out.println(lastStoneWeight(array));
	}
}
