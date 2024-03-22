package com.java.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Tp {
	 int n =10;
	
	{
		System.out.println("instance block");
	}

	static {
		System.out.println("static block");
	}

	  void methodOne() {
		n=11;
		System.out.println("normal method:"+n);
	}

	// Driver class
		public static void main(String args[ ]) {
			  System.out.println("main method");
		        Tp t= new Tp();
		        t.methodOne();

	}
}