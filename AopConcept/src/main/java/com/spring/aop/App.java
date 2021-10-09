package com.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.aop.services.PaymentService;

public class App 
{
    public static void main( String[] args )
    {
        /*System.out.println( "Hello World!" );*/
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/aop/aopConfig.xml");
    	PaymentService paymentObject= context.getBean("payment",PaymentService.class);
    	
    	paymentObject.makePayment(1200);
    }
}
