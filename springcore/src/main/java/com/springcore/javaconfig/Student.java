package com.springcore.javaconfig;

import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

/*@Component("st")  
*/
// without using @Component annotations
public class Student
{
	private Samosa samosa;
	
	
	public Samosa getSamosa() {
		return samosa;
	}


	public void setSamosa(Samosa samosa) {
		this.samosa = samosa;
	}

	

	public Student(Samosa samosa) 
	{
		super();
		this.samosa = samosa;
	}


	public void disp()
	{
		//System.out.println("Hello,We are not using here xml file for configuration insted of we are using annotations... ");
		this.samosa.show();
		System.out.println("Hello,We are not using @component annotation.. ");
	}
}
