package com.java8;

import java.util.Arrays;
import java.util.List;

public class MaxAndMinNumber {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(3,5,7,9,1);
		
		
		int min =  list.stream().mapToInt(e->e).min().getAsInt();
		int max =  list.stream().mapToInt(e->e).max().getAsInt();
		System.out.println("min and max are: "+min+","+max);
		}
}
