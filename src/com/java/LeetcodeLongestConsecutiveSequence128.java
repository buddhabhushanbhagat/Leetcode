package com.java;

import java.util.Arrays;

public class LeetcodeLongestConsecutiveSequence128 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {100,4,200,1,3,2};
		int n = longestConsecutive(nums);
		System.out.println(n);
	}

	private static int longestConsecutive(int[] nums) {
		// TODO Auto-generated method stub
		Arrays.sort(nums);
		int length = 0;
		int maxLength = 0;
		int previous = 0;
		for(int i = 1; i<nums.length;i++) {
			if(nums[i] - nums[previous] == 1) {
				length++;
			}
			previous = i;
			maxLength = maxLength<length? length:maxLength;
		}
		
		return maxLength+1;
	}

}
