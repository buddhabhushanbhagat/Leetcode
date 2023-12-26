package com.java.string;

public class VowelsAndConsonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aebhfhi8932.f..nn++==$^v(.hukaf";
		int vowelCount = countVowels(s.toCharArray());
		int consonants = countConsonants(s.toCharArray());
		System.out.println("vowels:" + vowelCount);
		System.out.println("consonants:" + consonants);
		System.out.println("total:" + s.length());

	}

	private static int countVowels(char[] s) {
		// TODO Auto-generated method stub
		int count = 0;
		for (char ch : s) {
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count++;
			}
		}
		return count;
	}

	private static int countConsonants(char[] s) {
		// TODO Auto-generated method stub
		int count = 0;
		for (char ch : s) {
			
			if ((ch >= 65 && ch <= 90) ||( ch >= 97 && ch <= 122)) {

				if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
					count++;
				}
			}
		}
		return count;
	}

}
