package com.LifeCycle.Springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestLifecycle {

	public static void main(String[] args) {
		
		 
	   AbstractApplicationContext context =new ClassPathXmlApplicationContext("com/LifeCycle/Springcore/LifeCycleConfig.xml");
	    
	//    Product p=(Product)context.getBean("product");
	  
	  //  Item it=(Item)context.getBean("item");
		
	     Example ex= (Example)context.getBean("example");

	     
	     System.out.println(ex);
	  //  System.out.println(it);
	    //System.out.println(p);
	    
	 context.registerShutdownHook();

	}

}
