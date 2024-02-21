package com.java.string;

import java.util.Arrays;

public class LongestCommonPrefixLeetcode14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strs = {"flower","flow","flight"};
		String result = longestCommonPrefix(strs);
		System.out.println("longestCommonPrefix is " + result);
	}

	//Way 1
	private static String longestCommonPrefix(String[] strs) {
		// TODO Auto-generated method stub
		String result = "";
		Arrays.sort(strs);
		String s1 = strs[0];
		String s2 = strs[strs.length - 1];
		
		for(int i=0; i<s1.length() && i<s2.length();i++) {
			if(s1.charAt(i)== s2.charAt(i))
				result+= s1.charAt(i);
			else
				break;
		}
		
		return result;
	}
//Way 2
//	private static String longestCommonPrefix(String[] strs) {
//		// TODO Auto-generated method stub
//		String result = "";
//		Arrays.sort(strs);
//
//		String s1 = strs[0];
//		String s2 = strs[strs.length - 1];
//		// calculating lowest string length
//		int lowestStringLength = Integer.MAX_VALUE;
//		for (String s : strs)
//			if (lowestStringLength > s.length())
//				lowestStringLength = s.length();
//
//		System.out.println("lowest string length"+lowestStringLength);
//		char[] charArray1 = s1.toCharArray();
//		char[] charArray2 = s2.toCharArray();
//
//		for (int i = 0; i < lowestStringLength; i++) {
//			if (charArray1[i] != charArray2[i] )
//				return result;
//			else
//				result = result + charArray1[i];
//		}
//		return result;
//	}

}
