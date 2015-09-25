/**
 *
 */
package com.teddygu.tree.spring.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @author Rupen
 *
 */
@Component
@Aspect
public class AOPImplementation {

	@Before("execution(* com.teddygu.tree.spring.aop.AOPOperation.display(..))")
	public void msgAdvice(JoinPoint joinPoint){
		System.out.println("AOPImplementation.msgAdvice() method invoked");
		System.out.println("join point name : " + joinPoint.getSignature().getName());
	}

	@After("execution(* com.teddygu.tree.spring.aop.AOPOperation.*(..))")
	public void msgAdviceAfter(JoinPoint joinPoint){
		System.out.println("AOPImplementation.msgAdviceAfter() method invoked");
		System.out.println("join point name : " + joinPoint.getSignature().getName());
	}

	@AfterReturning(pointcut="execution(* com.teddygu.tree.spring.aop.AOPOperation.*(..))", returning="result")
	public Object msgAdviceAfterReturning(JoinPoint joinPoint, Object result){
		System.out.println("hijacked : " + joinPoint.getSignature().getName());
		System.out.println("Method returned value is : " + result);
		return result;
	}

	@AfterThrowing(pointcut="execution(* com.teddygu.tree.spring.aop.AOPOperation.*(..))", throwing="error")
	public void msgAdviceAfterThrowing(JoinPoint joinPoint, Throwable error){
		System.out.println("hijacked : " + joinPoint.getSignature().getName());
		System.out.println("Method returned value is : " + error);
	}
//
//	@Around("execution(* com.teddygu.tree.spring.aop.AOPOperation.*(..))")
//	public void msgAdviceAround(JoinPoint joinPoint, Throwable error){
//		System.out.println("hijacked : " + joinPoint.getSignature().getName());
//		System.out.println("Method returned value is : " + error);
//	}
}
