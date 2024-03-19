package com.java.array;

import java.util.ArrayList;
import java.util.List;

public class FindMissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0,1,2,3,4,5,6,7,9};
		
		int missingNumber = findMissingNumber(arr);
		System.out.println("Missing number is:" +missingNumber);
		
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
