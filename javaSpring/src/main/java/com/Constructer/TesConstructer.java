package com.Constructer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.TestRef.A;

public class TesConstructer {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/Constructer/CIConfig.xml");

		Person p=(Person)context.getBean("person");
		
		System.out.println(p);
		
		Addition ad=(Addition)context.getBean("add");
		ad.doSum();		
		
	//	System.out.println(ad);
		

	}

}
