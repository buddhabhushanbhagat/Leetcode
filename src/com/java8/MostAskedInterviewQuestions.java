package com.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MostAskedInterviewQuestions {

	public static void main(String[] args) {
//		1) Given a list of integers, separate odd and even numbers?
		List<Integer> listOfIntegers = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);
		List<Integer> oddIntegers = listOfIntegers.stream().filter(i -> i % 2 != 0).collect(Collectors.toList());
		List<Integer> evenIntegers = listOfIntegers.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println("Odd:" + oddIntegers);
		System.out.println("Even:" + evenIntegers);

//		2) How do you remove duplicate elements from a list using Java 8 streams?
		List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");
		List<String> uniqueElements = listOfStrings.stream().distinct().collect(Collectors.toList());
		System.out.println("uniqueElements:" + uniqueElements);

//		3) How do you find frequency of each character in a string using Java 8 streams?
		String inputString = "Java Concept Of The Day";
		Map<Character, Long> map1 = inputString.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(c -> c, Collectors.counting()));
		Map<Character, Long> map2 = inputString.chars().mapToObj(c -> (char) c).filter(e -> e != ' ')
				.map(e -> e.toLowerCase(e)).collect(Collectors.groupingBy(c -> c, Collectors.counting()));
		System.out.println(map1);

//		4) How do you find frequency of each element in an array or a list?
		List<String> stationeryList = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler",
				"Note Book", "Pencil");
		Map<String, Long> map = stationeryList.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(map);

//      5) How do you sort the given list of decimals in reverse order?
		List<Double> decimalList = Arrays.asList(12.45, 23.58, 17.13, 42.89, 33.78, 71.85, 56.98, 21.12);
		List<Double> sortedDecimalList = decimalList.stream().sorted(Collections.reverseOrder())
				.collect(Collectors.toList());
		List<Double> sortedDecimalList2 = decimalList.stream().sorted(Comparator.reverseOrder())
				.collect(Collectors.toList());
		System.out.println(sortedDecimalList);

//		6) Given a list of strings, join the strings with ‘[‘ as prefix, ‘]’ as suffix and ‘,’ as delimiter?
		List<String> listOfStrings1 = Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");
		String joinedString = listOfStrings1.stream().collect(Collectors.joining(",", "[", "]"));
		System.out.println(joinedString);

//      7) From the given list of integers, print the numbers which are multiples of 5?
		List<Integer> listOfIntegers1 = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
		List<Integer> multipleOf5 = listOfIntegers1.stream().filter(e -> e % 5 == 0).collect(Collectors.toList());
		System.out.println(multipleOf5);

//      8) Given a list of integers, find maximum and minimum of those numbers?
		List<Integer> listOfIntegers2 = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
		Integer max1 = listOfIntegers2.stream().mapToInt(e -> e).max().getAsInt();
		Integer max2 = listOfIntegers2.stream().max((a, b) -> a.compareTo(b)).get();
		Integer min1 = listOfIntegers2.stream().min((a, b) -> a.compareTo(b)).get();
		Integer min2 = listOfIntegers2.stream().mapToInt(e -> e).min().getAsInt();

		System.out.println("max with 2 way:" + max1 + "," + max2);
		System.out.println("max with 2 way:" + min1 + "," + min2);

//      9) How do you merge two unsorted arrays into single sorted array using Java 8 streams?
		int[] a = new int[] { 4, 2, 7, 1 };
		int[] b = new int[] { 8, 3, 9, 5 };
		int[] c1 = IntStream.concat(IntStream.of(a), IntStream.of(b)).sorted().toArray();
		int[] c2 = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().toArray();
		System.out.println(Arrays.toString(c1));
		System.out.println(Arrays.toString(c2));

//		10) How do you merge two unsorted arrays into single sorted array without duplicates?
		int[] a1 = new int[] { 4, 2, 5, 1 };
		int[] b1 = new int[] { 8, 1, 9, 5 };

		int[] merged = IntStream.concat(Arrays.stream(a1), Arrays.stream(b1)).sorted().distinct().toArray();
		int[] merged1 = IntStream.concat(IntStream.of(a1), IntStream.of(b1)).sorted().distinct().toArray();
		System.out.println(Arrays.toString(merged));
		System.out.println(Arrays.toString(merged1));

//		11) How do you get three maximum numbers and three minimum numbers from the given list of integers?
		List<Integer> listOfIntegers3 = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
		List<Integer> firstThreeMax = listOfIntegers3.stream().sorted(Comparator.reverseOrder()).distinct().limit(3)
				.collect(Collectors.toList());
		List<Integer> firstThreeMin = listOfIntegers3.stream().sorted().distinct().limit(3).toList();
		System.out.println("firstThreeMax:" + firstThreeMax);
		System.out.println("firstThreeMin:" + firstThreeMin);

//		12) Java 8 program to check if two strings are anagrams or not?
		String s1 = "RaceCar";
		String s2 = "CarRace";
		s1 = Stream.of(s1.split("")).map(e -> e.toLowerCase()).sorted().collect(Collectors.joining());
		s2 = Stream.of(s2.split("")).map(e -> e.toLowerCase()).sorted().collect(Collectors.joining());
		if (s1.equals(s2)) {
			System.out.println("Anagram:" + true);
		} else
			System.out.println("Anagram:" + false);

//		13) Find sum of all digits of a number in Java 8?
		int i = 15623;
		int sum1 = Stream.of(String.valueOf(i).split("")).map(e -> Integer.parseInt(e)).mapToInt(e -> e).sum();
		int sum2 = Stream.of(String.valueOf(i).split("")).collect(Collectors.summingInt(e -> Integer.parseInt(e)));
		System.out.println(sum1);
		System.out.println(sum2);

//		14) Find second largest number in an integer array?
		List<Integer> listOfIntegers4 = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
		int secondLargest = listOfIntegers4.stream().sorted(Comparator.reverseOrder()).distinct().skip(1).findFirst()
				.get();
		System.out.println("second largest:" + secondLargest);

//		**15) Given a list of strings, sort them according to increasing order of their length?
		List<String> listOfStrings2 = Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "C");
		List<String> sortedWithLength = listOfStrings2.stream().sorted(Comparator.comparing(String::length)).toList();
//        List<String> sortedWithLength = listOfStrings2.stream().sorted((a,b)->a.length()-b.length()).collect(Collectors.toList());
		System.out.println(sortedWithLength);

//		**16) Given an integer array, find sum and average of all elements?
		int[] a2 = new int[] { 45, 12, 56, 15, 24, 75, 31, 89 };
		int sum = Arrays.stream(a2).sum();
		int summ = IntStream.of(a2).sum();
		double avg = Arrays.stream(a2).average().getAsDouble();
		double avgg = IntStream.of(a2).average().getAsDouble();
		System.out.println("Sum with two ways:" + sum + "," + summ);
		System.out.println("Avg with two ways:" + avg + "," + avgg);

//		17) How do you find common elements between two arrays?
		List<Integer> list1 = Arrays.asList(71, 21, 34, 89, 56, 28);
		List<Integer> list2 = Arrays.asList(12, 56, 17, 21, 94, 34);
		List<Integer> common = list1.stream().filter(e -> list2.contains(e)).collect(Collectors.toList());
		System.out.println(common);

//		**18) Reverse each word of a string using Java 8 streams?
		String str = "Java Concept Of The Day";
		String revString = Arrays.stream(str.split(" ")).map(c -> new StringBuilder(c).reverse())
				.collect(Collectors.joining(" "));
		System.out.println(revString);

//       19) How do you find sum of first 10 natural numbers?
		int sumOf10Num = IntStream.rangeClosed(1, 10).sum();
		System.out.println(sumOf10Num);

//       20) Reverse an integer array
		int[] array = new int[] { 5, 1, 7, 3, 9, 6 };
		int[] revArray = IntStream.range(0, array.length).map(e -> array[array.length - 1 - e]).toArray();
		System.out.println(Arrays.toString(revArray));

//       21) Print 1 to 10 even numbers
		int[] oneTo10EvenNum = IntStream.range(1, 11).filter(e -> e % 2 == 0).toArray();
		System.out.println(Arrays.toString(oneTo10EvenNum));

//       21) Print first 10 even numbers
		int[] first10EvenNum = IntStream.range(1, 11).map(e -> e * 2).toArray();
		System.out.println(Arrays.toString(first10EvenNum));

//       22) How do you find the most repeated element in an array?
		List<String> listOfStrings3 = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Pen", "Note Book",
				"Pencil");
		Map<String, Long> mostRepeatedWordMap = listOfStrings3.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(mostRepeatedWordMap);
		Entry<String, Long> eS = mostRepeatedWordMap.entrySet().stream().max(Map.Entry.comparingByValue()).get();
		System.out.println(eS.getKey() + ":" + eS.getValue());
	}

}
