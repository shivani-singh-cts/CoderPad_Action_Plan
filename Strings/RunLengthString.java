package com.coderpad.preparation;

import java.util.Scanner;

public class RunLengthString {

	//Write a program to print run length or compression of a string eg: 'abcabcd' //output: a2b2c2d1
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter a String: ");
		Scanner input = new Scanner(System.in);
		String str = input.next();
		System.out.println("Run Length of the input string is: " + findRunLength(str));
	}
	
	public static String findRunLength(String str) {
		int count[] = new int[26];
		for(int i=0; i<str.length(); i++) {
			char ch=str.charAt(i);
			count[ch-'a'] +=1;
		}
		String result = "";
		char temp;
		for(int i=0; i< count.length; i++) {
			if(count[i] != 0) {
				temp = (char)(i+'a');
				result += Character.toString(temp);
				result += Integer.toString(count[i]);
			}
		}
		return result;
	}

}
