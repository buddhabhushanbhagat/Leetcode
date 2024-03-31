package com.java.array.search;

public class BinarySearchInRotatedArrayLeetcode33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {4,5,6,7,0,1,2};
		int target = 0;
		int searchIndex = search(nums,target);
		System.out.println(searchIndex);
	}

	private static int search(int[] nums, int target) {
		// TODO Auto-generated method stub
		int left = 0;
		int right = nums.length-1;
		while(left<=right) {
			int mid = left+(right-left)/2;
			if(nums[mid] == target) 
				return mid;
			else if(nums[mid] > target)
				right = mid-1;
			else
				left = mid+1;
		}
		
		return -1;
	}

}
