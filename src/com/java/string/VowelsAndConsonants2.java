package com.java.string;

import java.util.Arrays;
import java.util.stream.Stream;

public class VowelsAndConsonants2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aebhfhi8932.f..nn++==$^v(.hukaf";
		s = s.toLowerCase();
		System.out.println(s);
		int vowelCount = countVowels(s.toCharArray());
		int consonants = countConsonants(s.toCharArray());
		System.out.println("vowels:" + vowelCount);
		System.out.println("consonants:" + consonants);
		System.out.println("total:" + s.length());

	}

	private static int countConsonants(char[] charArray) {
		// TODO Auto-generated method stub
		
		int count = 0;
		for(char ch:charArray) {
			if((ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') && (ch >= 97)&&(ch<=122) ) {
				count++;
			}
		}
		return count;
	}

	private static int countVowels(char[] charArray) {
		// TODO Auto-generated method stub
		int count = 0;
		for(char ch:charArray) {
			if(ch == 'a' ||ch == 'e' ||ch == 'i' ||ch == 'o' ||ch == 'u' ) {
				count++;
			}
		}
		return count;
	}

	

}
