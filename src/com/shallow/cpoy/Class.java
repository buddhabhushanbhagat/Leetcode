package com.shallow.cpoy;

public class Class {
	private Integer classNo;
	private Student student;
	public Class(Integer classNo, Student student) {
		super();
		this.classNo = classNo;
		this.student = student;
	}
	public Integer getClassNo() {
		return classNo;
	}
	public void setClassNo(Integer classNo) {
		this.classNo = classNo;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
}
