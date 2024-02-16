package com.java.array;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicateNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,1,9,6,7,9};
		List<Integer> duplicates = findDuplicates(arr);
		
		System.out.println(duplicates);

	}

	private static List<Integer> findDuplicates(int[] arr) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();
		List<Integer> duplicates = new ArrayList<>();
		
		for(int i: arr) {
			if(list.contains(i)) {
				duplicates.add(i);
			}else {
				list.add(i);
			}
		}
		return duplicates;
	}
	
	
	

//	private static List<Integer> findDuplicates(int[] arr) {
//		// TODO Auto-generated method stub
//		List<Integer> duplicates = new ArrayList<>();
//		for(int i = 0; i<arr.length;i++) {
//			for(int j = i+1; j<arr.length;j++) {
//				if(arr[i] == arr[j]) {
//					duplicates.add(arr[i]);
//				}
//			}
//		}
//		return duplicates;
//	}

}
