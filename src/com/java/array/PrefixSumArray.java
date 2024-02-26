package com.java.array;

public class PrefixSumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10, 20, 10, 5, 15};
		int[] prefixSumArray = prefixSum(arr);
		
		for(int i:prefixSumArray) {
			System.out.println(i);
		}
		
	}

	private static int[] prefixSum(int[] arr) {
		// TODO Auto-generated method stub
		int[] result = new int[arr.length];
		int sum = 0;
		for(int i = 0;i<arr.length;i++) {
			sum = sum+arr[i]; 
			result[i] = sum;
		}
		
		return result;
	}

}
