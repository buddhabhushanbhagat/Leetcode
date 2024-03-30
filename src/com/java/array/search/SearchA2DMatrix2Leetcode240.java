package com.java.array.search;

import java.util.Arrays;

public class SearchA2DMatrix2Leetcode240 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = { {1,4,7,11,15,16},{2,5,8,12,19,21},{3,6,9,16,22,23},{10,13,14,17,24,25},{18,21,23,26,30} };
		int target = 5;
		boolean isExist = search(matrix, target);
		System.out.println(isExist);
	}

	private static boolean search(int[][] matrix, int target) {
		boolean result = false;
		for(int i=0;i<matrix.length;i++) {
			int left = 0;
			int right = matrix[i].length-1;
			
			while(left <=right) {
				int mid = left+(right-left)/2;
				
				if(matrix[i][mid] == target) {
					result = true;
					return result;
				}else if(matrix[i][mid]  > target) {
					right = mid-1;
				}else {
					left = mid+1;
				}
			}
		}
		return result;
	}

}
