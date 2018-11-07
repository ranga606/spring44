package com.rs.aop;

import org.springframework.stereotype.Component;

@Component("aopTestMain")
public class AOPtestMain {
	public void getMessage() {
		System.out.println("Hi this sample message");
	}
	
}
