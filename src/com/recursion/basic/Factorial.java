package com.recursion.basic;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		int fact = fact(n);
		System.out.println("fact:"+fact);

		int fact1 = fact1(n,1);
		System.out.println("fact1:"+fact1);
	}

	//Parameterised recursion
	private static int fact1(int n, int j) {
		// TODO Auto-generated method stub
		if(n ==1)
			return 1;		
		return fact1(n-1,j)*j*n;
	}

	//functional recursion
	private static int fact(int i) {
		// TODO Auto-generated method stub
		if(i==1)
			return 1;
		
		return i*fact(i-1);
	}

}
