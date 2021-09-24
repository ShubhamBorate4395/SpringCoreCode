package com.springcore.spring.jdbc.dao;

import java.util.List;

import com.springcore.spring.jdbc.entity.Student;

public interface StudentDao {
	public int insert(Student student);
	public int change(Student student);
	//public int delete(Student student);
	public int delete(int studentId);
	public Student getStudent(int studentId);
	public List<Student> getAllStudent();
}
