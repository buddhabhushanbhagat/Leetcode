package com.java.string;

public class PalindromicStringInTheArrayLeetcode2108_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words = { "abc", "car", "ada", "racecar", "cool" };
		String palindromeString = firstPalindrome(words);
		System.out.println(palindromeString);
	}

	private static String firstPalindrome(String[] words) {
		// TODO Auto-generated method stub
		for (String s : words) {
			if (isPalindrome(s)) {
				return s;
			}
		}
		return "";
	}

	public static boolean isPalindrome(String s) {
		// TODO Auto-generated method stub
		char[] charArray = new char[s.length()];
		for (int i = s.length() - 1; i >= 0; i--) {
			charArray[s.length() - 1 - i] = s.charAt(i);
		}

		return String.copyValueOf(charArray).equals(s);
	}

}
