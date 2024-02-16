package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortNumbers {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(11,2,4,7,8,16,5,9,56,79,108,15);
		
		List<Integer> sortedNumbers = list.stream().sorted().collect(Collectors.toList());
		System.out.println("in ascending order:  "+sortedNumbers);
		List<Integer> descendingNumbers = list.stream().sorted((a,b)->b.compareTo(a)).collect(Collectors.toList());
		System.out.println("in descending order:  "+descendingNumbers);
		syso
		
		
		
	}
}
