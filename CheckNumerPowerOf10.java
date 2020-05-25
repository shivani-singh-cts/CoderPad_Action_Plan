package com.coderpad.preparation;

public class CheckNumerPowerOf10 {

	static boolean checkIfPowerOf10(int num) {
		while(num % 10 == 0) {
			num = num/10;
		}
		if(num == 1)
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 5;
		boolean result = checkIfPowerOf10(num);
		if(result == true)
			System.out.println(num + " is a power of 10");
		else 
			System.out.println(num + " is not a power of 10");
	}

}
