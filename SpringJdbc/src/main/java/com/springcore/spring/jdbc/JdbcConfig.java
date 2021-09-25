package com.springcore.spring.jdbc;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.springcore.spring.jdbc.dao.StudentDao;
import com.springcore.spring.jdbc.dao.StudentDaoImpl;

@Configuration
public class JdbcConfig 
{
	@Bean(name={"ds"})
	public DataSource getDataSource()
	{
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.jdbc.mysql.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/springjdbc");
		ds.setUsername("root");
		ds.setPassword("");
		return ds;
		
	}
	@Bean(name={"jdbcTemplate"})
	public JdbcTemplate getJdbctemplate()
	{
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(getDataSource());
		return jdbcTemplate;
	}
	
	@Bean(name={"studentDao"})
	public StudentDao getStudentDao()
	{
		StudentDaoImpl studentDaoImpl = new StudentDaoImpl();
		studentDaoImpl.setJdbctemplate(getJdbctemplate());
		return studentDaoImpl ;
	}
}
