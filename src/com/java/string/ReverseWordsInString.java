package com.java.string;

public class ReverseWordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Can you reverse this word, it did you";
		String reversedString = reverseWordsInString(s);
		System.out.println("Before : " + s);
		System.out.println("After : " + reversedString);
	}

	private static String reverseWordsInString(String s) {
		// TODO Auto-generated method stub
		String[] stringArray = s.split(" ");
		String result = "";
		
		for(int i=stringArray.length-1; i >=0;i--) {
			 result = result +" "+stringArray[i];
		}
		return result;
//		Way-2
//		int i = 0;
//		int j = stringArray.length - 1;
//
//		while (i <= j) {
//			String temp = stringArray[i];
//			stringArray[i] = stringArray[j];
//			stringArray[j] = temp;
//			i++;
//			j--;
//		}
//		result = String.join(" ",stringArray);
//		return result;
	}

}
