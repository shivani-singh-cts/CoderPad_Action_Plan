package com.coderpad.preparation;

import java.util.Scanner;

public class CheckAnagramIsPalindrome {

	//Write a program to check anagram of a word is Palindrome or not?
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("Enter a String: ");
		Scanner input = new Scanner(System.in);
		String str = input.next();
		
		boolean result = checkPalindromeAnagram(str);
		if(result == true)
			System.out.println("Palindrome Anagram of the string EXISTS");
		else
			System.out.println("Palindrom Anagram of the string DOESN'T EXIST.");
		
	}

	public static boolean checkPalindromeAnagram(String str) {
		int count[] = new int[26];
		for(int i=0; i< str.length(); i++) {
			char ch = str.charAt(i);
			count[ch - 'a']+=1;
		}
		
		int odd=0;
		for (int i=0; i< count.length; i++) {
			if(count[i]%2 != 0)
				odd++;
			if(odd > 1)
				return false;
		}
		return true;
	}
}
