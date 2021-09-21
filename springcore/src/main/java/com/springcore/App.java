package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       // System.out.println( "Hello World!" );
        AbstractApplicationContext context =new ClassPathXmlApplicationContext("config.xml");
    	Samosa s1=(Samosa) context.getBean("s1");
    	context.registerShutdownHook();
    	System.out.println(s1);
    }
}
