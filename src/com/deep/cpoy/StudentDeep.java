package com.deep.cpoy;

public class StudentDeep implements Cloneable{
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
		return "StudentDeep [id=" + id + ", name=" + name + "]";
	}
	public StudentDeep(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
	
}
