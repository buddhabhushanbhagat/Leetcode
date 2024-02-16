package com.java8;

import java.util.Arrays;
import java.util.List;

public class SumOfNumbers {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(3,5,7,9,1);
		
		int count=0;
		int sum =  list.stream().mapToInt(e->e).sum();
		System.out.println(sum);
		}
}
