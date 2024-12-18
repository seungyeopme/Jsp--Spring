package com.springbook.biz.common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Service;

@Service
@Aspect
public class BeforeAdvice {
	
	@Before("PointcutCommon.allPointcut()")
	public void beforeLog(JoinPoint jp) {
		//System.out.println("[사전 처리] 비즈니스 로직 수행 전 동작");
		String method = jp.getSignature().getName();
		Object[] args = jp.getArgs();
		
		System.out.println("[사전 처리] " + method  + 
		    "() 메소드 ARGS 정보 : " +args[0].toString());
	}
}
//@Pointcut("execution(* com.springbook.biz..*Impl.*(..))")
//public void allPointcut() {}


//@Before("allPointcut()")