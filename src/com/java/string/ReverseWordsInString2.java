package com.java.string;

public class ReverseWordsInString2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Can you reverse this word, it did you";
		String reversedString = reverseWordsInString1(s);
		System.out.println("Before : " + s);
		System.out.println("After : " + reversedString);
	}
	private static String reverseWordsInString(String s) {
		// TODO Auto-generated method stub
		String[] strArray = s.split(" ");
		String reverse = "";
		for(int i = strArray.length-1;i>=0;i--) {
			reverse = reverse+strArray[i]+" ";
		}
		
		
		return reverse;
	}
	
	private static String reverseWordsInString1(String s) {
//		Way-2
		
		String[] stringArray = s.split(" ");
		String result = "";
		int i = 0;
		int j = stringArray.length - 1;

		while (i <= j) {
			String temp = stringArray[i];
			stringArray[i] = stringArray[j];
			stringArray[j] = temp;
			i++;
			j--;
		}
		result = String.join(" ",stringArray);
		return result;
	}

}
