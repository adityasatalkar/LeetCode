package leetcode.Amazon;

public class SumOfNodesWithEvenValuedGrandparent {

	public int sum = 0;

	public int sumEvenGrandparent(TreeNode root) {
		getSum(root, null, null);
		return sum;
	}

	private void getSum(TreeNode root, TreeNode parent, TreeNode grandParent) {
		if(root == null) {
			return;
		}

		if(grandParent != null && grandParent.val % 2 == 0) {
			sum += root.val;
		}

		getSum(root.left, root, parent);
		getSum(root.right,root, parent);
	}
}
