package com.java.array.search;

public class FindMinimumInRotatedArrayLeetcode153 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1,2,3 };
		int minimumIndex = search(nums);
		System.out.println(minimumIndex);
	}

	private static int search(int[] nums) {
		// TODO Auto-generated method stub

		int pivot = findPivot(nums);
		System.out.println("pivot:" + pivot);
		if (pivot == -1 || pivot == nums.length-1) {
			return nums[0];
		}

		return nums[pivot + 1];
	}

	private static int findPivot(int[] nums) {
		// TODO Auto-generated method stub

		int left = 0;
		int right = nums.length - 1;
		
		if(nums.length == 1) {
			return -1;
		}

		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (left == right)
				return left;
			if (mid < right && nums[mid] > nums[mid + 1]) {
				return mid;
			}
			if (mid > left && nums[mid] < nums[mid - 1])
				return mid - 1;
			if (nums[left] >= nums[mid])
				right = mid - 1;
			else
				left = mid + 1;
		}
		return -1;
	}
}
