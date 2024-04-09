package com.java8;

import java.util.Optional;

import com.java8.interfaces.Interface1;
import com.java8.interfaces.Interface2;

public class DimondProblemWithDefaultMethodInterface implements Interface1,Interface2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DimondProblemWithDefaultMethodInterface obj1 = new DimondProblemWithDefaultMethodInterface();
		int squareWithOverriden = obj1.squareOfNum(5);
		int squareWithInterf1 = obj1.squarewithInterf1(5);
		int squareWithInterf2 = obj1.squarewithInterf2(5);
		
		System.out.println(squareWithOverriden);
		System.out.println(squareWithInterf1);
		System.out.println(squareWithInterf2);
	}

	private int squarewithInterf2(int i) {
		// TODO Auto-generated method stub
		return Interface2.super.squareOfNum(i);
	}

	private int squarewithInterf1(int i) {
		// TODO Auto-generated method stub
		return Interface1.super.squareOfNum(i);
	}

	@Override
	public int squareOfNum(int num) {
		// TODO Auto-generated method stub
		return Interface1.super.squareOfNum(num);
	}

}
