package com.java.collection;

import java.util.Comparator;
import java.util.TreeSet;

public class InsertInTreeSetDesc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Comparator<String> c = (a,b) -> {
			return -b.compareTo(a);
		};
		TreeSet<String> ts = new TreeSet<>(c);
	ts.add("bhushan");
	ts.add("shubham");
	ts.add("nikhil");
	ts.add("aman");
	
		System.out.println(ts);
	}

}
