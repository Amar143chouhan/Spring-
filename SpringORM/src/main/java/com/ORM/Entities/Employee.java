package com.ORM.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Employee {

	@Id
	@Column(name = "Employee_id")
	private int Eid;

	@Column(name = "Employee_name")
	private String Ename;

	public int getEid() {
		return Eid;
	}

	public void setEid(int eid) {
		Eid = eid;
	}

	public String getEname() {
		return Ename;
	}

	public void setEname(String ename) {
		Ename = ename;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	@Column(name = "Employee_city")
	private String City;

	public Employee(int eid, String ename, String city) {
		super();
		Eid = eid;
		Ename = ename;
		City = city;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employee [Eid=" + Eid + ", Ename=" + Ename + ", City=" + City + "]";
	}

}
