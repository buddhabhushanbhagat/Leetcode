package com.java.design.pattern.factory;

public class FactoryPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Profession profession1 = new Engineer();
//		Profession profession2 = new Teacher();
		FactoryClass factoryClass = new FactoryClass();
		Profession profession1 = factoryClass.printProfession("teacher");
		Profession profession2 = factoryClass.printProfession("engineer");
		profession1.printProfession();

	}

}
