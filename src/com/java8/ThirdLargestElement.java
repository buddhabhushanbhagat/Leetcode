package com.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ThirdLargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(1,3,5,7,8,8,6,10,9);
	 list.stream().sorted(Comparator.reverseOrder()).distinct().limit(3).skip(2).forEach(System.out::println);
	}
}
