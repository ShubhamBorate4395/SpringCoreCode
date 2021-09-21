package com.springcore.standalone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{

	public static void main(String[] args) 
	{
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("com/springcore/standalone/standaloneConfig.xml");
		
		Person ps =context.getBean("p1",Person.class);
		System.out.println(ps);
		System.out.println("-----------------------------------------");
		System.out.println(ps.getFriends());
		System.out.println(ps.getFriends().getClass().getName());
		System.out.println("-----------------------------------------");
		System.out.println(ps.getFees());
		System.out.println(ps.getFees().getClass().getName());
		System.out.println("-----------------------------------------");
		System.out.println(ps.getProperty());
	}

}
