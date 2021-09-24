package com.springcore.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.springcore.spring.jdbc.dao.StudentDao;
import com.springcore.spring.jdbc.entity.Student;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Program Stareted...!!");
		// Template-> jdbcTemplate
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

		StudentDao studentDao = context.getBean("studentDao", StudentDao.class);

		Student student = new Student();
		student.setId(102);
		student.setName("Shubham");
		student.setCity("Indapur");

		int result = studentDao.insert(student);
		System.out.println(result + " records inserted successfully...!!");
	}
}
