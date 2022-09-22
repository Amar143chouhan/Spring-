package com.AnnoConfig.Spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfigFile {
	
	@Bean
	public Student1 getStudent() {
		
		Student1 student=new Student1();
		
		return student;
		}
	
	

}
