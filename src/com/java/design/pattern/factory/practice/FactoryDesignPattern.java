package com.java.design.pattern.factory.practice;

public class FactoryDesignPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProfessionFactory p = new ProfessionFactory();
		Profession profession = p.getProfession("engineer");
		profession.printProfession();
	}

}
