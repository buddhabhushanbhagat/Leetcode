package com.immutable.exm1;

import java.util.HashMap;
import java.util.Map;

public class MyImmutableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> map = new HashMap<>();
		map.put("1", "first");
		map.put("2", "second");
		Employee emp = new Employee(1, "Bhushan", map);
		
		System.out.println(emp.getData());
		
		map.put("3", "third");
		System.out.println(emp.getData());

		
	}

}
