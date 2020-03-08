package leetcode.FAANG;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal {

	public static List<Integer> traversePreOrder(TreeNode root, List<Integer> list) {
		if(root == null) {
			return list;
		}
		if (root.left != null) {
			traversePreOrder(root.left, list);
		}
		list.add(root.val);
		if (root.right != null) {
			traversePreOrder(root.right, list);
		}
		return list;
	}

	public List<Integer> inorderTraversal(TreeNode root) {
		return traversePreOrder(root, new ArrayList<>());
	}
}
