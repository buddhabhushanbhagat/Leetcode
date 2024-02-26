package com.java.array;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ContainsDuplicateLeetcode217 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 2, 3, 4 };
		boolean containsDuplicate = containsDuplicate(nums);
		System.out.println(containsDuplicate);
	}

	private static boolean containsDuplicate(int[] nums) {
		// TODO Auto-generated method stub
		boolean result = false;
		Set<Integer> set = new HashSet<>();
		for (int num : nums) {
			if(set.contains(num)) {
				result = true;
				return result;
			}else
				set.add(num);
		}
		return result;
	}

}
