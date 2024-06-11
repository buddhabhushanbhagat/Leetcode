package com.java.string;

public class LengthOfLastWordLeetcode58 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hello World ";
		int length = lengthOfLastWord(s);
		System.out.println("length of last word is "+length);
	}

	private static int lengthOfLastWord(String s) {
		// TODO Auto-generated method stub
		String[] str = s.split(" ");
		return str[str.length-1].length();
	}

	

}
