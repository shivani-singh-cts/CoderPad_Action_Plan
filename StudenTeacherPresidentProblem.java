package com.coderpad.preparation;

public class StudenTeacherPresidentProblem {

	static int choosePrez(int n, int k) {
		if(n == 1)
			return 1;
		else
			return (choosePrez(n-1, k)+ k-1)%n +1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 14;
		int song = 2;
		System.out.println("Number of students is: "+num);
		System.out.println("Length of song is: "+ song);
		int prez = choosePrez(num, song);
		System.out.println("President will be "+prez+"th kid");
	}

}
