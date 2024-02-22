package com.java.string;

public class PalindromicStringInTheArrayLeetcode2108 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words = { "abc", "car", "adaa", "racecar", "cool" };
		String palindromeString = firstPalindrome(words);
		System.out.println(palindromeString);
	}

	private static String firstPalindrome(String[] words) {
		// TODO Auto-generated method stub
		String palindromString = "";
		for (int i = 0; i < words.length; i++) {
			if (words[i].charAt(0) == words[i].charAt(words[i].length()-1)) {
				palindromString = isPalindromeString(words[i]);
				if(palindromString.equals(words[i]))
				return palindromString;
			}
		}
		return palindromString;
	}

	private static String isPalindromeString(String string) {
		// TODO Auto-generated method stub
		char[] charArray = string.toCharArray();
		int startIndex = 0;
		int lastIndex = string.length() - 1;

		while (startIndex < lastIndex) {
			char temp = charArray[startIndex];
			charArray[startIndex] = charArray[lastIndex];
			charArray[lastIndex] = temp;

			startIndex++;
			lastIndex--;
		}
		if(String.copyValueOf(charArray).equals(string))
			return string;
		   
		return "";
	}

}
