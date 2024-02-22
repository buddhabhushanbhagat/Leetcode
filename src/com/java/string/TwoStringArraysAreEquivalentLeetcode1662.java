package com.java.string;

public class TwoStringArraysAreEquivalentLeetcode1662 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] word1 = {"ab", "c"};
		String[] word2 = {"a", "bc"};
		boolean isSame = arrayStringsAreEqual(word1,word2);
		System.out.println("Is two strings same: "+isSame);
	}

	private static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
		// TODO Auto-generated method stub
		boolean isSame = false;
		
		String s1 = "";
		String s2 = "";
		
		for(String s:word1)
			s1+= s;
		
		for(String s:word2)
			s2+= s;
		
		if (s1.equals(s2))
			isSame = true;
		
		System.out.println(s1);
		System.out.println(s2);
		
		return isSame;
	}

}
