package com.coderpad.preparation;

import java.util.Scanner;

public class ClimbStaircase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the number of stairs: ");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		System.out.println("Ways to climb staircase is: "+climbStairs(n));
	}
	
	public static int climbStairs(int n) {
		int result =0;
		if(n==0 || n==1)
			return 1;
		else if(n== 2)
			return 2;
		else
			result = climbStairs(n-1) + climbStairs(n-2) + climbStairs(n-3);
		return result;
	}
}
