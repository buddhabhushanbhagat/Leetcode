 package com.java.string;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "bhushanb";
		Map<Character,Integer> map = findDuplicateChars(s.toCharArray());
		System.out.println(map);
		
		for (Map.Entry<Character,Integer> enterySet: map.entrySet()) {
			if(enterySet.getValue() >=2)
				System.out.println(enterySet.getKey()+":" + enterySet.getValue());
		}
		
	}

	private static Map<Character,Integer> findDuplicateChars(char[] charArray) {
		// TODO Auto-generated method stub
		Map<Character,Integer> map = new HashMap<>();
		
		for(char ch: charArray) {
			if(!map.containsKey(ch)) {
				map.put(ch, 1);
			}else {
				map.put(ch,map.get(ch)+1);
			}
		}
		return map;
	}

}
