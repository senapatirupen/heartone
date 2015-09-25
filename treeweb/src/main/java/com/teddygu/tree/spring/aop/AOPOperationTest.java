package com.teddygu.tree.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOPOperationTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-aop-config.xml");
		AOPOperation aopOperation = (AOPOperation)context.getBean("aopOperation");
//		aopOperation.display();
		aopOperation.logDisplay();
	}
}
