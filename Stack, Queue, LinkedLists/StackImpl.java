package com.coderpad.preparation;

import java.util.Scanner;

public class StackImpl {

	static int[] stack= new int[500];
	static int top = -1;
	
	void push(int n) {
		if(top >= 499)
			System.out.println("Stack Overflow!");
		else {
			stack[++top] = n;
			//System.out.println("Element pushed in stack is "+ stack[top]);
		}
	}
	int pop() {
		if(top < 0) {
			System.out.println("Stack Underflow!");
			return -1;
		}
		else {
			int x = stack[top--];
			return x;
		}
	}
	
	int peek() {
		if(top < 0) {
			System.out.println("Stack Underflow!");
			return -1;
		}
		else {
			int x = stack[top];
			return x;
		}
	}
	boolean isEmpty( ) {
		if(top == -1)
			return true;
		else 
			return false;
	}
	void displayStack( ) {
		for(int i =top; i>= 0; i--)
			System.out.print(stack[i] + " ");
	}
	public static void main(String[] args) {
		StackImpl st = new StackImpl();
		Scanner input = new Scanner(System.in);
		char ch;
	
		do {
			System.out.println("STACK OPERATIONS:");
			System.out.println("1. Push");
			System.out.println("2. Pop");
			System.out.println("3. Peek");
			System.out.println("4. Check if Empty");
			System.out.println("5. Display Stack");
			
			System.out.println("\nEnter your choice:");
			int choice = input.nextInt();
			int ele;
			switch(choice) {
				case 1: System.out.println("Enter the element to push: ");
					ele = input.nextInt();
					st.push(ele);
					break;
				case 2: ele = st.pop();
					if(ele != -1)
						System.out.println("Element popped from stack is: "+ ele);
					break;
				case 3: ele = st.peek();
					if(ele != -1)
						System.out.println("Element at top of stack is: "+ ele);
					break;
				case 4: boolean flag = st.isEmpty();
					if(flag == true)
						System.out.println("Stack is Empty.");
					else
						System.out.println("Stack is not empty.");
					break;
				case 5: System.out.println("Stack is: ");
					st.displayStack();
					break;
				default: System.out.print("Invalid input entered.");
					break;
				
			}
			System.out.println("\nDo you wish to continue? (Y/N)");
			ch = input.next().charAt(0);
		}while(ch == 'Y' || ch == 'y');
	}
}
