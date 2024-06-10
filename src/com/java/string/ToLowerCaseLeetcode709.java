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
		char[] ch = s.toCharArray();
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i) < 91 && s.charAt(i) > 64) {
				char ch1 = (char) (s.charAt(i) + 32);
				ch[i] = ch1;
			}
		}
		
		
		return String.copyValueOf(ch);
	}

	

}
