package com.java.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.IntFunction;

public class RemoveDuplicateLeetcode26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1,2, 2,3,4 };
		int count = findDuplicates(arr);

		System.out.println(count);

	}

	private static int findDuplicates(int[] arr) {
		int count = 0;

		
		int previous = 0;
		int arr2[] = new int[arr.length];
		
		arr2[0] = arr[0];
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i] != arr[previous]) {
				arr2[i] = 
				previous++;
			}
			
			
		}
		
		
		
		
		
		
		
		return count;

	}

//	private static Integer[] findDuplicates(int[] arr) {
//		// TODO Auto-generated method stub
//		
//		List<Integer> list = new ArrayList<Integer>();
//		List<Integer> duplicates = new ArrayList<Integer>();
//		
//		for(int i:arr) {
//			if(list.contains(i)) {
//				duplicates.add(i);
//			}else {
//				list.add(i);
//			}
//		}
//		System.out.println(duplicates);
//		
////		duplicates.toArray((IntFunction<T[]>) duplicates);	
//		return (Integer[]) duplicates.toArray();
//	}

}
