package com.coderpad.preparation;

class Node2D {
	int data;
	Node2D next;
	Node2D down;
	Node2D(int d){
		data = d;
		next = null;
		down = null;
	}
}
public class FlatteningLinkedList {
	Node2D head;
	
	Node2D push(Node2D nd, int d) {
		Node2D newNode = new Node2D(d);
		newNode.next = null;
		newNode.down = nd;
		System.out.println("Inserted "+ d+ "    Head is now: "+newNode.data);
		nd = newNode;
		return nd;
	}
	void display2DLinkedList() {
		System.out.println("2D Linked List is: ");
		Node2D n = head;
		while(n != null) {
			System.out.print(n.data + " | ");
			Node2D ndwn = n;
			while (ndwn != null){	
				System.out.print(ndwn.data + " -> ");
				ndwn = ndwn.down;
			}
			System.out.println("");
			n = n.next;
		}
	}
	void displayLinkedList() {
		Node2D n = head;
		do{
			System.out.print(n.data + "-> ");
			n = n.down;
		}while(n != null);
	}
	Node2D flatten(Node2D node) {
		
		if(node == null || node.next == null) {
			return node;
		}
		else {
			node.next = flatten(node.next);
			node = merge(node, node.next);
			return node;
		}
	}
	Node2D merge(Node2D nA, Node2D nB) {
		if(nA == null) 
			return nB;
		if(nB == null) 
			return nA;
		
		Node2D result;
		if(nA.data < nB.data) {
			result = nA;
			result.down = merge(nA.down, nB);
		}
		else {
			result = nB;
			result.down = merge(nB.down, nA);
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FlatteningLinkedList list = new FlatteningLinkedList();
		
		list.head = list.push(list.head, 30);
		list.head = list.push(list.head, 8);
		list.head = list.push(list.head, 7);
		list.head = list.push(list.head, 5);
		
		list.head.next = list.push(list.head.next, 20);
		list.head.next = list.push(list.head.next, 10);
		
		list.head.next.next = list.push(list.head.next.next, 50);
		list.head.next.next = list.push(list.head.next.next, 22);
		list.head.next.next = list.push(list.head.next.next, 19);
		
		list.head.next.next.next = list.push(list.head.next.next.next, 45);
		list.head.next.next.next = list.push(list.head.next.next.next, 40);
		list.head.next.next.next = list.push(list.head.next.next.next, 35);
		list.head.next.next.next = list.push(list.head.next.next.next, 28);
		list.display2DLinkedList();
		
		System.out.println("Linked list head is: "+list.head.data);
		list.head = list.flatten(list.head);
		
		System.out.println("Flattened Linked List is:");
		list.displayLinkedList();
	}

}
