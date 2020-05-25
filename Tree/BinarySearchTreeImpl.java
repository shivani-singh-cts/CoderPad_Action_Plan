package com.coderpad.preparation;

import java.util.Scanner;

class BSTNode {
	int data;
	BSTNode left;
	BSTNode right;
	BSTNode(int d) {
		data = d;
		left = null;
		right = null;
	}
}
public class BinarySearchTreeImpl {
	BSTNode root;
	
	void put(int val) {
		root = putRecursive(root, val);
	}
	BSTNode putRecursive(BSTNode curr, int val) {
		if(curr == null) {
			curr = new BSTNode(val);
			return curr;
		}
		if(val < curr.data) 
			curr.left = putRecursive(curr.left, val);
		else if(val > curr.data)
			curr.right = putRecursive(curr.right, val);
		else
			return curr;
		return curr;
			
	}
	void printTreeInorder(BSTNode root) {
		if(root != null) {
			printTreeInorder(root.left);
			System.out.print(root.data + " ");
			printTreeInorder(root.right);
		}
	}
	boolean contains(BSTNode n, int val) {
		if(n == null)
			return false;
		else if(n.data == val)
			return true;
		else {
			if(val < n.data)
				return contains(n.left, val);
			else
				return contains(n.right, val);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearchTreeImpl tree = new BinarySearchTreeImpl();
		//Creating Tree
		tree.put(50);
		tree.put(30);
		tree.put(20);
		tree.put(40);
		tree.put(70);
		tree.put(60);
		tree.put(80);
		
		System.out.println("Tree is currently:");
		tree.printTreeInorder(tree.root);
		
		int ele;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the element to put in BST:");
		ele = input.nextInt();
		tree.put(ele);
		
		System.out.println("Tree after insertion:");
		tree.printTreeInorder(tree.root);
		
		System.out.println("Enter the element to be searched in BST:");
		ele = input.nextInt();
		boolean result = tree.contains(tree.root, ele);
		if(result == true)
			System.out.println("Element found in BST.");
		else
			System.out.println("Element not found.");
	}

}
