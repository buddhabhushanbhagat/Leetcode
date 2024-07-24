package com.java.hashcode.equals.contract;

import java.util.HashMap;
import java.util.Map;

public class HashImplementationForEqualsHashcode {
	public static void main(String[] args) {
		Map<Student, String> map = new HashMap<>();
		Student s1 = new Student(1,"Bhushan");
		Student s2 = new Student(1,"Bhushan");

		System.out.println(s1.equals(s2));
		
		
		
		
		map.put(s1, "A+");
//		map.put(s2, "A+");
		System.out.println(map.get(s1));
		System.out.println(map.get(s2));
 	}
}
