package com.Spring.AutoWire;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {

	private Address address;

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}

	public Address getAddress() {
		return address;
	}

	public Employee(Address address) {
		super();
		this.address = address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	}
	
	
	


