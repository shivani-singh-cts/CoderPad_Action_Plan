package com.coderpad.preparation;

import java.lang.Math;
public class UglyNumberProbelmDP {

	static int getNthUglyNumber(int n) {
		int uglyNum[] = new int[n];
		uglyNum[0] = 1;
		int i2=0, i3=0, i5 = 0;
		int next_multiple_2 = 2;
		int next_multiple_3 = 3;
		int next_multiple_5 = 5;
		int nextUglyNum = 1;
		for(int i=1;i< n; i++) {
			nextUglyNum = Math.min(next_multiple_2, Math.min(next_multiple_3, next_multiple_5));
			uglyNum[i] = nextUglyNum;
			
			if(nextUglyNum == next_multiple_2) {
				i2 = i2+1;
				next_multiple_2 = uglyNum[i2] * 2;
			}
			if(nextUglyNum == next_multiple_3) {
				i3 = i3+1;
				next_multiple_3 = uglyNum[i3] * 3;
			}
			if(nextUglyNum == next_multiple_5) {
				i5 = i5+1;
				next_multiple_5 = uglyNum[i5] * 5;
			}
		}
		return nextUglyNum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 150;
		System.out.println("N = "+n);
		System.out.println("Nth Ugly number is "+getNthUglyNumber(n));
	}

}
