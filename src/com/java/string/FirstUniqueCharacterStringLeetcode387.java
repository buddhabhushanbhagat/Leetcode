package com.java.string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FirstUniqueCharacterStringLeetcode387 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "eetcode";
		int firstUniqCharIndex = firstUniqChar(s);
		System.out.println("firstUniqCharIndex :" + firstUniqCharIndex);

		int NotValidFirstUniqCharIndex = NotValidFirstUniqChar(s);
		System.out.println("NotValidFirstUniqCharIndex :" + NotValidFirstUniqCharIndex);
	}

	private static int firstUniqChar(String s) {
		// TODO Auto-generated method stub
		int[] arr = new int[26];   
		s=s.toLowerCase();
		for(char ch:s.toCharArray()) {
			int index = ch-97;
			arr[index]++;
		}
		for(char ch:s.toCharArray()) {
			int index = ch-97;
			if(arr[index] == 1) {
				return s.indexOf(ch);
			}
		}
		return -1;
	}

// It will not give correct first unique index, hashmap does not maintain order
	private static int NotValidFirstUniqChar(String s) {
		// TODO Auto-generated method stub
		Map<Character, Integer> map = new HashMap();
		char uniqueChar = 'a';
		for (char ch : s.toCharArray()) {
			if (!map.containsKey(ch)) {
				map.put(ch, 1);
			} else
				map.put(ch, map.get(ch) + 1);
		}

		for (Map.Entry<Character, Integer> set : map.entrySet()) {
			if (set.getValue() == 1) {
				return s.indexOf(set.getKey());
			}
			System.out.println(set.getKey() + ":" + set.getValue());
		}

		return -1;
	}

}
