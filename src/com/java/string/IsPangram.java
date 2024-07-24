package com.java.string;

import java.util.HashSet;
import java.util.Set;

public class IsPangram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence = "thequickbrownfoxjumpsoverthelazydog";
		boolean result = checkIfPangram(sentence.toCharArray());
		boolean result1 = checkIfPangram1(sentence.toCharArray());
		if(result) {
			System.out.println("Panagram");
		}else {
			System.err.println("Not Panagram");
		}
		System.out.println("---------Way 2----------");
		if(result1) {
			System.out.println("Panagram");
		}else {
			System.err.println("Not Panagram");
		}
	}

	private static boolean checkIfPangram1(char[] charArray) {
		// TODO Auto-generated method stub
		int[] arr = new int[26];
		for(char ch :charArray) {
			int index = ch-97;
			System.out.println(index);

			arr[index]++;
		}
		for(int i=0;i<26;i++) {
			if(arr[i] == 0) {
				return false;
			}
		}
		return true;
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
