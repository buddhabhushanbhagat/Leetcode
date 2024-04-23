package com.java.array;

import java.util.Arrays;

public class FindCommonElementsFromTwoArraysLeetcode2956 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = { 4, 3, 2, 3, 1 };
		int[] nums2 = { 2, 2, 5, 2, 3, 6 };
		int[] result = findCommonElementsIndicesCount(nums1, nums2);
		System.out.println(Arrays.toString(result));
	}

	private static int[] findCommonElementsIndicesCount(int[] nums1, int[] nums2) {
		// TODO Auto-generated method stub
		int[] result = new int[2];
		int count1 = 0;

		for (int i = 0; i < nums1.length; i++) {
			for (int j = 0; j < nums2.length; j++) {
				if (nums1[i] == nums2[j]) {
					count1++;
					break;
				}
			}
		}
		int count2 = 0;
		for (int i = 0; i < nums2.length; i++) {
			for (int j = 0; j < nums1.length; j++) {
				if (nums2[i] == nums1[j]) {
					count2++;
					break;
				}
			}
		}
		result[0] = count1;
		result[1] = count2;

		return result;
	}

}
