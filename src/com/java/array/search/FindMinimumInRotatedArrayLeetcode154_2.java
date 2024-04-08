package com.java.array.search;

public class FindMinimumInRotatedArrayLeetcode154_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 3,4,5,1,2 };
		int minimumIndex = search(nums);
		System.out.println(minimumIndex);
	}

	private static int search(int[] nums) {
		// TODO Auto-generated method stub
		 int pivot = findPivot(nums, 0, nums.length-1); 
		 if(pivot == -1)
			 return findMinimum(nums,0,nums.length-1);
		int minElementLeft = findMinimum(nums,0,pivot);
		int minElementRight = findMinimum(nums,pivot+1,nums.length-1);
		int min = (minElementLeft > minElementRight) ?minElementRight:minElementLeft;
		return min;
	}

	private static int findMinimum(int[] nums, int i, int j) {
		// TODO Auto-generated method stub
		int min = Integer.MAX_VALUE;
		for(int index=i;index<=j;index++) {
			if(nums[index] < min)
				min = nums[index];
		}
		return min;
	}

	
}
