package com.AnnoConfig.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.SpringCore.Student;

public class TestConfig {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfigFile.class);

		Student1 stu = context.getBean("getStudent",Student1.class);

		stu.study();

		//context.close()

	}

}
