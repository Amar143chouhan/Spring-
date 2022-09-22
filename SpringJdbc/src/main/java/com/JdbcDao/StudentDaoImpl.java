package com.JdbcDao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

@Component("studentDao")
public class StudentDaoImpl implements StudentDao {

	public int insert(Student student) {

		// query for insert operation
		String query = "insert into student(id,sname,city)values(?,?,?)";

		int r = this.jdbcTemplate.update(query, student.getId(), student.getName(), student.getCity());
		return r;
	}
    @Autowired
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

//updating student record

	public int update(Student student) {

		String query = "update student set sname=?, city=? where id=?";

		int r = this.jdbcTemplate.update(query, student.getName(), student.getCity(), student.getId());

		return r;
	}

	public int delete(int student) {

		String query = "delete from student where id=?";

		int r = this.jdbcTemplate.update(query, student);

		return r;
	}

	public Student getstudent(int studentid) {

		String query = "select * from student where id=?";

		RowMapper<Student> rowMapper = new RowMappeImpl();
		
		//for fetching a single student we use QueryForObject 

		Student student = this.jdbcTemplate.queryForObject(query, rowMapper, studentid);

		return student;
	}

	public List<Student> getAllStudents() {
		
		String query = "select * from student";
		
		List<Student> list = this.jdbcTemplate.query(query,new RowMappeImpl());
		
		return list;
	}

}
