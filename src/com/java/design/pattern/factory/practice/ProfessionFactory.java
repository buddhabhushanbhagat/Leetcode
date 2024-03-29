package com.java.design.pattern.factory.practice;

public class ProfessionFactory {
	public  Profession getProfession(String str) {
		if (str.equalsIgnoreCase("engineer")) {
			return new Engineer();
		} else if (str.equalsIgnoreCase("teacher")) {
			return new Teacher();
		}
		return null;
	}
}
