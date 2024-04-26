package com.java.array;

import java.util.ArrayList;
import java.util.List;

public class FindMissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0,1,2,3,4,6,7,8};
		
		int missingNumber = findMissingNumber(arr);
		int missingNumber2 = findMissingNumber2(arr);
		int missingNumber3 = findMissingNumber3(arr);
		System.out.println("Missing number is:" +missingNumber);
		System.out.println("Missing number is:" +missingNumber2);
		
	}

	private static int findMissingNumber3(int[] arr) {
		// TODO Auto-generated method stub
		int sumOfN = ((arr.length)*(arr.length+1))/2;
		int sumOfArr = 0;
		for(int i:arr) {
			sumOfArr+=i;
		}
		return sumOfN-sumOfArr;
	}

	//Way 2
	private static int findMissingNumber2(int[] arr) {
		// TODO Auto-generated method stub
		if(arr[0] !=0)
			return 0;
		if(arr[arr.length-1] != arr.length)
			return arr.length;
		int pre = 0;
		for(int curr = 1;curr<arr.length;curr++,pre++) {
			if(arr[curr] - arr[pre] !=1)
				return arr[curr]-1;
		}
		return -1;
	}

	private static int findMissingNumber(int[] arr) {
		// TODO Auto-generated method stub
//		int[] arr2 = new int[arr.length+1];
//		
//		for(int index:arr) {
//			arr2[index] = 1;
//		}
//		
//		for(int i=0;i<arr2.length;i++) {
//			if(arr2[i] == 0)
//				return i;
//		}
//		
//		return -1;
		
		
		//using xor
		
		int xor = 0;
		
		for(int i=0;i<arr.length;i++) {
			xor = xor ^ arr[i];
		}
		
		for(int i=0;i<=arr.length;i++) {
			xor = xor ^ i;
		}
		return xor;
	}

}
