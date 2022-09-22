package com.JdbcDao;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import com.JdbcDao.StudentDao;
import com.Spring.Jdbc.JavaConfig;

/**
 * Hello world!
 *
 */
public class TestDao 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
    
    	StudentDao dao =context.getBean("studentDao",StudentDao.class);
    	 
    	//for selecting all students records
    	
    	List<Student> list = dao.getAllStudents();
    	
    	for(Student st: list) {
    		
    		System.out.println(st);
    		
    		
    	
		/*for single record selection
		 * Student student = dao.getstudent(1023);
		 * 
		 * System.out.println(student);
		 *//*
		 *
		 *
		 * System.out.println("enter student id "); Scanner sc =new Scanner(System.in);
		 * int id =sc.nextInt(); System.out.println("enter student city"); String name=
		 * sc.next(); System.out.println("enter student name"); String name1= sc.next();
		 * 
		 * 
		 * 
		 * Student st1=new Student();
		 * 
		 * st1.setId(id); st1.setCity(name); st1.setName(name1);
		 * 
		 * int i = dao.insert(st1);
		 */	
   // 	System.out.println(i + "record inserted successfully");
		/*
		 * dao.delete(st1);
	System.out.println("record deleted successfully");
			 */	
    	
		
		/*
		 * Student student=new Student();
		 * 
		 * student.setName("salman"); student.setCity("karachi"); student.setId(1018);
		 * 
		 * 
		 * dao.insert(student);
		 */	
    	/*Student student1=new Student();
    	student1.setName("vivek"); 
    	student1.setCity("pune"); 
    	student1.setId(1023);
		
    	int result = dao.update(student1);
         
    	System.out.println( result+"record updated successfully");
        
    	Student st =new Student();
    	st.setId(1010);
    	dao.delete(st);
     */
    }
    }}
