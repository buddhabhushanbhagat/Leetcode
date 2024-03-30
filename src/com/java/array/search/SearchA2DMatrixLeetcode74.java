package com.java.array.search;

public class SearchA2DMatrixLeetcode74 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } };
		int target = 13;
		boolean isExist = search(matrix, target);
		System.out.println(isExist);
	}

	private static boolean search(int[][] matrix, int target) {
		boolean result = false;
		int left = 0;
		int right = matrix.length - 1;

		while (left <= right) {
			int mid1 = left + (right - left) / 2;
			int lastIndex = matrix[mid1].length-1;
			if (matrix[mid1][0] <= target && matrix[mid1][matrix[mid1].length - 1] >= target) {
				int left2 = 0;
				int right2 =lastIndex;
				while (left2 <= right2) {
					int mid2 = left2 + (right2 - left2) / 2;
					if (matrix[mid1][mid2] == target) {
						result = true;
						return result;

					} else if (matrix[mid1][mid2] > target) {
						right2 = mid2 - 1;
					} else {
						left2 = mid2 + 1;
					}
				}
				return result;

			} else if (matrix[mid1][0] > target) {
				right = mid1 - 1;
			} else {
				left = mid1 + 1;
			}
		}

		return result;
	}

}
