package leetcode.FAANG;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class ConvertSortedArrayToBinarySearchTree {

	static int[] array;

	public static TreeNode insertIntoBST(int left, int right) {
		if(left > right) {
			return null;
		}

		int index = (left + right) / 2;

		TreeNode root = new TreeNode(array[index]);
		root.left = insertIntoBST(left, index - 1);
		root.right = insertIntoBST(index + 1, right);
		return root;
	}

	public TreeNode sortedArrayToBST(int[] nums) {
		this.array = nums;
		return insertIntoBST(0, nums.length - 1);
	}

	public static void main(String[] args) {
		ConvertSortedArrayToBinarySearchTree object = new ConvertSortedArrayToBinarySearchTree();
		int[] array = {-10,-3,0,5,9};
		TreeNode root = object.sortedArrayToBST(array);
	}
}