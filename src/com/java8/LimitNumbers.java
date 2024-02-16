package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LimitNumbers {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(3,5,7,9,1,  4,  2,8,5,0,1);
		
		List<Integer> first5Numbers =  list.stream().limit(5).skip(1).limit(4).collect(Collectors.toList());
		int first5NumbersSum =  list.stream().limit(5).mapToInt(e->e).sum();
		System.out.println(first5Numbers);
		System.out.println("first5NumbersSum:"+first5NumbersSum);
//		System.out.println("sum of 5 numbers:"+first5NumbersSum);
		}
}
