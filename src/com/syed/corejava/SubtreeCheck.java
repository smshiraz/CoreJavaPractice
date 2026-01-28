package com.syed.corejava;

class TreeNode {
	int val;
	TreeNode left, right;

	TreeNode(int val) {
		this.val = val;
		this.left = this.right = null;
	}
}

public class SubtreeCheck {

	public static boolean isSubtree(TreeNode root, TreeNode subRoot) {
		if (subRoot == null) {
			return true; // Empty tree is always a subtree
		}

		if (root == null) {
			return false;
		}

		if (isSameTree(root, subRoot)) {
			return true;
		}

		return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
	}

	private static boolean isSameTree(TreeNode t1, TreeNode t2) {
		if (t1 == null && t2 == null) {
			return true;
		}

		if (t1 == null || t2 == null) {
			return false;
		}

		if (t1.val != t2.val) {
			return false;
		}

		return isSameTree(t1.left, t2.left) && isSameTree(t1.right, t2.right);
	}

	// Example usage
	public static void main(String[] args) {
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(4);
		root.right = new TreeNode(5);
		root.left.left = new TreeNode(1);
		root.left.right = new TreeNode(2);

		TreeNode subRoot = new TreeNode(4);
		subRoot.left = new TreeNode(1);
		subRoot.right = new TreeNode(2);

		System.out.println(isSubtree(root, subRoot)); // true
	}
}
