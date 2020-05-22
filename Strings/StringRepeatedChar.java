package com.coderpad.preparation;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class StringRepeatedChar {

	static int count[] = new int[26];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter a String: ");
		Scanner input = new Scanner(System.in);
		String str = input.next();
		
		getCharCount(str);
		//Find first repeated character 
		int rep = findFirstRepeatedChar(str);
		if(rep != -1)
			System.out.println("First Repeating Character is at index "+ rep + ", i.e. the character "+ str.charAt(rep));
		else
			System.out.println("There is no repeating character in the String.");
			
		//Find first repeated character 
		int nrep = findFirstNonRepeatedChar(str);
		if(nrep != -1)
			System.out.println("First Non-Repeating Character is at index "+ nrep + ", i.e. the character "+ str.charAt(nrep));
		else
			System.out.println("There is no non-repeating character in the String.");
		
		//Find Last Repeated Character
		int lrep = findLastRepeatedChar(str);
		if(lrep != -1)
			System.out.println("Last Repeating Character is at index "+ lrep + ", i.e. the character "+ str.charAt(lrep));
		else
			System.out.println("There is no repeating character in the String.");
		
		//Find last non repeated character 
		int l_nrep = findLastNonRepeatedChar(str);
		if(l_nrep != -1)
			System.out.println("First Non-Repeating Character is at index "+ l_nrep + ", i.e. the character "+ str.charAt(l_nrep));
		else
			System.out.println("There is no non-repeating character in the String.");
				
	}
	public static void getCharCount(String str) {
		for (int i=0;i <str.length();i++) {
			char ch = str.charAt(i);
			count[ch -'a'] += 1;
		}
	}
	public static int findFirstRepeatedChar(String str) {
		/*
		 * Set<Character> set = new HashSet<Character>(); for(int i =0; i< str.length();
		 * ++i) { System.out.println("i = "+i+" char at i is= "+str.charAt(i));
		 * if(set.add(str.charAt(i)) == false) return i; } return -1;
		 */
		for(int i=0; i< str.charAt(i); i++) {
			char ch = str.charAt(i);
			if(count[ch - 'a']>1)
				return i;
		}
		return -1;
	}
	
	public static int findFirstNonRepeatedChar(String str) {
		for(int i=0; i< str.length(); i++) {
			char ch = str.charAt(i);
			if(count[ch - 'a'] == 1)
				return i;
		}
		return -1;
	}
	 public static int findLastRepeatedChar(String str) {
		 for(int i=str.length() -1; i>0 ; i--) {
			 char ch = str.charAt(i);
			 if(count[ch - 'a'] > 1)
				 return i;
		 }
		 return -1;
	 }
	 public static int findLastNonRepeatedChar(String str) {
		 for(int i=str.length() -1; i>0 ; i--) {
			 char ch = str.charAt(i);
			 if(count[ch - 'a'] == 1)
				 return i;
		 }
		 return -1;
	 }
}
