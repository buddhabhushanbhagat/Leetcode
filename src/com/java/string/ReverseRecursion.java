package com.java.string;

public class ReverseRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "shubham";
		s = reverse(s.toCharArray(),0,s.length()-1);
		System.out.println("Reverse:"+s);
	}

	private static String reverse(char[] s, int i, int j) {
		
		if(i < j) {
			char temp = s[i];
			s[i] = s[j];
			s[j] = temp;
			reverse(s, i+1, j-1);
		}
		
		return String.copyValueOf(s);		
	}

}
