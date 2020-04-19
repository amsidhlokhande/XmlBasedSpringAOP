package com.amsidh.mvc.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class LoggingAspect {

	public void beforeMethodAdvice() {
		System.out.println("beforeMethodAdvice is called");
	}

	public void afterMethodAdvice() {
		System.out.println("afterMethodAdvice is called");
	}

	public void aroundMethodAdvice() {
		System.out.println("aroundMethodAdvice is called");
	}

	public void afterThrowAdvice(JoinPoint joinPoint, Throwable ex) {
		System.out.println("afterThrowAdvice is called");
		System.out.println("additional concern");
		System.out.println("Method Signature: " + joinPoint.getSignature());
		System.out.println("Exception is: " + ex);
		System.out.println("end of after throwing advice...");
	}

	public void afterReturningAdvice(JoinPoint joinPoint, Object result) {
		System.out.println("afterReturningAdvice is called");
		System.out.println("additional concern");
		System.out.println("Method Signature: " + joinPoint.getSignature());
		System.out.println("Result in advice: " + result);
		System.out.println("end of after returning advice...");
	}

	public void methodWhichTakeStringAsArgs(String str) {
		System.out.println("methodWhichTakeStringAsArgs is called and arg value is :" + str);
	}
}
