package com.java;

public class MultipleInheritanceWithInterface implements InterfaceA,InterfaceB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleInheritanceWithInterface inheritanceWithInterface = new MultipleInheritanceWithInterface();
		inheritanceWithInterface.m1();
		inheritanceWithInterface.m2();
	}

	public void m1() {
		// TODO Auto-generated method stub
		InterfaceA.super.m1();
	}
	public void m2() {
		// TODO Auto-generated method stub
		InterfaceB.super.m1();
	}

}
