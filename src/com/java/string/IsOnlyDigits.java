package com.java.string;

public class IsOnlyDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "23-6";
		
		boolean result = isOnlyDigits(s.toCharArray());
		if(result) {
			System.out.println("Strings has only digits");
		}else {
			System.err.println("This String dont have only digits");
		}
	}

	private static boolean isOnlyDigits(char[] charArray) {
		// TODO Auto-generated method stub
		
		for(char ch: charArray) {
			if(!(ch >= 48 && ch<= 57)) 
				return false;
		}
		return true;
	}

}
