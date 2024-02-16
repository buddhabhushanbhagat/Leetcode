package com.java.array;

import java.util.HashSet;
import java.util.Set;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,4,6,7,9};
		int target = 5;
		
		int[] result = pairSum(arr,target);
		
		for(int i:result) {
			System.out.println(i);
		}
		
	}

	private static int[] pairSum(int[] arr, int target) {
		// TODO Auto-generated method stub
		Set<Integer> set = new HashSet<Integer>();
		int[] result = new int[2];
		for(int i: arr) {
			
			int diff = target-i;
			
			if(set.contains(diff)) {
				result[0] = i;
				result[1] = diff;
				return result;
			}else {
				set.add(i);
			}
			
			
		}
		
		
		
		return result;
	}

//	private static int[] pairSum(int[] arr, int target) {
//		// TODO Auto-generated method stub
//		int[] result = new int[2];
//		
//		for(int i =0; i<arr.length;i++) {
//			for(int j =i+1; j<arr.length;j++) {
//				if(arr[i] + arr[j] == target) {
//					result[0] = arr[i];
//					result[1] = arr[j];
//				}
//			}
//		}
//		
//		return result;
//	}

}
