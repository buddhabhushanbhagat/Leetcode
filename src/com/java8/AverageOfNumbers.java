package com.java8;

import java.util.Arrays;
import java.util.List;

public class AverageOfNumbers {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(3,5,7,9,1);
		
		double averageOfNumbers = list.stream().mapToInt(e->e).average().getAsDouble();
		System.out.println("averageOfNumbers in list: "+averageOfNumbers);
	}
}
