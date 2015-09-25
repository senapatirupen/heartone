/**
 *
 */
package com.teddygu.tree.spring.aop;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

/**
 * @author Rupen
 *
 */
@Component
@Aspect
public class AOPLogImplementation {

	private final Log log = LogFactory.getLog(this.getClass());

	@Around("execution(* com.teddygu.tree.spring.aop.AOPOperation.logDisplay(..))")
	public Object logTimeMethod(ProceedingJoinPoint joinPoint) throws Throwable{
		StopWatch stopWatch = new StopWatch();
		stopWatch.start();

		Object retriveValue = joinPoint.proceed();

		stopWatch.stop();

		StringBuffer logMessage = new StringBuffer();
		logMessage.append(joinPoint.getTarget().getClass().getName());
		logMessage.append(".");
		logMessage.append(joinPoint.getSignature().getName());
		logMessage.append("(");
		// appends arguments
		Object[] args = joinPoint.getArgs();
		for(int i=0; i < args.length; i++){
			logMessage.append(args[i]).append(",");
		}
		if(args.length > 0){
			logMessage.deleteCharAt(logMessage.length() - 1);
		}
		logMessage.append(")");
		logMessage.append(" execution time: ");
		logMessage.append(stopWatch.getLastTaskTimeMillis());
		logMessage.append(" ms");
		log.info(logMessage.toString());

		return retriveValue;
	}
}
