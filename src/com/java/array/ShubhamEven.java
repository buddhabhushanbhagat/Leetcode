package com.java.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ShubhamEven {

	 public static void main(String[] args) {
	        // Example ArrayList
	        List<Integer> numbers = new ArrayList<>();
	        numbers.add(0);
	        numbers.add(-2);
	        numbers.add(3);
	        numbers.add(4);
	        numbers.add(5);
	        numbers.add(6);

	        // Reverse even numbers
	        reverseEven(numbers);

	        // Print the modified ArrayList
	        System.out.println("Modified ArrayList: " + numbers);
	    }

	    public static void reverseEven(List<Integer> numbers) {
	        List<Integer> evenNumbers = new ArrayList<>();
	        List<Integer> reverseList = new ArrayList<>();
	      int n = 23456;
	        // Iterate through the ArrayList and extract even numbers
	        for (Integer num : numbers) {
	            if (num % 2 == 0) {
	                evenNumbers.add(num);
	            }
	        }

	     for(int i= evenNumbers.size()-1; i >= 0 ;i--) {
	    	 reverseList.add(evenNumbers.get(i));
	     }

	        // Replace even numbers in the original list with reversed even numbers
	       System.out.println(reverseList);
	    }

}
