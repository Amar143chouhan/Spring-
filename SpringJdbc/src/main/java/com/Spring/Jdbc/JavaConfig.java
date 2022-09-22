package com.Spring.Jdbc;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.JdbcDao.StudentDao;
import com.JdbcDao.StudentDaoImpl;

@Configuration
@ComponentScan(basePackages = {"com.JdbcDao"})
public class JavaConfig {
    
	@Bean(name={"ds"})
	public DataSource getDataSource() {

		DriverManagerDataSource ds = new DriverManagerDataSource();

		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/springjdbc");
		ds.setUsername("root");
		ds.setPassword("root");

		return ds;

	}

	@Bean(name={"jdbcTemplate"})
	public JdbcTemplate getTemplate() {
		
		JdbcTemplate jdbcTemplate=new JdbcTemplate();
		jdbcTemplate.setDataSource(getDataSource());
		

		return jdbcTemplate;
	}
	/*@Bean(name={"studentDao"})
   public StudentDao getStudentDao() {
	
	   StudentDaoImpl dao =new StudentDaoImpl();
	   
	   dao.setJdbcTemplate(getTemplate());
	   
	   return dao;
	   
	   
	   
   }
   */
}
