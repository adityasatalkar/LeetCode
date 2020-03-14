package leetcode.FAANG;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {

	public static List<List<Integer>> generate(int numRows) {
		List<List<Integer>> triangle = new ArrayList<>();

		// First base case; if user requests zero rows
		if (numRows == 0) {
			return triangle;
		}

		// Second base case; first row is always [1].
		triangle.add(new ArrayList<>());
		triangle.get(0).add(1);

		for (int rowNum = 1; rowNum < numRows; rowNum++) {
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

		return triangle;
	}

	public static void main(String[] args) {
		int numberOfRows = 5;
		List<List<Integer>> result = generate(numberOfRows);

		for (int i = 0; i < result.size(); i++) {
			List<Integer> list = result.get(i);
			for (int j = 0; j < list.size(); j++) {
				System.out.print(list.get(j) + " ");
			}
			System.out.println();
		}
	}
}
