package com.java.string;

import java.util.ArrayList;
import java.util.List;

public class ShubhamFinastraCodeingQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "ababcdeaeabz";
		List<Character> list = uniqueCharsFromString(s);
		System.out.println(list);
	}

	private static List<Character> uniqueCharsFromString(String s) {
		// TODO Auto-generated method stub
		List<Character> list = new ArrayList<>();
		int[] arr = new int[26];
		s = s.toLowerCase();
		for (char ch : s.toCharArray()) {
			int index = ch - 97;
			arr[index]++;
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 1) {
				char ch = (char) (i + 97);
				list.add(ch);
			}
		}

		return list;
	}

}
