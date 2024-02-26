package com.java.string;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = "Bhushan";
		String reverse = reverse(s);
		System.out.println("reverse is :"+reverse);
	}

	private static String reverse(String s) {
		// TODO Auto-generated method stub
		char[] charArray = s.toCharArray();
		int right= charArray.length-1;
		int left = 0;
		while(left <= right) {
			char temp = charArray[left];
			charArray[left] = charArray[right];
			charArray[right] = temp;
			left++;
			right--;
		}
		
		String reverse = new String(charArray);
	//	return reverse;
	
	
	for(left=0;left<=right;left++, right--) {
		
	}
	}
}
