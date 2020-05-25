package com.coderpad.preparation;

public class StackSortingRecursion {

	static void sortedInsert(StackImpl st, int x) {
		if(st.isEmpty() || x < st.peek()) {
			st.push(x);
			return;
		}
		int temp = st.pop();
		sortedInsert(st, x);
		st.push(temp);
	}
	static void sortStack(StackImpl st) {
		if(!st.isEmpty()) {
			int temp = st.pop();
			sortStack(st);
			sortedInsert(st, temp);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackImpl stack = new StackImpl();
		stack.push(30);
		stack.push(-5);
		stack.push(18);
		stack.push(14);
		stack.push(-3);
		
		System.out.println("Stack elements are: ");
		stack.displayStack();
		
		System.out.println("\nStack elements after sorting are: ");
		sortStack(stack);
		stack.displayStack();	
	}

}
