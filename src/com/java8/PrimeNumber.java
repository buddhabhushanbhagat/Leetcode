package com.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PrimeNumber {

	public static void main(String[] args) {
//		int num = 57;
//		boolean isPrime = isPrimeNumber(num);
//		System.out.println("Prime:"+isPrime);

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 20);
		List<Integer> primeNumbers = isPrimeNumberBYJava8(numbers);
		System.out.println("Prime:"+primeNumbers);
	}

	private static List<Integer> isPrimeNumberBYJava8(List<Integer> numbers) {
		// TODO Auto-generated method stub
List<Integer> primNumbersList = numbers.stream()
		return primNumbersList;
	}

	private static boolean isPrimeNumber(int num) {
		// TODO Auto-generated method stub

		if (num == 1)
			return false;
		for (int i = 2; i < num / 2; i++) {
			if (num % i == 0) {
				return false;
			}
		}

		return true;
	}
}
