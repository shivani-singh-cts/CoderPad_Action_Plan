package com.coderpad.preparation;

class TreeNode {
	int data;
	TreeNode left;
	TreeNode right;
	TreeNode(int d){
		data = d;
		left = null;
		right = null;
	}
}
public class CheckBalanceBinaryTree {
	TreeNode root;
	
	boolean isHeightBalanced(TreeNode tn) {
		if(tn == null)
			return true;
		else {
			int lh = height(tn.left);
			int rh = height(tn.right);
			if(absolute(lh - rh) <= 1 && isHeightBalanced(tn.left) && isHeightBalanced(tn.right))
				return true;
			else
				return false;
		}
	}
	int height(TreeNode tn) {
		if(tn == null)
			return 0;
		else {
			int h;
			if(height(tn.left) > height(tn.right))
				h = height(tn.left);
			else 
				h = height(tn.right);
			return 1+h;
		}
	}
	int absolute(int num) {
		if(num < 0)
			return (-1*num);
		else
			return num;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckBalanceBinaryTree bt = new CheckBalanceBinaryTree();
		bt.root = new TreeNode(1);
		bt.root.left = new TreeNode(2);
		bt.root.right = new TreeNode(3);
		bt.root.left.left = new TreeNode(4);
		bt.root.left.right = new TreeNode(5);
		bt.root.right.left = new TreeNode(6);
		bt.root.left.left.left = new TreeNode(7);
		
		boolean output = bt.isHeightBalanced(bt.root);
		if(output == true)
			System.out.println("Yes, the Binary tree is Height Balanced");
		else
			System.out.println("No, the Binary tree is not Balanced");
	}

}
