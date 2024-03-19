package com.java.array;

public class MissingNumPersistent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,4,5,6};
		int n=6;
		int num = missingNum(arr,n);
		System.out.println("Missing num:"+num);
	}

	private static int missingNum(int[] arr, int n) {
		// TODO Auto-generated method stub
		int[] nums = new int[n+1];
		
		for(int num:arr) {
			nums[num] = 1;
		}
		
		for(int i=1;i<nums.length;i++) {
			if(nums[i] == 0) {
				return i;
			}
		}
		
		return -1;
	}

	/*
	 * private static int missingNum(int[] arr, int n) { // TODO Auto-generated
	 * method stub
	 * 
	 * int xor = 0;
	 * 
	 * for(int i:arr) { xor ^= i; }
	 * 
	 * for(int i=1;i<=n;i++ ) { xor ^=i; }
	 * 
	 * return xor; }
	 */

	/*
	 * private static int missingNum(int[] arr, int n) { // TODO Auto-generated
	 * method stub
	 * 
	 * int sumOfN = (n*(n+1))/2;
	 * 
	 * int sumOfArray = 0;
	 * 
	 * for(int i=0;i<arr.length;i++) { sumOfArray +=arr[i]; }
	 * 
	 * return sumOfN-sumOfArray; }
	 */

}
