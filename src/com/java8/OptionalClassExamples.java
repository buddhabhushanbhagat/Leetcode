package com.java8;

import java.util.Date;
import java.util.Optional;

public class OptionalClassExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating optional with 3 ways
		Optional<String> str1 = Optional.empty();
		Optional<String> str2 = Optional.of("bhushan");
		Optional<String> str3 = Optional.ofNullable("bhushan");

		System.out.println(str1);
		System.out.println(str2.get());
		System.out.println(str3.get());

		Optional<String> optional = Optional.ofNullable("abc");
//		String uppercaseString = optional.get().toUpperCase();
		// isPresent
		if (optional.isPresent()) {
			String uppercaseString = optional.get().toUpperCase();
			System.out.println(uppercaseString);

		}

		// ifPresent
		Optional<String> opt = Optional.of("bhushan1");
		opt.ifPresent(e -> System.out.println(e));

		Optional<String> opt1 = Optional.ofNullable(null);
		opt1.ifPresent(e -> System.out.println("will not return this " + e));

		// orElse
		System.out.println(opt.orElse("default name"));
		System.out.println(opt1.orElse("default name"));

		// orElseGet
		Optional<String> string = Optional.empty();
		System.out.println(string.orElseGet(() -> {
			return new String("new string");
		}));
		
		// orElseThrow
		System.out.println(opt.orElseThrow(NullPointerException::new));

		//filter
		Optional<Integer> val = Optional.of(9);
		int value = val.filter( e->e>=10).orElse(5);
		System.out.println(value);
		
		//map
		Optional<Integer> val1 = Optional.of(9);
		Optional<Integer> square = val1.map(e->e*e);
		square.ifPresent(e->System.out.println(square.get()));
		
		// Case
		String str = "";
		Optional<String> optional1 = Optional.of(str);
		if (optional1.isPresent()) {
			System.out.println("value is present");
		} else {
			System.out.println("value is not present");
		}
	}

}
