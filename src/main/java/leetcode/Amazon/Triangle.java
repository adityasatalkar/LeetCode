package leetcode.Amazon;

import java.util.Collections;
import java.util.List;

public class Triangle {

	public static int minimumTotal(List<List<Integer>> triangle) {
		int sum = 0;
		if (triangle == null) {
			return sum;
		}

		for (int i = 0; i < triangle.size(); i++) {
			List<Integer> list = triangle.get(i);
			if (!list.isEmpty()) {
				Collections.sort(list);
				sum += list.get(0);
			}
		}
		return sum;
	}

	public static void main(String[] args) {

	}
}
