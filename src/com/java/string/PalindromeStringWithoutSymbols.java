package com.java.string;

public class PalindromeStringWithoutSymbols {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "c1 O$d@eeD o1c   ";
		s = s.trim();
		boolean isPalindrome = checkPalindrome(s);
		System.out.println("isPalindrome:" + isPalindrome);
	}

	private static boolean checkPalindrome(String s) {
		// TODO Auto-generated method stub
		boolean isPalindrome = false;
		String lower = s.toLowerCase();
		String validString = "";
		for (char ch : lower.toCharArray()) {
			if ((ch >= 97 && ch <= 122) && (ch >= 48 && ch <= 57)) {
				validString = validString + ch;
			}
			
		}

		System.out.println("shubham   :"+validString);
		return isPalindrome;
	}

}
