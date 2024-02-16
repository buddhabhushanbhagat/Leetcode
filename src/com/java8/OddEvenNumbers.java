package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OddEvenNumbers {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(11,2,4,7,8,16,5,9,56,79,108,15);
		
		long evenNumbersList = list.stream().filter(e->e%2==0).peek(System.out::println).count();
		System.out.println("evenNumbersList:  "+evenNumbersList);
		
		
		
		
	}
}
