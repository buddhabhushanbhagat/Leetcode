package com.java.array;

public class ProductOfArrayExceptSelfLeetcode238_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3,4};
		int[] result = productExceptSelf(nums);
		
		for(int i:result) {
			System.out.println("each index"+i);
		}
	}

	private static int[] productExceptSelf(int[] nums) {
		// TODO Auto-generated method stub
		int[] productArray = new int[nums.length];
		
		int[] leftProductArr = new int[nums.length];
		int[] rightProductArr = new int[nums.length];
		
		int leftProduct = 1;
		leftProductArr[0] = leftProduct;
		for(int i=1;i<nums.length;i++) {
			leftProduct *= nums[i-1];
			leftProductArr[i] = leftProduct;
		}
		
		int rightProduct = 1;
		rightProductArr[nums.length-1] = rightProduct;
		for(int i=nums.length-2;i>=0;i--) {
			rightProduct *= nums[i+1];
			rightProductArr[i] = rightProduct;
		}
		
		for(int i=0;i<nums.length;i++) {
			productArray[i] = leftProductArr[i]*rightProductArr[i];
		}
		return productArray;
	}

	

}
