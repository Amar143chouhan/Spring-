package com.springg.Stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Spring.AutoWireAnnotation.Employee;

public class Test {
	
	public static void main(String[] args) {
		
ApplicationContext context =new ClassPathXmlApplicationContext("com/springg/Stereotype/StereoConfig.xml");
	    
        Student st =context.getBean("student",Student.class);
        Student st1 =context.getBean("student",Student.class);
        Teacher t1 =context.getBean("teacher",Teacher.class);
        Teacher t2 =context.getBean("teacher",Teacher.class);
          
      /*  System.out.println(st);
        System.out.println(st.getAddress());
        
        //for printing the collection class use by address attribute
        System.out.println(st.getAddress().getClass().getName());
		*/
        
        //by default the scope of the bean is singleton so it always return the same obj
        //that's y the hashocde of diff student obj are same 
	System.out.println(st.hashCode());
	System.out.println(st1.hashCode());
	System.out.println(t1.hashCode());
	System.out.println(t2.hashCode());
	}

}
