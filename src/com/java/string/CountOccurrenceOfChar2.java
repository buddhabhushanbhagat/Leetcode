package com.java.string;

public class CountOccurrenceOfChar2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "thequicaakbrownfoxjumpsaoverthelazydog";
		char ch = '+';
		int count = countOccurrenceOfChar(s,ch);
		if(count!= 0) 
			System.out.println("Character "+ch +" found " + count +" times in string "+s);
		else {
			System.err.println("Character "+ch+" not found in string " +s);
		}
		
		 
	}

	private static int countOccurrenceOfChar(String s, char character) {
		// TODO Auto-generated method stub
		char[] charArray = s.toCharArray();
		int count = 0;
		for(char ch:charArray) {
			if(character == ch)
				count++;
		}
		return count;
	}

}
