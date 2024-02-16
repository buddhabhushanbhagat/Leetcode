package com.java.array;

import java.util.ArrayList;

public class FindDuplicateLeetcode287 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,4,3,2};
		int duplicateNumber = findDuplicate(nums);
		ArrayList al = new ArrayList<>();
		System.out.println("arrayList size: "+al.size());

		al.add(5);
		al.add(null);
		al.add(null);
		al.add(null);
		al.add(60);
		
		
		al.forEach(e->System.out.println(e));

		System.out.println("Duplicate number is "+duplicateNumber);
	}

	private static int findDuplicate(int[] nums) {
		// TODO Auto-generated method stub
		int total = 0;
		for(int num: nums)
			total += num;
	int numbers = nums.length-1;
	
	int sum = (numbers*(numbers+1))/2;
	
		
		return total-sum;
	}

}
