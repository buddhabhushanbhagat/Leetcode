package com.java.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ValidAnagramLeetcode243 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "anagram";
		String t = "nagaram";

		boolean isAnagram = isAnagram(s, t);
		boolean isAnagram2 = isAnagram2(s, t);
		if (isAnagram) {
			System.out.println("it is Anagram");

		} else {
			System.err.println("Not a anagram");
		}
	}

	private static boolean isAnagram2(String s, String t) {
		// TODO Auto-generated method stub
		boolean result = false;
		if (s.length() != t.length()) {
			return result;
		}
		Map<Character, Integer> map1 = new HashMap<>();
		for (char ch : s.toCharArray()) {
			if (map1.containsKey(ch)) {
				map1.put(ch, map1.get(ch) + 1);
			} else {
				map1.put(ch, 1);
			}
		}

		for (char ch : t.toCharArray()) {
			if (map1.containsKey(ch)) {
				map1.put(ch, map1.get(ch) - 1);
			} else {
				return result;
			}
		}
		Set<Character> setOfString2 = map1.keySet();
		for (char ch : setOfString2) {
			if (map1.get(ch) != 0) {
				return result;
			}
		}
		result = true;
		return result;
	}

	private static boolean isAnagram(String s, String t) {
		// TODO Auto-generated method stub

		if (s.length() != t.length())
			return false;

		char[] sArray = s.toCharArray();
		char[] tArray = t.toCharArray();
		Arrays.sort(sArray);
		Arrays.sort(tArray);

		s = String.copyValueOf(sArray);
		t = String.copyValueOf(tArray);

		if (s.equals(t)) {
			return true;
		}

		return false;

		/*
		 * //Way 2 if (word.length() != anagram.length()) { return false; } char[] chars
		 * = word.toCharArray(); for (char c : chars) { System.out.println("{"); int
		 * index = anagram.indexOf(c); System.out.println(index+ "=="+anagram); if
		 * (index != -1) { anagram = anagram.substring(0, index) +
		 * anagram.substring(index + 1, anagram.length()); //
		 * System.out.println(anagram+" hehe"); System.out.println(anagram+" hehe");
		 * 
		 * System.out.println("}"); } else { return false; } } return anagram.isEmpty();
		 */
	}

}
