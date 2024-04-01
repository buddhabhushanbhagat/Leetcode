package com.java.array.search;

public class BinarySearchInRotatedArrayLeetcode33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {4,5,6,7,0,1,2};
		int target = 9;
		int searchIndex = search(nums,target);
		System.out.println(searchIndex);
	}

	private static int search(int[] nums, int target) {
		// TODO Auto-generated method stub
		
		// 4,5,6,7,0,1,2
		int pivot = findPivot(nums,target);
		
		if(nums[pivot] == target) 
			return pivot;
		if(pivot == -1) {
			return searchLeft(nums, target,0,nums.length-1);
		}
		if(nums[0] <= target) 
			 return searchLeft(nums,target,0,pivot);
		else
			 return searchLeft(nums,target,pivot+1,nums.length-1);
	}

	private static int searchLeft(int[] nums, int target, int left, int right) {
		// TODO Auto-generated method stub
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

	private static int findPivot(int[] nums, int target) {
		// TODO Auto-generated method stub
		// 4,5,6,7,0,1,2
		int left = 0;
		int right = nums.length-1;
		
		while(left <= right) {
			int mid = left+(right-left)/2;
			if(left == right) {
				return left;
			}
			if(mid< right && nums[mid] >nums[mid+1])
				return mid;
			if(mid> left && nums[mid] < nums[mid-1])
				return mid-1;
			if(nums[left] > nums[mid])
				right = mid-1;
			else
				left = mid+1;
			
		}

		
		return -1;
	}

}
