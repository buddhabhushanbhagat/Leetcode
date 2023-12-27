package com.java.string;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abbcba";
		boolean isPalindrome = isPalindrome(s);
		if(isPalindrome)
			System.out.println("Yes");
		else
			System.out.println("No");
	}

	private static boolean isPalindrome(String s) {
		// TODO Auto-generated method stub
		char[] charArray = s.toCharArray();
		char[] charArray2 = new char[charArray.length];
		
		for(int i=0;i<charArray.length;i++) {
			char temp = charArray[i];
			charArray2[charArray.length-1-i] = charArray[i];
		}
		
		System.out.println("Str1"+ String.copyValueOf(charArray));
		System.out.println("Str2"+ String.copyValueOf(charArray2));
		for(int i=0;i<charArray.length-1;i++) {
			if(charArray[i] != charArray2[i]) {
				return false;
			}
		}
		
		return true;
	}

}
