package com.coderpad.preparation;

public class MergeArraysWithoutConcat {

	static void mergeArray(int arr1[], int arr2[]) {
		int len1 = arr1.length;
		int len2 = arr2.length;
		int arr[] = new int[len1 + len2];
		
		int i, j;
		for(i = 0;i<len1; i++)
			arr[i] = arr1[i];
		int temp = i;

		for(j=0; j<len2; j++) {
			arr[temp] = arr2[j];
			temp ++;
		}
		System.out.println("Merged Array is: ");
		for(int ele: arr)
			System.out.print(ele +" ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = {1, 2, 3};
		int arr2[] = {4, 5, 6};
		
		mergeArray(arr1, arr2);
	}

}
