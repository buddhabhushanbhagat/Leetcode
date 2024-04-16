package com.java.array;

import java.util.Arrays;

public class Swap0And1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0,0,1,0,1,1,0,1};
		int[] result = segregateZeroAndOne(arr);
		int[] result2 = segregateZeroAndOneWay2(arr);
		
		System.out.println(Arrays.toString(result));
		System.out.println("Way 2result: "+Arrays.toString(result2));
	}



	private static int[] segregateZeroAndOneWay2(int[] arr) {
		// TODO Auto-generated method stub
		int i = 0;
		int j = arr.length-1;
		while(i < j) {
			
		
		while(arr[i] == 0 && i<j) {
			i++;
		}
		while(arr[j] == 1 && i<j) {
			j--;
		}
		
		if(i<j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;			
		}
		}
		return arr;
	}



	private static int[] segregateZeroAndOne(int[] arr) {
		// TODO Auto-generated method stub
		int[] result = new int[arr.length];
		
		int zeroCount = 0;
		int oneCount = 0;
		
		for(int i: arr) {
			if(i == 1)
				oneCount++;
			else
				zeroCount++;
		}
		
		for(int i=0;i<zeroCount;i++) {
			result[i] = 0;
		}
		
		for(int i = zeroCount;i<arr.length;i++) {
			result[i] = 1;
		}
		
		return result;
	}

}
