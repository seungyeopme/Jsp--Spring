package co.soft.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

//Scope 때문에 싱글톤 x
@Component
@Lazy
public class Test5 {
	public Test5() {
		System.out.println("test5");
	}
	
	@PostConstruct
	public void init() {
		System.out.println("init");
	}
	@PreDestroy
	public void destroy() {
		System.out.println("destroy");
	}
}
