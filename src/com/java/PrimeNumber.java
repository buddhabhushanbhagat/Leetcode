package com.java;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 2;
		boolean isPrime = isPrimeNumber(n);
		System.out.println("is Prime:"+isPrime);
	}

	private static boolean isPrimeNumber(int n) {
		// TODO Auto-generated method stub
		boolean result = true;
		if(n <2) {
			return false;
		}
		for(int i=2;i<=n/2;i++) {
			if(n%i == 0) {
				result = false;
			}
		}
		
		return result;
	}

}
