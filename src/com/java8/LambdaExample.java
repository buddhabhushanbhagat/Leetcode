package com.java8;

import com.java8.interface1.Interface1;

public abstract class LambdaExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interface1 i = (n) -> n*n;
		
		System.out.println(i.squareOfNum(9));
	}

}
