package com.java.array;

public class SingleNumberLeetcode136 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,2,5};
		 int singleNumber = singleNumber(nums);
		 System.out.println("singleNumber is "+singleNumber);
	}

	private static int singleNumber(int[] nums) {
		// TODO Auto-generated method stub
		int xor = 0;
		// 0 ^ number = number and sameNum ^ sameNum = 0
		for(int i:nums) {
			xor = xor ^ i;
		}
		
		return xor;
	}

}
