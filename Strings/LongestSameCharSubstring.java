package com.coderpad.preparation;

public class LongestSameCharSubstring {

	static void findLongestSubstring(String str) {
		int len=0, max_len=0;
		int index = -1;
		
		for(int i = 1; i<str.length(); i++) {
			if(str.charAt(i) == str.charAt(i-1)) 
				len++; 
			else {
				if(max_len < len) {
					max_len = len+1;
					index = i - len -1;
				}
				len = 0;	
			}	
		}
		if(max_len < len) {
			max_len = len+1;
			index = str.length() - len -1;
		}
		System.out.println("Length of longest substring is: "+ max_len +", Present at index "+ index);
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abbbccda";
		findLongestSubstring(str);
	}

}
