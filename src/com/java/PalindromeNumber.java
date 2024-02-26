package com.java;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  x = 121;
		boolean isPalindrome = isPalindrome(x);
		System.out.println("isPalindrome:"+isPalindrome);
	}

	private static boolean isPalindrome(int x) {
		// TODO Auto-generated method stub
		int temp = x;
		int num = 0;
		while(temp!=0) {
			int rem = temp%10;
			num = num*10+rem;
			temp=temp/10;
		}
		if(num == x)
			return true;
		
		return false;
	}

}
