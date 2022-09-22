package com.Spring.Jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.JdbcDao.StudentDao;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	ApplicationContext context=new  ClassPathXmlApplicationContext("com/Spring/Jdbc/Config.xml");
    
    	StudentDao dao =context.getBean("studentdao",StudentDao.class);
    	
		/*
		 * Student student=new Student();
		 * 
		 * student.setName("vijay"); student.setCity("delhi"); student.setId(1025);
		 * 
		 * int result= dao.insert(st);
		 * 
		 */  
    	
    }
    	}
