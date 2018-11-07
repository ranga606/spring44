package com.rs.aop;


import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectBefore {

	// this is where we add all of our related advices for logging
	
	// let's start with an @Before advice

	@Before("execution(public void getMessage())")
	public void beforeAddAccountAdvice() {
		System.out.println("\n=====>>> Executing @Before advice on addAccount()");
	}
	
	@After("execution(public void getMessage())")
	public void afterAddAccountAdvice() {
		System.out.println("\n=====>>> Executing @after advice on addAccount()");
	}
	
	@Around("execution(public void getMessage())")
	public void aroundAddAccountAdvice() {
		System.out.println("\n=====>>> Executing @around advice on addAccount()");
	}
	
	
}
