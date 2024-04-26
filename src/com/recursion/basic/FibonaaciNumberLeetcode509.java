package com.recursion.basic;

public class FibonaaciNumberLeetcode509 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//			0,1,1,2,3,5,8,13
		int n = 3;
		int num = fibonacciNumber(n);
		System.out.println("number is "+num);
	}

	private static int fibonacciNumber(int n) {
		// TODO Auto-generated method stub
		if(n == 0)
			return 0;
		if(n == 1) 
			return 1;
		
		return fibonacciNumber(n-1)+fibonacciNumber(n-2);
	}

}
