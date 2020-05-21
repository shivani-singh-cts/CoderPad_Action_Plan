package com.coderpad.preparation;

import java.util.Scanner;

public class RecursionFibonacci {

	static int first =0, second =1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter a count for terms in Fibonacci series: ");
		Scanner input = new Scanner(System.in);
		int count = input.nextInt();
		for(int i =0;i<count;i++) {
			System.out.print(fibonacci(i) + " ");
		}
	}
	public static int fibonacci(int n) {
		if(n==0 || n==1)
			return n;
		return fibonacci(n-1) + fibonacci (n-2);
	}
	
}
