package com.org;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringClass {

	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
		Employee emp = (Employee) context.getBean("employeeBean");
		emp.dispEmpData();
	}

}
