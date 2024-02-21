package com.java.string;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatedCharacter2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "bhusnhaznzxuasb";
		
		int charIndex = firstNonRepeatedCharacter(s.toCharArray());
		if(charIndex!= -1)
			System.out.println("first non-repeated Character is :"+s.charAt(charIndex));
		else 
			System.err.println("No non-repeated characters found");  
	}

	private static int firstNonRepeatedCharacter(char[] charArray) {
		// TODO Auto-generated method stub
		
		Map<Character, Integer> map = new HashMap<>();
		for(char ch:charArray) {
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			}else {
				map.put(ch,1);
			}
		}
		for(int i =0;i<charArray.length;i++) {
			if( map.get(charArray[i]) == 1 )
				return i;
		}
		return -1;
	}

}
