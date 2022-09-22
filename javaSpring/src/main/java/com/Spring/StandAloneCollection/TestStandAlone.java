package com.Spring.StandAloneCollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStandAlone {

	public static void main(String[] args) {
		
		
		ApplicationContext context =new ClassPathXmlApplicationContext("com/Spring/StandAloneCollection/StdAlnCollectionConfig.xml");
		Person per= (Person) context.getBean("person1");    
		
		System.out.println(per.getFriends());
		   
	}

}
