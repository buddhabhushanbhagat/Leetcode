package com.java.array;

import java.util.ArrayList;

public class FindDuplicateLeetcode287 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 0,1,2,3,4
		int[] nums = { 3, 1, 3, 4, 2 };
		int duplicateNumber = findDuplicate(nums);
		System.out.println("Duplicate number is " + duplicateNumber);
	}

	private static int findDuplicate(int[] nums) {
		// TODO Auto-generated method stub
		int s = nums[0];
		int f = nums[0];
		boolean flag = true;
		while (flag) {
			s = nums[s];
			f = nums[nums[f]];
			if (s == f)
				flag = false;
		}

		f = nums[0];
		while (f != s) {
			f = nums[f];
			s = nums[s];
		}
		return f;
	}

}
