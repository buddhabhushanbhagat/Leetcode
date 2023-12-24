package nishu;

import java.util.Arrays;

public class SquareSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nums[] = {-4,-1,0,3,10};
		int arr[] = sortedSquares(nums);
	
		System.out.println(Arrays.toString(arr));
	}
	 public static int[] sortedSquares(int[] nums) {
	        int result[] = new int[nums.length];

	        int i = 0;
	        int j= nums.length-1;

	        while(j>=0) {
	            if(Math.abs(nums[i]) > Math.abs(nums[j])) {
	            	System.out.println(Math.abs(nums[i])+"::" +j);
	                result[j] = nums[i] * nums[i]; 
	                i++;
	               
	            } else{
	                result[j] = nums[j]*nums[j];
	                j--;
	            }
	                
	        }
	        return result;
	    }

}
