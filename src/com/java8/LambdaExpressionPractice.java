package com.java8;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LambdaExpressionPractice {
	public int m1(int n) {
		return n + n;
	}

	public static void main(String[] args) {

		Functionalnterf fi = (n) -> n * n;
		int square = fi.squareRoot(6);
		System.out.println(square);

		Predicate<Integer> p1 = (n) -> n > 10;
		Predicate<Integer> p2 = (n) -> n % 2 == 0;

		// predicate joining
		Predicate p = p1.and(p2);
		System.out.println(p.test(10));

		// Function FI
		Function<String, Integer> f1 = (s) -> s.length();
		int length = f1.apply(" ");
		System.out.println(length + " is String length");

		// method reference by :: operator
		
		LambdaExpressionPractice lambdaExpressionPractice = new LambdaExpressionPractice();
		Function<Integer, Integer> fi2 = lambdaExpressionPractice::m1;
		int resultOfDCOperator = fi2.apply(7);
		System.out.println(resultOfDCOperator);
		
		//flatmap simple example
		
		List<Integer> l1 = Arrays.asList(2,4,6);
		List<Integer> l2 = Arrays.asList(12,14,16);
		List<Integer> l3 = Arrays.asList(22,24,26);
		
		Stream.of(l1,l2,l3).flatMap(list->list.stream()).forEach(i->System.out.println(i));

//		List<Integer> combineList = Stream.of(l1,l2,l3).flatMap(list->list.stream()).collect(Collectors.toList());
//		System.out.println(combineList);

	}
}
