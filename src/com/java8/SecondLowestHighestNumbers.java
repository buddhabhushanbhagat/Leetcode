package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SecondLowestHighestNumbers {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(3,5,7,9,1);
		
//		int count=0;
//		int sum =  list.stream().mapToInt(e->e).sum();
//		System.out.println(sum);
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter sequence number");
	int num = sc.nextInt();
	System.out.println("Enter name");
	sc.nextLine();
	String name = sc.nextLine();
	System.out.println("Enter height in foot");
	double height = sc.nextDouble();
	
	System.out.println("num:"+num);
	System.out.println("name:"+name);
	System.out.println("height:"+height);
	
	}
}
