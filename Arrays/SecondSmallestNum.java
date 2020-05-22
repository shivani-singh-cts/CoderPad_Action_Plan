package com.coderpad.preparation;

//Find second smallest number from given array.

public class SecondSmallestNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {12, 35, 1, 10, 34, 1};
		int max =arr[0];
		int secMax = arr[0];
		for(int i =1;i< arr.length; i++) {
			if(arr[i]> max) {
				secMax=max;
				max= arr[i];
			}
			else if(arr[i]<max && arr[i] > secMax)
				secMax=arr[i];
			else 
				continue;
		}
		System.out.println("Maximum is "+max);
		System.out.println("Second maximum is: "+ secMax);
	}

}
