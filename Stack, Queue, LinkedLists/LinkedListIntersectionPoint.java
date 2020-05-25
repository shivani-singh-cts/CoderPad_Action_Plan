package com.coderpad.preparation;

class Node1 {
	int data;
	Node next;
	Node1(int d){
		data = d;
		next = null;
	}
}
public class LinkedListIntersectionPoint {

	Node head1, head2;
	
	void getIntersectionPoint() {
		int listA_len =0;
		int listB_len =0;
		int len_diff = 0;
		boolean found = false;
		Node nA = head1;
		Node nB = head2;
		while(nA != null) {
			nA = nA.next;
			listA_len++;
		}
		while(nB != null) {
			nB = nB.next;
			listB_len++;
		}
		nA = head1;
		nB = head2;
		if(listA_len > listB_len) {
			len_diff = listA_len - listB_len;
			while(len_diff != 0) {
				nA = nA.next;
				len_diff --;
			}
		}
		else {
			len_diff = listB_len - listA_len;
			while(len_diff != 0) {
				nB = nB.next;
				len_diff --;
			}
		}
		while(nA != null && nB != null) {
			if(nA.data == nB.data) {
				found = true;
				System.out.println("Intersection point of the linked lists is: "+nA.data);
				break;
			}
			nA = nA.next;
			nB = nB.next;	
		}
		if(found == false)
			System.out.println("Intersection not found.");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListIntersectionPoint list = new LinkedListIntersectionPoint();
		list.head1 = new Node(3);
		list.head1.next = new Node(6);
		list.head1.next.next = new Node(9);
		list.head1.next.next.next = new Node(15);
		list.head1.next.next.next.next = new Node(30);

		list.head2 = new Node(10);
		list.head2.next = new Node(15);
		list.head2.next.next = new Node(30);
		
		list.getIntersectionPoint();
	}

}
