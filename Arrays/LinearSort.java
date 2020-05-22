package com.coderpad.preparation;

public class LinearSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {12, 11, 13, 5, 6};
		System.out.println("Array in sorted order is: ");
		linearSort(arr);
		for(int i=0; i< arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}
	}
	
	public static void linearSort(int[] arr) {
		int n = arr.length;
		int j;
		for(int i =1; i<n; i++) {
			int key = arr[i];
			j = i-1;
			while (j>=0 && arr[j] > key ) {
				arr[j+1]= arr[j];
				j = j-1;
			}
			arr[j+1]=key;
		}
	}
}
