package com.java.string;

import java.util.ArrayList;
import java.util.List;

public class FindWordsContainingCharLeetcode2942 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words = { "leet", "code" ,"bhu","aniket"};
		char x = 'e';
		List<Integer> list = findWordsContaining(words,x);
		System.out.println(list);
	}

	private static List<Integer> findWordsContaining(String[] words, char x) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();
		for(int j=0;j<words.length;j++)
			for(int i=0;i<words[j].length();i++)
				if(words[j].charAt(i) == x &&(!list.contains(j)))
					list.add(j);
		return list;
	}

}
