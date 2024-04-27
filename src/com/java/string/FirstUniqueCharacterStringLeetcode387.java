package com.java.string;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacterStringLeetcode387 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "eetcode";
		int firstUniqCharIndex = firstUniqChar(s);
		System.out.println("firstUniqCharIndex :" + firstUniqCharIndex);

		int FirstUniqCharIndex = firstUniqChar2(s);
		System.out.println("NotValidFirstUniqCharIndex :" + FirstUniqCharIndex);
	}

	private static int firstUniqChar(String s) {
		// TODO Auto-generated method stub
		int[] arr = new int[26];
		s = s.toLowerCase();
		for (char ch : s.toCharArray()) {
			int index = ch - 97;
			arr[index]++;
		}
		for (char ch : s.toCharArray()) {
			int index = ch - 97;
			if (arr[index] == 1) {
				return s.indexOf(ch);
			}
		}
		return -1;
	}

	private static int firstUniqChar2(String s) {
		// TODO Auto-generated method stub
		Map<Character, Integer> map = new HashMap<>();
		for (char ch : s.toCharArray()) {
			if (!map.containsKey(ch)) {
				map.put(ch, 1);
			} else
				map.put(ch, map.get(ch) + 1);
		}

		for (char ch : s.toCharArray()) {
			if (map.get(ch) == 1) {
				return s.indexOf(ch);
			}

		}

		return -1;
	}

}
