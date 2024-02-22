package com.java.string;

public class ToLowerCaseLeetcode709 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hello";
		s.toLowerCase();
		String lower = toLowerCase(s);
		System.out.println(lower);
	}

	private static String toLowerCase(String s) {
		// TODO Auto-generated method stub
//		65 - 90
//		97 - 122
		char[] charArray = s.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] > 64 && charArray[i] < 91) {
				charArray[i] = (char) (charArray[i] + 32);
				System.out.println(charArray[i]);
			}
		}
		return String.copyValueOf(charArray);
	}

}
