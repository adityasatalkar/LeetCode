package leetcode.FAANG;


public class MaximumDepthOfBinaryTree {

	public static int traverseDepth(TreeNode treeNode, int count) {
		if (treeNode == null) {
			return 0;
		}
		count++;
		return 1 + Math.max(traverseDepth(treeNode.left, count) , traverseDepth(treeNode.right, count));
	}

	public static int maxDepth(TreeNode root) {
		return traverseDepth(root,0);
	}
}
