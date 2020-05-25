package com.coderpad.preparation;

class Node {
	int data;
	Node next;
	
	Node() {
		data =0;
		next = null;
	}
	Node(int d) {
		data = d;
		next = null;
	}
}

public class SinglyLinkedListImpl {
	Node head;
	
	//Insert node in the end of the list
	public void insertEnd(int x) {
		Node n = new Node(x);
		n.next = null;
		if(isEmpty()) {
			//head.data = x;
			//head.next = null;
			head = n;
		}
		else {
			Node nd = head;
			while(nd.next != null)
				nd = nd.next;
			nd.next = n;
		}	
	}
	
	//Insert node in the beginning of the list
		public void insertBeg(int x) {
			Node n = new Node(x);
			n.next = null;
			if(isEmpty()) {
				head = n;
			}
			else {
				n.next = head;
				head = n;
			}
		}
	
	//Delete the passed element from the list
	public void delete(int x) {
		Node n = head;
		Node prev = head;
		boolean flag = false;
		//If head is to be deleted
		if(head.data == x) {
			head = n.next;
			flag = true;
		}
		else {
			while(n != null && n.data != x) {
				prev = n;
				n = n.next;
			}
			if(n != null) {
				prev.next = n.next;
				flag = true;
			}
		}
		if(flag)
			System.out.println(x+ " is deleted from the list.");
		else
			System.out.println(x+ " is not found in the list.");
	}
	public boolean isEmpty() {
		if(this.head == null)
			return true;
		else
			return false;
	}
	public void displayLinkedList() {
		System.out.println("Linked List is : ");
		Node n = head;
		do{
			System.out.print(n.data + "-> ");
			n = n.next;
		}while(n != null);
		System.out.print("\n");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SinglyLinkedListImpl linkedList = new SinglyLinkedListImpl();
		linkedList.insertBeg(8);
		linkedList.displayLinkedList();
		
		linkedList.insertEnd(20);
		linkedList.insertEnd(40);
		linkedList.insertEnd(30);
		linkedList.insertEnd(10);
		linkedList.displayLinkedList();
		
		linkedList.insertBeg(15);
		linkedList.insertBeg(26);
		linkedList.displayLinkedList();
		
		linkedList.delete(26);
		linkedList.displayLinkedList();
		
		linkedList.delete(10);
		linkedList.displayLinkedList();
		linkedList.delete(40);
		linkedList.displayLinkedList();
		
		
	}
}
