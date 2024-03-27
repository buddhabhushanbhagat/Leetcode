package com.java.collection;

import java.util.Comparator;
import java.util.TreeSet;

public class InsertInTreeSetDesc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> ts1 = new TreeSet<>();
		ts1.add("bhushan");
		ts1.add("shubham");
		ts1.add("nikhil");
		ts1.add("aman");

		System.out.println(ts1);

/////////////////////////////////////////////////////////

		Comparator<String> c = (a, b) -> {
			return b.compareTo(a);
		};
		TreeSet<String> ts2 = new TreeSet<>(c);
		ts2.add("bhushan");
		ts2.add("shubham");
		ts2.add("nikhil");
		ts2.add("aman");

		System.out.println(ts2);

	}

}
