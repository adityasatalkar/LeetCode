package leetcode.Amazon;

public class InsertIntoABinarySearchTree {

	public TreeNode insertIntoBST(TreeNode root, int val) {
		TreeNode currentNode = root;
		TreeNode previousNode = null;

		while(currentNode != null) {
			previousNode = currentNode;
			if(currentNode.val > val) {
				currentNode = currentNode.left;
			} else {
				currentNode = currentNode.right;
			}
		}

		currentNode = new TreeNode(val);
		if(previousNode.left == null && previousNode.val > val) {
			previousNode.left = currentNode;
		}
		else {
			previousNode.right = currentNode;
		}
		return root;
	}
}
