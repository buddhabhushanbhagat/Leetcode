package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class SumOfNumbers {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(3,5,7,9,1);
//		
		Stream<Integer> s = list.stream();
		int sum = s.mapToInt(e->e).sum();
		System.out.println(sum);
		

		}
}
