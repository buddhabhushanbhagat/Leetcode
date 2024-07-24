package com.java.string;

public class CountTheNumberOfConsistentStrings1684 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String allowed = "cad";
		String[] words = {"cc","acd","b","ba","bac","bad","ac","d"};
		int count = countConsistentStrings(allowed,words);
		System.out.println(count);
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	private static int countConsistentStrings(String allowed, String[] words) {
		// TODO Auto-generated method stub
		int count =0;
		for(String s:words) {
			char[] charArray = s.toCharArray();
			boolean flag = true;
			for(int i=0; i< s.length();i++) {
				if(!allowed.contains(String.valueOf(charArray[i]))) {
					flag = false;
				}
			}
			if(flag) 
				count++;
		}
		return count;
	}

}
