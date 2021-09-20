package com.org;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestClass
{

	
	public static void main(String[] args) 
	{  
	    Resource r=new ClassPathResource("SpringConfig.xml");  
	    BeanFactory factory=new XmlBeanFactory(r);  
	      
	    Employee e1=(Employee)factory.getBean("e2");  
	    e1.dispInfo();  
	    
	   /* ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
	    
		Employee emp =(Employee) context.getBean("e2");
	    emp.dispInfo();*/
	}  

}
