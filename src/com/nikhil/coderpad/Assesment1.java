package com.nikhil.coderpad;

public class Assesment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 12;
		int result = computeMultipleSum(n);
		System.out.println("result:"+result);
		
	}

	private static int computeMultipleSum(int n) {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int i=1;i<n;i++) {
			if(i%3 == 0 || i%5 == 0 || i%7 == 0) {
				sum=sum+i;
			}
		}
		return sum;
	}

}
