package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberStartsWith {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2,4,22,245,345,220);
//		String string = "Bhusan";
//		System.out.println(string.charAt(string.length()-1));
		List<Integer> startsWith2 = list.stream().filter(e->e.toString().startsWith("2")).collect(Collectors.toList());
		System.out.println(startsWith2);
	}
}
