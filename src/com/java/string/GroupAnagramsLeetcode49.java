package com.java.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagramsLeetcode49 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };
		List<List<String>> groupAnagrams = groupAnagrams(strs);
		System.out.println(groupAnagrams.toString());
	}

	private static List<List<String>> groupAnagrams(String[] strs) {
		// TODO Auto-generated method stub
		Map<String, List<String>> map = new HashMap<>();
		for (String str : strs) {
			char[] charArray = str.toCharArray();
			Arrays.sort(charArray);
			String keyString = String.valueOf(charArray);
			if (!map.containsKey(keyString)) {
				// only adding key
				map.put(keyString, new ArrayList<>());
			}
			//adding str in values list
			map.get(keyString).add(str);
		}

		return new ArrayList<>(map.values());
	}

}
