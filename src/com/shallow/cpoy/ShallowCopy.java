package com.shallow.cpoy;

public class ShallowCopy {

	
	public static void main(String[] args) {
		Student s1 = new Student(1,"nikhil");
		Class c1 = new Class(11, s1);
		Class c2 = c1;
		
		Student s2 = new Student(2,"Bhushan");
		System.out.println(c1.getStudent());

		c2.setStudent(s2);
		
//		System.out.println(c1.getStudent()+":" +c1.getStudent().hashCode());

		System.out.println(c1.getStudent());
		
		Student s3 = new Student(3,"shubham");
		c1.setStudent(s3);

		System.out.println(c2.getStudent());
	}
}
