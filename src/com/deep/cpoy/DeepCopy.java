package com.deep.cpoy;

public class DeepCopy {

	public static void main(String[] args) throws CloneNotSupportedException {
		StudentDeep s1 = new StudentDeep(1, "nikhil");
		ClassDeep c1 = new ClassDeep(11, s1);

		ClassDeep deepcopy = (ClassDeep) c1.clone();

		// before setting ClassNo in c1
		System.out.println(c1.getClassNo());
		System.out.println("deeopcopy obj:" + deepcopy.getClassNo());

		c1.setClassNo(2);

		// After
		System.out.println("deeopcopy obj:" + deepcopy.getClassNo());
		System.out.println("c1 obj:" + c1.getClassNo());

		// before setting name in s1
		System.out.println(c1.getStudentDeep().getName());
		System.out.println("deeopcopy obj:" + deepcopy.getStudentDeep().getName());

		s1.setName("Nikhil");

		// after setting name in s1
		System.out.println(c1.getStudentDeep().getName());
		System.out.println("deeopcopy obj:" + deepcopy.getStudentDeep().getName());

	}
}
