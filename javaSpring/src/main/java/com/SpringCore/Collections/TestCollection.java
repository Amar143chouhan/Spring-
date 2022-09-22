package com.SpringCore.Collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCollection {

	public static void main(String[] args) {

	
	
		 ApplicationContext context =new ClassPathXmlApplicationContext("com/SpringCore/Collections/CollectionConfig.xml");
		    
		   Employee emp = (Employee) context.getBean("Emp1");
		   
		   System.out.println(emp.getEmpName());
		   System.out.println(emp.getAddress());
		   System.out.println(emp.getPhone());
		   System.out.println(emp.getPro());
		   System.out.println(emp.getCourse());
		   
	
	
	
	}

}
