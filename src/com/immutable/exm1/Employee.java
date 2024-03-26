package com.immutable.exm1;

import java.util.HashMap;
import java.util.Map;
//1st step make class final
final class Employee {
	//2nd make fields private final
	private final int empNo;
	private final String name;
	private final Map<String, String> data;

	//3rd set object in constructor with deep copy
	public Employee(int empNo, String name, Map<String, String> data) {
		// This keyword refers to current instance itself
		this.empNo = empNo;
		this.name = name;

		// Creating Map object with reference to HashMap
		// Declaring object of string type
		Map<String, String> tempMap = new HashMap<>();
		// Iterating using for-each loop
		data.forEach((k, v) -> {
			tempMap.put(k, v);
		});

		this.data = tempMap;
	}

	//4th create getters with deep copy
	//5th dont provide setters
	public int getEmpNo() {
		return empNo;
	}

	public String getName() {
		return name;
	}

	public Map<String, String> getData() {
		Map<String, String> tempMap = new HashMap<>();
		this.data.forEach((k, v) -> {
			tempMap.put(k, v);
		});
		return tempMap;
	}

}
