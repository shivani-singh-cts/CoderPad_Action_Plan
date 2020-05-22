package com.coderpad.preparation;

import java.util.Scanner;

public class AverageScore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of subjects for which score to be entered: ");
		int num = input.nextInt();
		
		System.out.println("Enter scores: ");
		int i=0, sum=0;
		int score[] = new int[num];
		while(i< num) {
			score[i]= input.nextInt();
			sum += score[i];
			i++;
		}
		int avg = sum/num;
		System.out.println("Average score is: "+ avg);
	}

}
