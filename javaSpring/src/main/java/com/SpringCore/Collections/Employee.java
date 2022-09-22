package com.SpringCore.Collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Employee {
	
	private String EmpName;
	
	private List<String> phone;
     
	private Properties pro;
	
	public Properties getPro() {
		return pro;
	}

	public void setPro(Properties pro) {
		this.pro = pro;
	}

	

	@Override
	public String toString() {
		return "Employee [EmpName=" + EmpName + ", phone=" + phone + ", pro=" + pro + ", address=" + address
				+ ", course=" + course + "]";
	}

	public Employee(String empName, List<String> phone, Properties pro, Set<String> address,
			Map<String, String> course) {
		super();
		EmpName = empName;
		this.phone = phone;
		this.pro = pro;
		this.address = address;
		this.course = course;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getEmpName() {
		return EmpName;
	}

	public void setEmpName(String empName) {
		EmpName = empName;
	}

	public List<String> getPhone() {
		return phone;
	}

	public void setPhone(List<String> phone) {
		this.phone = phone;
	}

	public Set<String> getAddress() {
		return address;
	}

	public void setAddress(Set<String> address) {
		this.address = address;
	}

	public Map<String, String> getCourse() {
		return course;
	}

	public void setCourse(Map<String, String> course) {
		this.course = course;
	}

	private Set<String> address;
	
	private Map<String,String> course;
	
	
	
	

}
