package com.java.string;

public class Palindrome2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "nitinq";
		boolean isPalindrome = isPalindrome(s);
		if(isPalindrome)
			System.out.println("Yes");
		else
			System.out.println("No");
	}

	private static boolean isPalindrome(String s) {
		// TODO Auto-generated method stub
		char[] reverse = new char[s.length()];
		char[] string = s.toCharArray();
		
		for(int i=0;i<string.length;i++) 
			reverse[string.length-i-1] = string[i];
		
		for(int i=0;i<string.length;i++) {
			if(reverse[i] != string[i])
				return false;
		}
		
		return true;
	}

	

}
