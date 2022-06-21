package com.example.learn;

public class Branch {
	
	private String name;

	private Student s;
	
	
	public Student getS() {
		return s;
	}



	public void setS(Student s) {
		this.s = s;
	}



	public Branch() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Branch(String name, Student s) {
		super();
		this.name = name;
		this.s = s;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	@Override
	public String toString() {
		return "Branch [name=" + name + ", s=" + s + "]";
	}




	

	
	

}
