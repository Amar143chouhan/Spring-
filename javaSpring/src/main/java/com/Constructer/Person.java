package com.Constructer;

public class Person {
	
	
	
	private String name;
	private int personid;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(String name, int personid) {
		super();
		this.name = name;
		this.personid = personid;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", personid=" + personid + "]";
	}

}
