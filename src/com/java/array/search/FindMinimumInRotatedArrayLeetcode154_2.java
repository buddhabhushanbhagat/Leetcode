package com.java.array.search;

public class FindMinimumInRotatedArrayLeetcode154_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 3,1,2 };
		int minimumIndex = search(nums);
		System.out.println(minimumIndex);
	}

	private static int search(int[] nums) {
		// TODO Auto-generated method stub
		 int pivot = findPivot(nums); 
		 if(pivot == -1)
			 return findMinimum(nums,0,nums.length-1);
		int minElementLeft = findMinimum(nums,0,pivot);
		int minElementRight = findMinimum(nums,pivot+1,nums.length-1);
		int min = (minElementLeft > minElementRight) ?minElementRight:minElementLeft;
		return min;
	}
// it takes O(n) time
//	private static int findPivot(int[] nums) {
//		// TODO Auto-generated method stub
//		int pivot = -1;
//		
//		for(int i=0;i<nums.length-1;i++) {
//			if(nums[i] > nums[i+1]) {
//				pivot = i;
//				return pivot;
//			}
//		}
//		
//		return pivot;
//	}

	//3,4,5,1,2 
	private static int findPivot(int[] nums) {
		// TODO Auto-generated method stub
		int pivot = -1;
		if(nums[0] < nums[nums.length-1])
			return pivot;
		int left = 0;
		int right = nums.length-1;
		while(left < right) {
			int mid = left+(right-left)/2;
			if(nums[mid] > nums[right] ) {
				right = mid;
			}else {
				left = mid+1;
			}
		}
		System.out.println("right:"+right);
		return right;
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
