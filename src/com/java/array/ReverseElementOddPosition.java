package com.java.array;

import java.util.Arrays;

public class ReverseElementOddPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 5, 6} ;
		System.out.println(Arrays.toString(arr));

		int[] rev = reverseOddPositionElements(arr);
		System.out.println(Arrays.toString(rev));

	}

	private static int[] reverseOddPositionElements(int[] arr) {
		// TODO Auto-generated method stub
		int firstIndex = 1;
		int lastIndex = arr.length - 1 % 2 == 0 ? arr.length - 2 : arr.length - 1;
		System.out.println(lastIndex);
		while (lastIndex > firstIndex) {
			int temp = arr[lastIndex];
			arr[lastIndex] = arr[firstIndex];
			arr[firstIndex] = temp;

			lastIndex = lastIndex - 2;
			firstIndex = firstIndex + 2;
			System.out.println("hehe");
		}

		return arr;
	}

}
