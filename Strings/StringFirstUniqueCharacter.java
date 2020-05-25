package com.coderpad.preparation;

public class StringFirstUniqueCharacter {

	static int getFirstUniqueChar(String str) {
		int count[] = new int[26];
		for(int i=0;i <str.length(); i++) {
			char ch = str.charAt(i);
			count[ch -'a']++;
		}
		int index = 0;
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(count[ch -'a'] == 1) {
				index = i;
				break;
			}
		}
		return index;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "assasination";
		int index =getFirstUniqueChar(str);
		System.out.println("First Unique Character in String is at index:"+ index+ ", i.e. "+str.charAt(index));
	}

}
