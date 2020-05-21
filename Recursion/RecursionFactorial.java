package com.coderpad.preparation;

import java.util.Scanner;
public class RecursionFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter a Number: ");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		System.out.println("Factorial = " + factorial(num));
	}
	
	public static int factorial(int n) {
		if(n==0 || n==1)
			return 1;
		else 
			return n * factorial(n-1);
	}
}
