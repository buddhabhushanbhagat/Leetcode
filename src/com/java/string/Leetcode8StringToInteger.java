package com.java.string;

public class Leetcode8StringToInteger {

//	Implement the myAtoi(string s) function, which converts a string to a 32-bit signed integer (similar to C/C++'s atoi function).
//
//			The algorithm for myAtoi(string s) is as follows:
//
//			Read in and ignore any leading whitespace.
//			Check if the next character (if not already at the end of the string) is '-' or '+'. Read this character in if it is either. This determines if the final result is negative or positive respectively. Assume the result is positive if neither is present.
//			Read in next the characters until the next non-digit character or the end of the input is reached. The rest of the string is ignored.
//			Convert these digits into an integer (i.e. "123" -> 123, "0032" -> 32). If no digits were read, then the integer is 0. Change the sign as necessary (from step 2).
//			If the integer is out of the 32-bit signed integer range [-231, 231 - 1], then clamp the integer so that it remains in the range. Specifically, integers less than -231 should be clamped to -231, and integers greater than 231 - 1 should be clamped to 231 - 1.
//			Return the integer as the final result.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s = "   -42";
		String s = "4193 with words";

		int result = stringToInteger(s);
		System.out.println(result);
	}

	private static int stringToInteger(String s) {
		// TODO Auto-generated method stub
		s = s.trim();
//		char ch = '3';
//		int n = ch;
		char[] sArray = s.toCharArray();
		String newString = "";
		for (char ch : sArray) {
			if ((ch == '-' || ch == '+') || (ch >= 48 && ch <= 57)) {
				newString = newString+ch;
			}
		}
		System.out.println("String value:"+newString);
		int result = Integer.parseInt(newString);
		if(result != 0)
			return result;
		
		return 0;
	}
	// It is not accepted solution, need to work on it 

}
