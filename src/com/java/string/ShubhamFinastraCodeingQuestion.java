package com.java.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ShubhamFinastraCodeingQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "ababcdeaeabz";
		List<Character> list = uniqueCharsFromString1(s);
		System.out.println(list);
	}

	private static List<Character> uniqueCharsFromString1(String s) {
		// TODO Auto-generated method stub
		List<Character> list = new ArrayList<>();
		char[] arr = s.toCharArray();
		Arrays.sort(arr);
		Map<Character, Integer> map = new HashMap<>();

		for (Character ch : arr) {
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}

		}
		map.forEach((k, v) -> {
			if (v == 1) {
				list.add(k);
			}
		});

		return list;
	}

	private static List<Character> uniqueCharsFromString(String s) {
		// TODO Auto-generated method stub
		List<Character> result = new ArrayList<>();
		Map<Character, Integer> map = new HashMap<>();
		for (char ch : s.toCharArray()) {
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);

			}
		}
		Set<Character> charSet = map.keySet();

		for (char ch : charSet) {
			if (map.get(ch) == 1) {
				result.add(ch);
			}
		}

		return result;
	}

}
