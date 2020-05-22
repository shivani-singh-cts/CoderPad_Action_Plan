package com.coderpad.preparation;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {12, 11, 13, 5, 6};
		System.out.println("Array in sorted order is: ");
		bubbleSort(arr);
		for(int i=0; i< arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}
	}
	public static void bubbleSort(int[] arr) {
		int n = arr.length;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-1-i;j++) {
				if(arr[j+1] < arr[j]) {
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
				
		}
	}
}
