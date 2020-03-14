package leetcode.Adobe;

public class SearchInABinarySearchTree {

	public TreeNode searchBST(TreeNode root, int val) {

		// Base Cases: root is null or value is present at root
		if (root == null || root.val == val) {
			return root;
		}

		// val is greater than root's value
		if (root.val > val) {
			return searchBST(root.left, val);
		}

		// val is less than root's value
		return searchBST(root.right, val);
	}
}
