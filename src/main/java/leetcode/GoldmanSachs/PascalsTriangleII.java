package leetcode.GoldmanSachs;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangleII {

	public static List<Integer> getRow(int rowIndex) {
		List<List<Integer>> triangle = new ArrayList<>();

		triangle.add(new ArrayList<>());
		triangle.get(0).add(1);

		// First base case; if user requests zero rows
		if (rowIndex == 0) {
			return triangle.get(0);
		}

		for (int rowNum = 1; rowNum <= rowIndex; rowNum++) {
			List<Integer> row = new ArrayList<>();
			List<Integer> prevRow = triangle.get(rowNum - 1);

			// The first row element is always 1.
			row.add(1);

			// Each triangle element (other than the first and last of each row)
			// is equal to the sum of the elements above-and-to-the-left and
			// above-and-to-the-right.
			for (int i = 1; i < rowNum; i++) {
				row.add(prevRow.get(i - 1) + prevRow.get(i));
			}

			// The last row element is always 1.
			row.add(1);

			triangle.add(row);
		}

		return triangle.get(rowIndex);
	}

	public static void main(String[] args) {
		int numberOfRows = 0;
		List<Integer> result = getRow(numberOfRows);

		for (int i = 0; i < result.size(); i++) {
			System.out.print(result.get(i) + " ");
		}
	}
}
