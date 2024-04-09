package com.java8;

import java.util.Optional;

public class OptionalClassExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "";
		Optional<String> optional = Optional.of(str);
		if(optional.isPresent()) {
			System.out.println("value is present");
		}else {
			System.out.println("value is not present");
		}
		
		System.out.println();
	}

}
