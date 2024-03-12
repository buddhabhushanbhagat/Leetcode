package com.java.array;

import java.util.HashSet;
import java.util.Set;

public class TwoSum2Leetcode167 {
// Input Array Is Sorted
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int arr[] = { 1, 2, 4, 6, 7, 9 };
		int arr[] = { 2,7,11,15};
		int target = 9;

		int[] result = pairSum(arr, target);

		for (int i : result) {
			System.out.println(i);
		}

	}

	private static int[] pairSum(int[] arr, int target) {
		int left = 0;
		int right = arr.length-1;
		while(left < right) {
			if(arr[left] +arr[right] == target) {
				return new int[] {left,right};
			}
			if(arr[left] +arr[right] > target) {
				right--;
			}else {
				left++;
			}
		}
		
		return new int[] {-1,-1};
		// TODO Auto-generated method stub
	}


}
