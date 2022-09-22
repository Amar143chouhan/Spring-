package com.SpringCore;

public class Student {
	
	private int StudentId;
	
	public int getStudentId() {
		return StudentId;
	}

	public void setStudentId(int studentId) {
		System.out.println("setting  student id");
		StudentId = studentId;
	}

	public String getStname() {
		return Stname;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setStname(String stname) {
		System.out.println("setting  student name");
		Stname = stname;
	}

	@Override
	public String toString() {
		return "Student [StudentId=" + StudentId + ", Stname=" + Stname + ", Address=" + Address + "]";
	}

	public Student(int studentId, String stname, String address) {
		super();
		StudentId = studentId;
		Stname = stname;
		Address = address;
	}

	public String getAddress() {
		return Address;
	}

    
	
    public void setAddress(String address) {
    	
    	System.out.println("setting  student address");
		Address = address;
	}

	private String Stname;
	
	private String Address;
	
	

}
