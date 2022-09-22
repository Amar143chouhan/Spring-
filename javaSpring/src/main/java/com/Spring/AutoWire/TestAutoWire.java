package com.Spring.AutoWire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutoWire {

	public static void main(String[] args) {
		
		
		
		ApplicationContext context =new ClassPathXmlApplicationContext("com/Spring/AutoWire/AutoConfig.xml");
	    
        Employee emp1 =context.getBean("Emp",Employee.class);
        
        System.out.println(emp1);
	}

}
