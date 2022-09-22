package com.JdbcDao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class RowMappeImpl implements RowMapper<Student> {

	
	 public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
	  
	  
	  Student st=new Student();
	  
	  //setting values of student attribute from resultset object to student object
	 // & return student object st.setId(rs.getInt(1)); st.setName(rs.getString(2));
	  st.setCity(rs.getString(3)); return st; }
	 
}
