package com.springcore.spring.orm.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student_details")
public class Student {
	@Id
	@Column(name = "student_id")
	private int stId;

	@Column(name = "student_name")
	private String stName;

	@Column(name = "student_city")
	private String stCity;

	public Student(int stId, String stName, String stCity) {
		super();
		this.stId = stId;
		this.stName = stName;
		this.stCity = stCity;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getStId() {
		return stId;
	}

	public void setStId(int stId) {
		this.stId = stId;
	}

	public String getStName() {
		return stName;
	}

	public void setStName(String stName) {
		this.stName = stName;
	}

	public String getStCity() {
		return stCity;
	}

	public void setStCity(String stCity) {
		this.stCity = stCity;
	}

	@Override
	public String toString() {
		return "Student [stId=" + stId + ", stName=" + stName + ", stCity=" + stCity + "]";
	}

}
