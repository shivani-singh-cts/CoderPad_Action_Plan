package com.coderpad.preparation;

public class MaxSumSubArrayProblem {

	public static int maxSubArraySum(int[] arr) {
		int max_so_far = 0;
		int max_ending_here = 0;
		for(int i =0;i< arr.length; i++) {
			max_ending_here += arr[i];
			if(max_ending_here < 0)
				max_ending_here = 0;
			if(max_so_far < max_ending_here)
				max_so_far = max_ending_here;
		}
		return max_so_far;
	}
	
	//Max sum of sub arrays - kedene's algo
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,-2,5};
		System.out.println("Maximum sum of contiguous Sub-Array is: "+ maxSubArraySum(arr));
	}

}
