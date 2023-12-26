package com.java.string;

import java.util.HashSet;
import java.util.Set;

public class IsPangram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence = "thequickbrownfoxjumpsoverthelazydog";
		boolean result = checkIfPangram(sentence.toCharArray());
		if(result) {
			System.out.println("Panagram");
		}else {
			System.err.println("Not Panagram");
		}
	}

	private static boolean checkIfPangram(char[] charArray) {
		// TODO Auto-generated method stub
		if(charArray.length < 26)
			return false;
		
		Set<Character> set = new HashSet<Character>();
		
		for(char ch:charArray) {
			set.add(ch);
		}
		if(		set.size() == 26) 
			return true;
		
		return false;
	}

}
