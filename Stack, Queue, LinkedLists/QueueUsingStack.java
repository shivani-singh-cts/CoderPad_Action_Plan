package com.coderpad.preparation;

import java.util.Stack;

public class QueueUsingStack {

	static Stack<Integer> s1 = new Stack<Integer>();
	static Stack<Integer> s2 = new Stack<Integer>();
	
	void enqueue(int x) {
		if(s1.isEmpty()) 
			s1.push(x);
		else {
			int ele;
			while(s1.isEmpty() == false) {
				ele = s1.pop();
				s2.push(ele);
			}
			s1.push(x);
			while(s2.isEmpty() == false) {
				ele = s2.pop();
				s1.push(ele);
			}
		}
	}
	int dequeue() {
		if(s1.isEmpty()) {
			System.out.println("Queue is empty");
			return -1;
		}
		else
			return s1.pop();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueUsingStack q = new QueueUsingStack();
		q.enqueue(20);
		q.enqueue(10);
		q.enqueue(30);
		System.out.println("Display queue after all enqueue operation");
		System.out.println(s1);
		System.out.println("Dequeue from queue: "+q.dequeue());
		System.out.println("Dequeue from queue: "+q.dequeue());
		System.out.println(s1);
	}

}
