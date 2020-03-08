package leetcode.FAANG;

public class RangeSumOfBST {

	/**
	 * Definition for a binary tree node.
	 **/
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) {
			val = x;
		}
	}

	public static int rangeSumBST(TreeNode root, int L, int R) {
		int result = 0;

		if(root == null) {
			return 0;
		}

		if(root.val >= L && root.val <= R) {
			result += root.val;
		}

		return result + rangeSumBST(root.right,L,R) + rangeSumBST(root.left,L,R);
	}
}
