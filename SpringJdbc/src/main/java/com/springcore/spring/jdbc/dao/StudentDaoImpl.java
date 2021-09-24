package com.springcore.spring.jdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.springcore.spring.jdbc.entity.Student;

public class StudentDaoImpl implements StudentDao {
	private JdbcTemplate jdbctemplate;

	@Override
	public int insert(Student student) {
		String query = "insert into student (id,name,city) values (?,?,?)";
		int r = this.jdbctemplate.update(query, student.getId(), student.getName(), student.getCity());
		return r;
	}

	public JdbcTemplate getJdbctemplate() {
		return jdbctemplate;
	}

	public void setJdbctemplate(JdbcTemplate jdbctemplate) {
		this.jdbctemplate = jdbctemplate;
	}

}
