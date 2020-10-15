package co.soft.advisor;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Advisor {
	
	@Before("execution(* method1())")
	public void beforeMethod() {
		System.out.println("before");
	}
	@After("execution(* method1())")
	public void afterMethod() {
		System.out.println("after");
	}
	@Around("execution(* method1())")
	public Object aroundMethod(ProceedingJoinPoint p) throws Throwable {
		System.out.println("around");
		Object r = p.proceed();
		System.out.println("around");
		return r;
	}
	@AfterReturning("execution(* method1())")
	public void afterReturningMethod() {
		System.out.println("afterreturn");
	}
	@AfterThrowing("execution(* method1())")
	public void afterThrowingMethod() {
		System.out.println("afterthrow");
	}
}