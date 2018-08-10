package com.wind.s10;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LogAop {
//	@Pointcut("execution(public void get*(..))")	// public void인 모든 get메소드(클래스.메소드
//	@Pointcut("execution(* com.wind.sp10.*.*())")	// com.wind.sp10 패키지에 파라미터가 없는 모든 메소드
//	@Pointcut("execution(* com.wind.sp10..*.*())")	// com.wind.sp10 패키지 & com.wind.sp10 하위 패키지에 파라미터가 없는 모든 메소드
//	@Pointcut("execution(* com.wind.sp10.Worker.*())")	// com.wind.sp10.Worker 안의 모든 메소드

//	@Pointcut("within(com.wind.sp10.*)")	//com.wind.sp10 패키지 안에 있는 모든 메소드(클래스가 들어가)
//	@Pointcut("within(com.wind.sp10..*)")  //com.wind.sp10 패키지 및 하위 패키지 안에 있는 모든 메소드
//	@Pointcut("within(com.wind.sp10.Worker)") //com.wind.sp10.Worker 모든 메소드

	// 	@Pointcut("bean(student)")	빈
	
	
//	@Pointcut("bean(student)")	//student 빈에만 적용
	 @Pointcut("within(com.wind.s10.*)")//
	private void pointcutMethod() {
	}
	 
  @Around("pointcutMethod()")
	public Object loggerAop(ProceedingJoinPoint joinPoin) throws Throwable {
	//전처리
  
	String signatureStr= joinPoin.getSignature().toShortString();
	System.out.println(signatureStr+"is start");
	long st=System.currentTimeMillis();
	
	//핵심코드
	try {
	Object obj= joinPoin.proceed();
		return obj;
	}finally {
		//후처리
		long et= System.currentTimeMillis();
		System.out.println(signatureStr+"경과시간"+(et-st));
	}}


@Before("within(com.wind.s10.*)")
public void beforeAdvice(JoinPoint joinPoint) {
	System.out.println("##### beforeAdvice");
}
}	
	