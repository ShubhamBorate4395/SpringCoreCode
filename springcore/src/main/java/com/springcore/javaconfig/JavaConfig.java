package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
/*@ComponentScan(basePackages="com.springcore.javaconfig")*/ //here @component not using so this annotation not 
															//useful for scanning in whole package
public class JavaConfig 
{
	@Bean
	public Samosa getSamosa()
	{
		return new Samosa();
		
	}
	
	@Bean(name={"student", "temp", "con"})  //we use bean bydefault class ref name in mainclass
											//otherwise we change name as per our convinent like above
	public Student getStudent()
	{
		Student student = new Student(getSamosa()); 
		return student;
		
	}
}
