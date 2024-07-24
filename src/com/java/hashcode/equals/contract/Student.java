package com.java.hashcode.equals.contract;

import java.util.Objects;

public class Student {
	private Integer id;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

	public Student(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	// @Override
//	public int hashCode() {
//		System.out.println("Hashcode: "+id);
//		return id;
//	}

//	@Override
	public boolean equals(Student s1) {

		if (id == s1.getId()) {
			System.out.println("is equals: true");

			return true;
		}
		System.out.println("is equals: false");

		return false;
	}

}
