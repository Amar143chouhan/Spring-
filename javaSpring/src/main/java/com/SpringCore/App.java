package com.SpringCore;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
    	
    
    
    ApplicationContext context =new ClassPathXmlApplicationContext("com/SpringCore/Config.xml");
    
    Student student =(Student) context.getBean("Student1");
    Student student1 =(Student) context.getBean("Student2");
     
  //  System.out.println(student.getStudentId()+":"+student.getStname()+""+student.getAddress());
    
    System.out.println(student);
    System.out.println(student1);
    
    }
}
