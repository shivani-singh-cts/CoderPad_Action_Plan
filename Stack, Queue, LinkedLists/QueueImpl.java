package com.coderpad.preparation;

import java.util.Scanner;

public class QueueImpl {

	static int[] queue = new int[500];
	static int front=0, rear =0;
	
	static void enqueue(int n) {
		if(rear >= 499) 
			System.out.println("Queue is Full.");
		else 
			queue[rear++] = n;
	}
	
	static int dequeue() {
		if(front==rear ) {
			System.out.println("Queue is Empty.");
			return 0;
		}
		else {
			int x = queue[front];
			for (int i=0; i<rear; i++) {
				//System.out.print("Shifting "+ queue[i+1]+" to "+i);
				queue[i] = queue[i+1];
			}
			rear --;
			return x;
		}
	}
	static int element() {
		if(front==rear) {
			System.out.println("Queue is Empty.");
			return 0;
		}
		else {
			int x = queue[front];
			return x;
		}
	}
	static void displayQueue() {
		if(front==rear) 
			System.out.println("Queue is Empty.");
		else {
			System.out.print("Queue is: ");
			for(int i = front; i< rear; i++) 
				System.out.print(queue[i]+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		char ch;
	
		do {
			System.out.println("QUEUE OPERATIONS:");
			System.out.println("1. Enqueue");
			System.out.println("2. Dequeue");
			System.out.println("3. Element");
			System.out.println("4. Display Stack");
			
			System.out.println("\nEnter your choice:");
			int choice = input.nextInt();
			int ele;
			switch(choice) {
				case 1: System.out.println("Enter the element to insert: ");
					ele = input.nextInt();
					enqueue(ele);
					break;
				case 2: ele = dequeue();
					if(ele != 0)
						System.out.println("Element deleted from queue is: "+ ele);
					break;
				case 3: ele = element();
					if(ele != 0)
						System.out.println("Element at front of queue is: "+ ele);
					break;
				case 4: displayQueue();
					break;
				default: System.out.print("Invalid choice entered");
					break;
			}
			System.out.println("\nDo you wish to continue? (Y/N)");
			ch = input.next().charAt(0);
		}while(ch == 'Y' || ch == 'y');
	}

}
