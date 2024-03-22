    package com.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateNumbers {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(3,3,4,4,5,7);
		
		
		List<Integer> duplicateNumbers = list.stream().filter(e->Collections.frequency(list, e) ==1).collect(Collectors.toList());
		System.out.println("duplicateNumbers:  "+duplicateNumbers);

//		Set<Integer> set = new HashSet<>();
//		Set<Integer> duplicateNumbers1 = list.stream().filter(e->!set.add(e)).collect(Collectors.toSet());
//		System.out.println("duplicateNumbers:  "+duplicateNumbers1);
		
	}
}
