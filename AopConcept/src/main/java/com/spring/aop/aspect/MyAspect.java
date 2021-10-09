package com.spring.aop.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect 
{
	//if parameter pass to method then we req to pass parameter here also 
	//first * denote accept all datatype
	
	@Before("execution(* com.spring.aop.services.PaymentServiceImpl.makePayment(..))")
	public void printBefore()
	{
		System.out.println("Payment processing...");
	}
	
	@After("execution(* com.spring.aop.services.PaymentServiceImpl.makePayment(..))")
	public void printAfter()
	{
		System.out.println("Payment done!!");
	}
}
