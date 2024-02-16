package com.java.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.IntFunction;

public class RemoveDuplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,1,9,6,7,9};
		int[] duplicates  = findDuplicates(arr);
		
		for(int i:duplicates) {
			System.out.println(i);
		}
	}

	private static int[] findDuplicates(int[] arr) {
		// TODO Auto-generated method stub
		Arrays.sort(arr);
		for(int i:arr) {
			System.out.print(i+" ");
		}
		int[] uniqueElements = new int[arr.length];
		int previous = 0;
		uniqueElements[0] = arr[0];
		for(int i = 1; i<arr.length; i++) {
			if(arr[previous] != arr[i] ) {
				uniqueElements[i] = arr[i];
				previous = i;
			}
		}
		return uniqueElements;
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
