package com.java8;

import java.util.Arrays;
import java.util.List;

public class NumberSquareAverage {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,10,20,30,15);
		
		double numberSquareAverage = list.stream().map(e->e*e).filter(e->e>100).mapToInt(e->e).average().getAsDouble();
		System.out.println("NumberSquareAverage in list greter than 100: "+numberSquareAverage);
	}
}
