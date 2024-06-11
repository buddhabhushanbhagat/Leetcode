package com.java.string;

import java.util.Arrays;

public class LongestCommonPrefixLeetcode14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strs = { "flower", "flow", "flight" };
		// convert to char array
		String result = longestCommonPrefix(strs);
		System.out.println("longestCommonPrefix is " + result);
	}

	private static String longestCommonPrefix(String[] strs) {
		// TODO Auto-generated method stub
		Arrays.sort(strs);
		String s = "";

		String s1 = strs[0];
		String s2 = strs[strs.length - 1];
		System.out.println(s1);
		
		char[] char1 = s1.toCharArray();
		for (int i = 0; i < s2.length() && i < s1.length(); i++) {
			if(char1[i] == s2.charAt(i)) {
				s=s+char1[i];
			}else
				break;
		}
		return s;
	}

	// Way 1

}
