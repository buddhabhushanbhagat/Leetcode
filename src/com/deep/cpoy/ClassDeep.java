package com.deep.cpoy;

public class ClassDeep implements Cloneable {
	private Integer classNo;
	private StudentDeep student;

	public ClassDeep(Integer classNo, StudentDeep student) {
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

	public StudentDeep getStudentDeep() {
		return student;
	}

	public void setStudentDeep(StudentDeep student) {
		this.student = student;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		ClassDeep cloned = (ClassDeep) super.clone();
		cloned.setStudentDeep((StudentDeep)cloned.getStudentDeep().clone());
		return cloned;
	}
}
