package com.java.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DuplicateChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Integer a = new Integer(5);
		Integer b = a;
		System.out.println(b);

		
		System.out.println(a+5);
		
		String s = "BhuBshaabbn";
		printDuplicateChar(s);
		printDuplicateChar1(s);
	}

	private static void printDuplicateChar1(String s) {
		// TODO Auto-generated method stub
		char[] charArray = s.toCharArray();
		int preIndex = 0;
		Arrays.sort(charArray);
		for(int i=1;i<s.length();i++) {
			if(charArray[i] == charArray[preIndex])
				System.out.println(charArray[i]);
			
			preIndex++;
		}
	}

	private static void printDuplicateChar(String s) {
		// TODO Auto-generated method stub
		char[] charArray = s.toCharArray();
		List<Character> list = new ArrayList<>();
		for(int i =0; i<charArray.length;i++) {
			if(list.contains(charArray[i])) {
				System.out.println("Duplicate char found:"+charArray[i]);
			}else {
				list.add(charArray[i]);
			}
		}
	}

}
