package com.coderpad.preparation;

class NodeNew {
	int data;
	NodeNew next;
	NodeNew prev;
}
public class DoublyLinkedListImpl {
	NodeNew head;
	
	void insertBeg(int x) {
		NodeNew nd = new NodeNew();
		nd.data = x;
		nd.next = null;
		nd.prev = null;
		
		if(isEmpty()) {
			head = nd;
		}
		else {
			nd.next = head;
			nd.prev = null;
			head = nd;
		}
	}
	
	void insertEnd(int x) {
		NodeNew nd = new NodeNew();
		nd.data = x;
		nd.next = null;
		nd.prev = null;
		if(isEmpty()) {
			head = nd;
		}
		else {
			NodeNew curr = head;
			while(curr.next != null) {
				curr = curr.next;
			}
			curr.next = nd;
			nd.prev = curr;
			nd.next = null;
		}
	}
	
	void delete(int x) {
		NodeNew nd;
		boolean flag = false;
		//If head is to be deleted
		if(head != null && head.data == x) {
			nd = head.next;
			nd.prev = null;
			head = nd;
			flag = true;
		}
		else {
			nd = head;
			while(nd.next != null && nd.data != x) {
				nd = nd.next;
			}
			if(nd.next != null) {
				nd.prev.next = nd.next;
				nd.next.prev = nd.prev;
				flag = true;
			}
			else { //last node is to be deleted
				if(nd.data == x) {
					nd.prev.next = null;
					flag = true;
				}
			}
				
		}
		if(flag)
			System.out.println(x+ " is deleted from the list.");
		else
			System.out.println(x+ " is not found in the list.");

	}
	boolean isEmpty() {
		if(this.head == null)
			return true;
		else
			return false;
	}
	void displayLinkedList() {
		System.out.println("Linked List is : ");
		NodeNew nd = head;
		do{
			System.out.print(nd.data + "-> ");
			nd = nd.next;
		}while(nd != null);
		System.out.print("\n");
	}
	public static void main(String[] args) {
		DoublyLinkedListImpl linkedList = new DoublyLinkedListImpl();
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
