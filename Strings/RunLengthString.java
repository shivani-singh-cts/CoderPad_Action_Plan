package com.coderpad.preparation;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class RunLengthString {

	//Write a program to print run length or compression of a string eg: 'abcabcd' //output: a2b2c2d1
	static void runLengthEncode(String str) { 
		if(str.trim().isEmpty()) {
			System.out.println("Run Length Encoding is: ");
			return;
		}
		int n =str.length();
		LinkedHashMap<Character, Integer> lhm = new LinkedHashMap<Character,Integer>(); 
		for(char c: str.toCharArray()) { 
			if(lhm.containsKey(c))
				lhm.put(c, lhm.get(c)+1); 
			else 
				lhm.put(c, 1); 
		}
		System.out.println("Run Length Encoding is: "); 
		lhm.forEach((c,i) -> {System.out.print(c); System.out.print(i); }); 
	}
	public static void main(String[] args) { 
		String str ="aabbccdde";
		if(str != null)
			runLengthEncode(str); 
		else
			System.out.println("Run Length Encoding is: "+""); 
	}
}
