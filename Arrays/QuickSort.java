package com.coderpad.preparation;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {12, 11, 13, 5, 6};
		int n = arr.length;
		quickSort(arr, 0, n-1);
		System.out.println("Array after Sorting is:");
		for(int i=0; i< arr.length;i++) 
			System.out.print(arr[i]+ " ");
	}
	public static void quickSort(int[] arr, int low, int high) {
		int index = partition(arr, low, high);
		if(low < index -1)
			quickSort(arr, low, index -1);
		if(high > index)
			quickSort(arr, index, high);
	}
	public static int partition(int[] arr, int low, int high) {
		int pivot = arr[(low+high)/2];
		int i=low, j=high;
		int temp;
		
		while(i<=j) {
			while(arr[i] < pivot)
				i++;
			while(arr[j] > pivot) 
				j--;
			if(i <= j) {
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
		}
		return i;
	}
}
