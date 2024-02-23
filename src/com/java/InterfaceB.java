package com.java;

public interface InterfaceB {
	default public void m1() {
		System.out.println("m1() of InterfaceB called");
	}
}
