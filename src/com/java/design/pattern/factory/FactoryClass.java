package com.java.design.pattern.factory;

public class FactoryClass {
	public Profession printProfession(String profession) {
		if(profession.equalsIgnoreCase("engineer")) {
			return new Engineer();
		}
		if(profession.equalsIgnoreCase("teacher")) {
			return new Teacher();
		}
		return null;
	}
}
