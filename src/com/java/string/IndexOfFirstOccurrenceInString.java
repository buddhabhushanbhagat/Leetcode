package com.java.string;

public class IndexOfFirstOccurrenceInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String haystack = "sadbutsad";
		String needle = "sad";
		int index1 = strStr1(haystack, needle);
		int index = strStr(haystack, needle);
		if (index1 != -1) {
			System.out.println("found at index: " + index1);
		} else {
			System.out.println("Not found");
		}
		if (index != -1) { 
			System.out.println("found at index: " + index);
		} else {
			System.out.println("Not found");
		}
		
		int index2 = strStr2(haystack, needle);
		if (index1 != -1) {
			System.out.println("found at index: " + index2);
		} else {
			System.out.println("Not found");
		}
	}


	private static int strStr2(String haystack, String needle) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<needle.length();i++) {
			for(int j =0;i<needle.length();i++) {
				
			}
		}
		
		
		
		
		
		
		return 0;
	}


	private static int strStr(String haystack, String needle) {
		// TODO Auto-generated method stub
		int result = -1;
		result = haystack.indexOf(needle);
		return result;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	private static int strStr1(String haystack, String needle) {
		// TODO Auto-generated method stub
		// Time Complexity: O(m * n)
		// Space Complexity: O(1)
		int n = haystack.length();
		int m = needle.length();

		for (int end = m; end <= n; end++) {
			boolean allEqual = true;
			for (int i = end - m; i < end; i++) {
				if (haystack.charAt(i) != needle.charAt(i - end + m)) {
					allEqual = false;
					break;
				}
			}
			if (allEqual) {
				return end - m;
			}
		}

		return -1;
	}


}
