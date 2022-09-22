package com.JdbcDao;

import java.util.List;

public interface StudentDao {
	
	
	public int insert(Student student);
	public int update(Student student);
	public int delete(int studentid );
	public Student getstudent(int studentid);		
	public List<Student> getAllStudents();

}
