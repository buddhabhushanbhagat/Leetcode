package com.java.string;

public class IndexOfFirstOccurrenceInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String haystack = "sadbutsad";
		String needle = "sad";
		
		int index = strStr(haystack,needle);
		if(index != -1) {
			System.out.println("found at index: "+index);
		}else {
			System.out.println("Not found");
		}
	}

	private static int strStr(String haystack, String needle) {
		// TODO Auto-generated method stub
		int result = -1;
		result = haystack.indexOf(needle);
		return result;
	}

}
