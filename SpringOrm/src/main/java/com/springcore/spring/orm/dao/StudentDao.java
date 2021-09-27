package com.springcore.spring.orm.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.springcore.spring.orm.entities.Student;

public class StudentDao {
	private HibernateTemplate hibernateTemplate;

	// save student
	@Transactional
	public int insert(Student student) {
		// insert
		int i = (int) this.hibernateTemplate.save(student);
		return i;
	}

	// get the single object
	public Student getStudent(int stId) {
		Student student = this.hibernateTemplate.get(Student.class, stId);
		return student;
	}

	// get all object
	public List<Student> getAllStudent() {
		List<Student> student = this.hibernateTemplate.loadAll(Student.class);
		return student;
	}

	// deleting the object
	@Transactional
	public void removeStudent(int stId) {
		Student student = this.hibernateTemplate.get(Student.class, stId);
		this.hibernateTemplate.delete(student);
	}

	// updating the object
	@Transactional
	public void updateStudent(Student updateStudent) {
		this.hibernateTemplate.update(updateStudent);
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
}
