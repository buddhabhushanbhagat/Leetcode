package com.java.array.search;

public class BinarySearchLeetcode704 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {-1,0,3,5,9,12};
		int target = 9;
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
