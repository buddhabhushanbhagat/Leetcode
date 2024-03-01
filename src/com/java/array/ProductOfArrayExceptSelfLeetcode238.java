package com.java.array;

public class ProductOfArrayExceptSelfLeetcode238 {

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
		
        int[] result = new int[nums.length];
        int leftProduct = 1;
        int rightProduct = 1;      
        int[] leftArray = new int[nums.length];
        int[] rightArray = new int[nums.length];
        //[1,
        leftArray[0] = leftProduct;
        for(int i = 1;i<nums.length;i++) {
        	leftProduct *= nums[i-1];
        	leftArray[i] = leftProduct;
        }
        rightArray[nums.length-1] = rightProduct;
        
        for(int i = nums.length-2;i>=0;i--) {
        	rightProduct *= nums[i+1];
        	rightArray[i] = rightProduct;
        }
        
        for(int i=0;i<nums.length;i++) {
        	result[i] = leftArray[i]*rightArray[i];
        }
        
//        for(int i=0; i<nums.length;i++) {
//        	int right = i+1;
//        	int left = 0;
//        	while(right < nums.length) {
//        		rightProduct = rightProduct* nums[right];
//        		right++;
//        	} 
//
//        	while(left < i) {
//        		leftProduct =leftProduct* nums[left];
//        		left++;
//        	}
//        	
//        	result[i] = leftProduct*rightProduct;
//        	  leftProduct = 1;
//              rightProduct = 1;    
//        }
         return result;
	}

}
