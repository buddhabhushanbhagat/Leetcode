package com.java;

public interface InterfaceA {
	default public void m1() {
		System.out.println("m1() of InterfaceA called");
	}
}
