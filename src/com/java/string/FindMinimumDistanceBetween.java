package com.java.string;

public class FindMinimumDistanceBetween {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] S = { "the", "quick", "brown", "fox", "quick"};
		String word1 = "brown";
		String word2 = "quick";
		int distance = findDistance(S,word1,word2);
		System.out.println("Minimum distance between the words :"+distance);
	}

	
	
	
	
	
	
	
	
	
	
	
	
	private static int findDistance(String[] s, String word1, String word2) {
		// TODO Auto-generated method stub
		int i=0;
		int j=s.length-1;
		while(i<j) {
			while(s[i] != word1 && i<j) {
				i++;
			}
			while(s[j] != word2 && i<j) {
				j--;
			}
			
			if(i<j ) {
				return j-i;
			}
		}
		return -1;
	}

}
