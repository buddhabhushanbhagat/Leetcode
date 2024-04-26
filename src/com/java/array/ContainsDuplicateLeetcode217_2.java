package com.java.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
//Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
public class ContainsDuplicateLeetcode217_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 2, 3, 4 };
		boolean containsDuplicate1 = containsDuplicate1(nums);
		System.out.println(containsDuplicate1);
	}
	//Way-1
	private static boolean containsDuplicate1(int[] nums) {
		Set<Integer> set = new HashSet<>();
		for(int i:nums) {
			if(set.contains(i))
				return true;
			set.add(i);
		}
		return false;
	}

	//Way-2
	private static boolean containsDuplicate2(int[] nums) {
		Arrays.sort(nums);
		int pre = 0;
		for(int i=1;i<nums.length;i++,pre++) {
			if(nums[pre] == nums[i])
				return true;
			
		}
	return false;
	}

}
