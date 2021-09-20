package com.org;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {

	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
		Question question = (Question) context.getBean("questionBean");
		question.dispInfo();

	}

}
