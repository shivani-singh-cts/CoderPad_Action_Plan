package com.coderpad.preparation;

import java.util.Scanner;

public class EggDroppingPuzzle {

	static int max(int a, int b) {
		if(a > b)
			return a;
		else
			return b;
	}
	static int eggDrop(int n, int k) {
		int eggFloor[][] = new int[n+1][k+1];
		int i, j, x, result;
		
		//1 trail for 1 floor and 0 trail for 0 floors
		for(i=1; i<=n; i++) {
			eggFloor[i][0] = 0;
			eggFloor[i][1] = 1;
		}
		//j trials for 1 egg-j floor
		for(j=1; j<=k; j++)
			eggFloor[1][j] = j;
		
		for(i=2; i<=n; i++) {
			for(j=2; j<=k; j++) {
				eggFloor[i][j] = Integer.MAX_VALUE;
				for(x=1; x<=j; x++) {
					result = 1 + max(eggFloor[i-1][x-1], eggFloor[i][j-x]);
					if(result < eggFloor[i][j])
						eggFloor[i][j] = result;
				}
			}
		}
		return eggFloor[n][k];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.println("Enter number of eggs: ");
		int n = input.nextInt();
		System.out.println("Enter number of floors: ");
		int k = input.nextInt();
		System.out.println("Minimum number of trials in worst case with "+n+" eggs and "+k+" floors are: "+eggDrop(n,k));
	}

}
