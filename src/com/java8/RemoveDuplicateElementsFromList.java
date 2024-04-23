package com.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicateElementsFromList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(1,2,3,3,4,6,4,7,6);
		List<Integer> uniqueList = removeDuplicate(list);
		System.out.println(uniqueList);
		
	}

	private static List<Integer> removeDuplicate(List<Integer> list) {
		// TODO Auto-generated method stub
		List<Integer> uniqueList = list.stream().distinct().collect(Collectors.toList());
		return uniqueList;
	}

}
