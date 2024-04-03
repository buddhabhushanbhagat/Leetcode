package com.java.string;

public class ValidPalindromeLeetcode125 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "A man, a plan, a canal: Panama";

		boolean isPalindrome = isPalindrome(s);
		System.out.println("isPalindrome:" + isPalindrome);
	}

	private static boolean isPalindrome(String s) {
		// TODO Auto-generated method stub
		s = s.toLowerCase();
		System.out.println(s);
		char[] charArray = s.toCharArray();
		String rev = "";
		String filteredString = "";
		for (char ch : charArray) {
			if ((ch > 96 && ch < 123) || (ch > 47 && ch < 58)) {
				filteredString = ch + filteredString;
			}
		}

		for (int i = filteredString.length() - 1; i >= 0; i--) {
			rev = rev + filteredString.charAt(i);
		}
		System.out.println(filteredString);
		if (filteredString.equals(rev))
			return true;
		return false;
	}

}
