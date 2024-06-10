package com.java.string;

public class RotationOfString2 {
//How do you check if two strings are a rotation of each other?
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "avajavaavajava";
		String str2 = "javaava";

		System.out.println(str1.contains("va"));
		
		boolean isRotation = isRotation(str1, str2);
		System.out.println(isRotation);
	}

	private static boolean isRotation(String str1, String str2) {
		// TODO Auto-generated method stub
		if(str1.length() == str2.length() && (str1+str1).contains(str2))
			return true;
		
		return false;
	}

}
