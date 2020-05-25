package com.coderpad.preparation;

import java.util.Arrays;

public class CheckArrayEquality {

	static boolean checkArrayEqual(int[] arr1, int[] arr2) {
		if(arr1.length != arr2.length)
			return false;
		else {
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			for(int i=0; i<arr1.length; i++) {
				if(arr1[i] != arr2[i])
					return false;
			}
			return true;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = {1, 2, 5, 4, 0, 2, 1};
		int arr2[] = {2, 4, 5, 0, 1, 1, 2};
		
		//Two arrays are said to be equal if both of them contain same set of elements,
		//arrangements (or permutation) of elements may be different though.
		boolean result = checkArrayEqual(arr1, arr2);
		if(result == true)
			System.out.println("Both the Arrays are equal.");
		else
			System.out.println("Arrays are NOT equal.");
	}

}
