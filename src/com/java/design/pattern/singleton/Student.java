 package com.java.design.pattern.singleton;

public class Student {
	
	private static Student s;
	
	private Student() {
		
	}
	
	public static Student getInstance() {
		if(s == null) {
			s = new Student();
		}
		return s;
	}
}
