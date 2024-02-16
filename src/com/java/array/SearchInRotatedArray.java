package com.java.array;

public class SearchInRotatedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer i = new Integer(2);
		int[] array = {5, 6, 7, 8, 9, 10, 1, 2, 3};
		int num = 10;
		
		int index = searchInRotatedArray(array,num);
		if(index != -1) {
			System.out.println("Number found at index "+index);

		}
		System.out.println("Number not found in array");
	}

	private static int searchInRotatedArray(int[] array, int num) {
		// TODO Auto-generated method stub
		
		int pivot = findPivot(0,array.length-1,array);
		if(array[pivot] == num) 
			return pivot;
		int leftIndex = search(0,pivot,array,num);
		int rightIndex = search(0,pivot,array,num);
		if(leftIndex != -1) {
			return leftIndex;
		}else if(rightIndex != -1) {
			return rightIndex;
		}
		return -1 ;
	}

	private static int search(int i, int pivot, int[] array, int num) {
		// TODO Auto-generated method stub
		return 0;
	}

	private static int findPivot(int i, int j, int[] array) {
		// TODO Auto-generated method stub
		int mid = i+((j-i)/2);
		if(array[mid] > array[mid-1] && array[mid] > array[mid+1]) {
			return mid;
		}
		if(array[mid] > array[mid-1] && array[mid] < array[mid+1])
			i = mid+1;
		return 0;
	}

}
