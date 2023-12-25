package com.java.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ValidAnagramLeetcode242 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "anagram";
		String t = "magaran";
		boolean isAnagram = isAnagram(s, t);
		System.out.println("isAnagram:" + isAnagram);
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

		/*//Way 2
		 * if (word.length() != anagram.length()) { return false; } char[] chars =
		 * word.toCharArray(); for (char c : chars) { System.out.println("{"); int index
		 * = anagram.indexOf(c); System.out.println(index+ "=="+anagram); if (index !=
		 * -1) { anagram = anagram.substring(0, index) + anagram.substring(index + 1,
		 * anagram.length()); // System.out.println(anagram+" hehe");
		 * System.out.println(anagram+" hehe");
		 * 
		 * System.out.println("}"); } else { return false; } } return anagram.isEmpty();
		 */
	}

}
