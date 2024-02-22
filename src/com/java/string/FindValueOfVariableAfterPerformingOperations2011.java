package com.java.string;

public class FindValueOfVariableAfterPerformingOperations2011 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] operations = {"--X","X++","X++"};
		int finalValueAfterOperations = finalValueAfterOperations(operations);
		System.out.println(finalValueAfterOperations);
	}

	private static int finalValueAfterOperations(String[] operations) {
		// TODO Auto-generated method stub
		int result = 0;
		for(String s:operations) {
			if(s.charAt(1) == '-')
				result--;
			else {
				result++;
			}
			
		}
		return result;
	}

}
