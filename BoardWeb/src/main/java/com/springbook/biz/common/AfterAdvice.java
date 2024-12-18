package com.springbook.biz.common;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Service;

@Service
@Aspect
public class AfterAdvice {

	@After("PointcutCommon.allPointcut()")//@After("allPointcut()")
	public void finallyLog() {
		System.out.println("[사후 처리] 비즈니스 로직 수행 후 무조건 동작");
	}
}
//@Pointcut("execution(* com.springbook.biz..*Impl.*(..))")
//public void allPointcut() {
//}