package com.springcore.spring.jdbc.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.springcore.spring.jdbc.entity.Student;

public class StudentDaoImpl implements StudentDao {
	private JdbcTemplate jdbctemplate;

	@Override
	public int insert(Student student) {
		String query = "insert into student (id,name,city) values (?,?,?)";
		int r = this.jdbctemplate.update(query, student.getId(), student.getName(), student.getCity());
		return r;
	}
	
	@Override
	public int change(Student student) 
	{
		String query = "update student set name= ? , city=? where id =?";
	    int r = this.jdbctemplate.update(query,student.getName(),student.getCity(),student.getId());
		return r;
	}
	
	/*@Override       // First Way
	public int delete(Student student)
	{
		String query= "delete from student where id =?";
		int r=this.jdbctemplate.update(query,student.getId());
		return r;
	}*/
	
	@Override // Second Way
	public int delete(int studentId) 
	{
		String query= "delete from student where id =?";
	    int r=this.jdbctemplate.update(query,studentId);
	    return r;
	}
	
	@Override
	public Student getStudent(int studentId) 
	{
		String query="select * from student where id= ?";
		RowMapper<Student> rowMapper = new RowMapperImpl();
		Student student=this.jdbctemplate.queryForObject(query, rowMapper, studentId);
		return student;
	}
	
	@Override
	public List<Student> getAllStudent() 
	{
		String query="select * from student";
		List<Student> students=this.jdbctemplate.query(query, new RowMapperImpl());
		return students;
	}
	

	public JdbcTemplate getJdbctemplate()
	{
		return jdbctemplate;
	}

	public void setJdbctemplate(JdbcTemplate jdbctemplate) {
		this.jdbctemplate = jdbctemplate;
	}

	

	

	

	
	

	

}
