package com.coderpad.preparation;

class TreeNode1 {
	int data;
	TreeNode1 left;
	TreeNode1 right;
	TreeNode1(int d) {
		data = d;
		left = null;
		right = null;
	}
}

public class BFS_DFS_Tree {
	TreeNode1 root;
	
	void printBFS() {
		int level = height(root);
		for(int i= 1;i<= level; i++) {
			printBFSLevel(root, i);
		}
	}
	void printBFSLevel(TreeNode1 curr, int level) {
		if(curr == null) 
			return;
		if(level == 1)
			System.out.println(curr.data + " ");	
		else if(level > 1) {
			printBFSLevel(curr.left, level-1);
			printBFSLevel(curr.right, level-1);
		}
	}
	static int height(TreeNode1 tn) {
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
	void printPreorder(TreeNode1 node) {
		if(node != null) {
			System.out.print(node.data + " ");
			printPreorder(node.left);
			printPreorder(node.right);
		}
	}
	void printInorder(TreeNode1 node) {
		if(node != null) {
			printInorder(node.left);
			System.out.print(node.data + " ");
			printInorder(node.right);
		}
	}
	void printPostorder(TreeNode1 node) {
		if(node != null) {
			printPostorder(node.left);
			printPostorder(node.right);
			System.out.print(node.data + " ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BFS_DFS_Tree tree = new BFS_DFS_Tree();
		//Creating Tree
		tree.root = new TreeNode1(1);
		tree.root.left = new TreeNode1(2);
		tree.root.left.left = new TreeNode1(4);
		tree.root.left.right = new TreeNode1(5);
		tree.root.right = new TreeNode1(3);
		
		System.out.println("BFS of tree: ");
		tree.printBFS();
		
		System.out.println("Different DFS travels of tree: ");
		System.out.println("\n1. Pre-Order Traversal");
		tree.printPreorder(tree.root);
		System.out.println("\n2. In-Order Traversal");
		tree.printInorder(tree.root);
		System.out.println("\n3. Post-Order Traversal");
		tree.printPostorder(tree.root);
	}

}
