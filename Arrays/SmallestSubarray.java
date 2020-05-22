package com.coderpad.preparation;

//Find smallest subarray with sum greater than a given value

public class SmallestSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {1, 10, 3, 40, 18};
		int num = 50; //given value - sum of subarray should be greater than num
		
		findSmallestSubarray(array, num);
	}
	public static void findSmallestSubarray(int[] arr, int x) {
		int curr_sum=0;
		int start = 0;
		int minLength=arr.length;
		int subStart=0, subEnd=0;
		boolean flag = false;
		
		for(int i = 0;i<=arr.length; i++) {
			while(curr_sum > x) {
				flag = true;
				curr_sum -= arr[start];
				if(i-start <= minLength) {
					minLength = (i-start);
					subStart = start;
					subEnd = i;
				}
				start ++;
			}
			if(i < arr.length)
				curr_sum += arr[i];
		}
		if(flag==true) {
			System.out.println("Length of smallest subarray: "+ minLength);
			System.out.print("Smallest subarray is: ");
			for(int i = subStart; i< subEnd; i++) {
				System.out.print(arr[i] + " ");
			}
		}
		else
			System.out.println("No Subarray Found");
	}
}
