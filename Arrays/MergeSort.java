package com.coderpad.preparation;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {12, 11, 13, 5, 6};
		mergeSort(arr, 0, arr.length -1);
		for(int i=0; i< arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}
	}
	public static void mergeSort(int[] arr, int low, int high) {
		if(low < high) {
			int mid = (low + high)/2;
			mergeSort(arr, low, mid);
			mergeSort(arr, mid+1, high);
			merge(arr, low, mid, high);
		}
	}
	
	public static void merge(int[] arr, int low, int mid, int high) {
		int n1 = mid - low + 1; 
        int n2 = high - mid; 
  
        int leftArr[] = new int [n1]; 
        int rightArr[] = new int [n2]; 
  
        for (int i=0; i<n1; ++i) 
        	leftArr[i] = arr[low + i]; 
        for (int j=0; j<n2; ++j) 
            rightArr[j] = arr[mid + 1+ j]; 
        
        int i = 0, j = 0; 
  
        int k = low; 
        while (i < n1 && j < n2) 
        { 
            if (leftArr[i] <= rightArr[j]) 
            { 
                arr[k] = leftArr[i]; 
                i++; 
            } 
            else
            { 
                arr[k] = rightArr[j]; 
                j++; 
            } 
            k++; 
        }
        
        while (i < n1) 
        { 
            arr[k] = leftArr[i]; 
            i++; 
            k++; 
        } 
        while (j < n2) 
        { 
            arr[k] = rightArr[j]; 
            j++; 
            k++; 
        } 

	}
}
