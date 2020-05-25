package com.coderpad.preparation;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {15, 20, 30, 45, 48, 100, 176};
		System.out.print("Enter the element to be searched: ");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int result = binarySearch(arr, 0, arr.length-1, num);
		
		if(result >= 0)
			System.out.println("Element is present at index: "+result);
		else
			System.out.println("Element not found in the array.");
	}

	public static int binarySearch(int[] arr, int low, int high, int x) {
		if(low == high) {
			if(x == arr[low])
				return low;
			else
				return -1;
		}
		else {
			int mid = (low+high)/2;
			if(arr[mid] == x)
				return mid;
			else if(x < arr[mid])
				return binarySearch(arr, low, mid-1, x);
			else
				return binarySearch(arr, mid+1, high, x);
		}
	}
}