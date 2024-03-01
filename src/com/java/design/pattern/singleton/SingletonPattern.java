package com.java.design.pattern.singleton;

public class SingletonPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = Student.getInstance();
		Student s1 = Student.getInstance();
		System.out.println(s);
		System.out.println(s1);
		
	}

}
