
package com.java.string;

import java.util.Arrays;

public class RemoveDuplicateCharacterFromString3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "bbhushan";
		int oldSize = s.length();
		s= removeDuplicateCharacters1(s);
		int newSize = s.length();
 		System.out.println(s);
//		if(oldSize == newSize) {
//			System.out.println("String dont have duplicate characters");
//		}else {
//			System.out.println("String without Duplicate characters: "+s);
//
//		}
 		

	}
	
	private static String removeDuplicateCharacters1(String s) {
		// TODO Auto-generated method stub
		char[] charArray = new char[s.length()];
		char[] charArrayS = s.toCharArray();
		Arrays.sort(charArrayS);
		
		charArray[0] = charArrayS[0];
		int preIndex = 0;
		for(int i=1,k=1;i<s.length();i++) {
			if(charArrayS[i] != charArrayS[preIndex]) {
				charArray[k] = charArrayS[i];
				k++;
			}
			
			preIndex = i;
		}
		return String.copyValueOf(charArray);
	}

	private static String removeDuplicateCharacters(String s) {
		// TODO Auto-generated method stub
		char[] charArray = s.toCharArray();
		char[] uniqueArray = new char[s.length()];
		Arrays.sort(charArray);
		System.out.println(charArray);
		//abbhhnsu
		int previous=0;
		uniqueArray[0] = charArray[0];
		for(int k =1; k<s.length(); k++) {
			if(charArray[k] != charArray[previous]) {
				uniqueArray[k] = s.charAt(k);
				previous = k;
			}
		}
		
		return String.copyValueOf(uniqueArray);
	}

}
