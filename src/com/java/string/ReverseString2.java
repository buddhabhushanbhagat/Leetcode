package com.java.string;

import java.util.Scanner;

public class ReverseString2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = "Bhushan";
		String reverse = reverse(s);
		System.out.println("reverse is :"+reverse);
		String reverseRecursion = reverseRecursion(s.toCharArray(),0,s.length()-1);
		System.out.println("reverse with recursion is :"+reverseRecursion);
	}

	private static String reverseRecursion(char[] charArray, int i, int j) {
		// TODO Auto-generated method stub
		if(i<j) {
			char ch = charArray[i];
			charArray[i] = charArray[j];
			charArray[j] = ch;
			reverseRecursion(charArray, i+1, j-1);
		}
		return String.copyValueOf(charArray);
	}

	private static String reverse(String s) {
		// TODO Auto-generated method stub
		//B h u s h a n 
		int i = 0;
		int j= s.length()-1;
		char[] charArray = s.toCharArray();
		
		while(i<j) {
			char temp = charArray[i];
			charArray[i] = charArray[j];
			charArray[j] = temp;
			i++;
			j--;
		}
		
		return String.copyValueOf(charArray);
	}

	private static String reverse1(String s) {
		// TODO Auto-generated method stub
		String reverse = "";
		char[] charArray = s.toCharArray();
		for(int i=charArray.length-1;i>=0;i--) {
			reverse+=charArray[i];
		}
		return reverse;
	}

	
}
