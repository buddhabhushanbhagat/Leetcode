package com.java.string;

import java.util.Arrays;

public class MaximumNumberOfWordsFoundInSentencesLeetcode2114 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[]  sentences = {"alice and bob love leetcode", "i think a a a a a so too", "this is great thanks very much"};
		 int mostWordsFound = mostWordsFound(sentences);
		 System.out.println(mostWordsFound);
	}

	private static int mostWordsFound(String[] sentences) {
		// TODO Auto-generated method stub
		int maxCount = 0;
		for(int i=0;i<sentences.length;i++) {
//			int count = 0;
			String[] strArray = sentences[i].split(" ");
		
			System.out.println(strArray[0]);
			
			if(maxCount < strArray.length) {
				maxCount = strArray.length;
			}
		}
		return maxCount;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	 * private static int mostWordsFound(String[] sentences) { // TODO
	 * Auto-generated method stub int maxCount = 0;
	 * 
	 * for(String s:sentences) { String[] splitedArray = s.split(" "); if(maxCount <
	 * splitedArray.length) maxCount = splitedArray.length; }
	 * 
	 * return maxCount; }
	 */

}
